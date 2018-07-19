package com.zhp.tools

import android.app.Application
import com.facebook.stetho.Stetho
import tech.linjiang.pandora.Pandora

fun init(app: Application) {
    initPandora(app)
    initStetho(app)
}

/**
 * https://github.com/whataa/pandora
 */
fun initPandora(app: Application) {
    Pandora.init(app).enableShakeOpen()
}

/**
 * https://github.com/facebook/stetho
 */
fun initStetho(app: Application) {
    Stetho.initializeWithDefaults(app)
}