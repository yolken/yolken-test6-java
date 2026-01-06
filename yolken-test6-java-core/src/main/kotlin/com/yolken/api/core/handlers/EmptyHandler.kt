@file:JvmName("EmptyHandler")

package com.yolken.api.core.handlers

import com.yolken.api.core.http.HttpResponse
import com.yolken.api.core.http.HttpResponse.Handler

@JvmSynthetic internal fun emptyHandler(): Handler<Void?> = EmptyHandlerInternal

private object EmptyHandlerInternal : Handler<Void?> {
    override fun handle(response: HttpResponse): Void? = null
}
