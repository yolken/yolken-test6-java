@file:JvmName("JsonHandler")

package com.yolken.api.core.handlers

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.yolken.api.core.http.HttpResponse
import com.yolken.api.core.http.HttpResponse.Handler
import com.yolken.api.errors.YolkenTest6InvalidDataException

@JvmSynthetic
internal inline fun <reified T> jsonHandler(jsonMapper: JsonMapper): Handler<T> =
    object : Handler<T> {
        override fun handle(response: HttpResponse): T =
            try {
                jsonMapper.readValue(response.body(), jacksonTypeRef())
            } catch (e: Exception) {
                throw YolkenTest6InvalidDataException("Error reading response", e)
            }
    }
