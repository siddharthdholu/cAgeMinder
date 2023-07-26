package com.smd.cageminder.core.util

import android.util.Log

class MLog(private var TAG: String) {
    fun d(message: String, tag: String = TAG) {
        Log.d(tag, message)
    }

    fun i(message: String, tag: String = TAG) {
        Log.i(tag, message)
    }

    fun e(message: String, tag: String = TAG) {
        Log.e(tag, message)
    }
}