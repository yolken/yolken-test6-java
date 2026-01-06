// File generated from our OpenAPI spec by Stainless.

package com.yolken.api.errors

import com.yolken.api.core.JsonValue
import com.yolken.api.core.http.Headers

abstract class YolkenTest6ServiceException
protected constructor(message: String, cause: Throwable? = null) :
    YolkenTest6Exception(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
