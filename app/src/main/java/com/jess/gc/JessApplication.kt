package com.jess.gc

import androidx.appcompat.app.AppCompatDelegate
import com.jess.gc.common.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import timber.log.Timber

/**
 * @author jess
 * @since 2020.04.10
 */
class JessApplication : DaggerApplication() {

    override fun onCreate() {
        super.onCreate()
        initTimber()
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
    }

    private fun initTimber() {
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.factory().create(this)
    }
}
