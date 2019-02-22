package com.zhp.tools

import android.app.Application
import com.facebook.stetho.Stetho
import com.facebook.stetho.okhttp3.StethoInterceptor
import okhttp3.Interceptor
import tech.linjiang.pandora.Pandora

fun init(app: Application) {
    initPandora(app)
    initStetho(app)
}

/**
 * https://github.com/whataa/pandora
 */
fun initPandora(app: Application) {
//    Pandora.init(app)
}

/**
 * https://github.com/whataa/pandora
 */
fun initPandoraEnableShake(app: Application) {
    Pandora.get().disableShakeSwitch()
}

/**
 * https://github.com/facebook/stetho
 */
fun initStetho(app: Application) {
    Stetho.initializeWithDefaults(app)
}

fun openPandora() {
    Pandora.get().open()
}

fun closePandora() {
    Pandora.get().close()
}

fun getPandoraInterceptor(): Interceptor {
    return Pandora.get().interceptor
}

fun getStethoIntercepter(): Interceptor {
    return StethoInterceptor()
}