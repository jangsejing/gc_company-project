package com.jess.gc.common.di.module

import androidx.lifecycle.ViewModelProvider
import com.jess.gc.common.di.ViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {
    @Binds
    abstract fun bindViewModelFactory(
        factory: ViewModelFactory
    ): ViewModelProvider.Factory
}
