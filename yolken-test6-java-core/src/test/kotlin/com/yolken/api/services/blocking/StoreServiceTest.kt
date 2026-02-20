// File generated from our OpenAPI spec by Stainless.

package com.yolken.api.services.blocking

import com.yolken.api.client.okhttp.YolkenTest6OkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class StoreServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun listInventory() {
        val client = YolkenTest6OkHttpClient.builder().apiKey("My API Key").build()
        val storeService = client.store()

        val response = storeService.listInventory()

        response.validate()
    }
}
