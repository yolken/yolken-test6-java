// File generated from our OpenAPI spec by Stainless.

package com.yolken.api.services.async

import com.yolken.api.client.okhttp.YolkenTest6OkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class StoreServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun listInventory() {
        val client = YolkenTest6OkHttpClientAsync.builder().apiKey("My API Key").build()
        val storeServiceAsync = client.store()

        val responseFuture = storeServiceAsync.listInventory()

        val response = responseFuture.get()
        response.validate()
    }
}
