// File generated from our OpenAPI spec by Stainless.

package com.configure_me_yolken_test6.api.errors

import com.configure_me_yolken_test6.api.core.JsonValue
import com.configure_me_yolken_test6.api.core.http.Headers

abstract class YolkenTest6ServiceException
protected constructor(message: String, cause: Throwable? = null) :
    YolkenTest6Exception(message, cause) {

    abstract fun statusCode(): Int

    abstract fun headers(): Headers

    abstract fun body(): JsonValue
}
