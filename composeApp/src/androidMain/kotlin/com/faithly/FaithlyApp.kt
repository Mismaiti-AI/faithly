package com.faithly

import android.app.Application
import co.touchlab.kermit.Logger

class FaithlyApp : Application() {
    override fun onCreate() {
        super.onCreate()

        Logger.withTag("FaithlyApp").d("onCreate")
    }
}