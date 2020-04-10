package com.jess.gc.common.di

import com.jess.gc.JessApplication
import com.jess.gc.common.di.module.ActivityModule
import com.jess.gc.common.di.module.AppModule
import com.jess.gc.common.di.module.NetworkModule
import com.jess.gc.common.di.module.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

/**
 * @author jess
 * @since 2020.04.10
 */
@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        ActivityModule::class,
        ViewModelModule::class,
        NetworkModule::class
//        , RepositoryModule::class
    ]
)

interface AppComponent : AndroidInjector<JessApplication> {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: JessApplication): AppComponent
    }

}