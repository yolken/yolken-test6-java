// File generated from our OpenAPI spec by Stainless.

package com.yolken.api.client

import com.yolken.api.core.ClientOptions
import com.yolken.api.core.getPackageVersion
import com.yolken.api.services.blocking.PetService
import com.yolken.api.services.blocking.PetServiceImpl
import com.yolken.api.services.blocking.StoreService
import com.yolken.api.services.blocking.StoreServiceImpl
import com.yolken.api.services.blocking.UserService
import com.yolken.api.services.blocking.UserServiceImpl
import java.util.function.Consumer

class YolkenTest6ClientImpl(private val clientOptions: ClientOptions) : YolkenTest6Client {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: YolkenTest6ClientAsync by lazy { YolkenTest6ClientAsyncImpl(clientOptions) }

    private val withRawResponse: YolkenTest6Client.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val pets: PetService by lazy { PetServiceImpl(clientOptionsWithUserAgent) }

    private val store: StoreService by lazy { StoreServiceImpl(clientOptionsWithUserAgent) }

    private val users: UserService by lazy { UserServiceImpl(clientOptionsWithUserAgent) }

    override fun async(): YolkenTest6ClientAsync = async

    override fun withRawResponse(): YolkenTest6Client.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): YolkenTest6Client =
        YolkenTest6ClientImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun pets(): PetService = pets

    override fun store(): StoreService = store

    override fun users(): UserService = users

    override fun close() = clientOptions.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        YolkenTest6Client.WithRawResponse {

        private val pets: PetService.WithRawResponse by lazy {
            PetServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val store: StoreService.WithRawResponse by lazy {
            StoreServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val users: UserService.WithRawResponse by lazy {
            UserServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): YolkenTest6Client.WithRawResponse =
            YolkenTest6ClientImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun pets(): PetService.WithRawResponse = pets

        override fun store(): StoreService.WithRawResponse = store

        override fun users(): UserService.WithRawResponse = users
    }
}
