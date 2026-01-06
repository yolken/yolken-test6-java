// File generated from our OpenAPI spec by Stainless.

package com.yolken.api.services.blocking

import com.yolken.api.core.ClientOptions
import com.yolken.api.core.RequestOptions
import com.yolken.api.core.handlers.errorBodyHandler
import com.yolken.api.core.handlers.errorHandler
import com.yolken.api.core.handlers.jsonHandler
import com.yolken.api.core.http.HttpMethod
import com.yolken.api.core.http.HttpRequest
import com.yolken.api.core.http.HttpResponse
import com.yolken.api.core.http.HttpResponse.Handler
import com.yolken.api.core.http.HttpResponseFor
import com.yolken.api.core.http.parseable
import com.yolken.api.core.prepare
import com.yolken.api.models.store.StoreListInventoryParams
import com.yolken.api.models.store.StoreListInventoryResponse
import com.yolken.api.services.blocking.store.OrderService
import com.yolken.api.services.blocking.store.OrderServiceImpl
import java.util.function.Consumer

class StoreServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StoreService {

    private val withRawResponse: StoreService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val orders: OrderService by lazy { OrderServiceImpl(clientOptions) }

    override fun withRawResponse(): StoreService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StoreService =
        StoreServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun orders(): OrderService = orders

    override fun listInventory(
        params: StoreListInventoryParams,
        requestOptions: RequestOptions,
    ): StoreListInventoryResponse =
        // get /store/inventory
        withRawResponse().listInventory(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StoreService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val orders: OrderService.WithRawResponse by lazy {
            OrderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StoreService.WithRawResponse =
            StoreServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun orders(): OrderService.WithRawResponse = orders

        private val listInventoryHandler: Handler<StoreListInventoryResponse> =
            jsonHandler<StoreListInventoryResponse>(clientOptions.jsonMapper)

        override fun listInventory(
            params: StoreListInventoryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StoreListInventoryResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("store", "inventory")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listInventoryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
