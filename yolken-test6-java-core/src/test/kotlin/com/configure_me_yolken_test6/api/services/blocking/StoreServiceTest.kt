// File generated from our OpenAPI spec by Stainless.

package com.configure_me_yolken_test6.api.services.blocking

import com.configure_me_yolken_test6.api.TestServerExtension
import com.configure_me_yolken_test6.api.client.okhttp.YolkenTest6OkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class StoreServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun listInventory() {
        val client =
            YolkenTest6OkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val storeService = client.store()

        val response = storeService.listInventory()

        response.validate()
    }
}
