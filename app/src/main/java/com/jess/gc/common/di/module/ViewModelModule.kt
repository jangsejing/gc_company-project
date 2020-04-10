package com.jess.gc.common.di.module

import androidx.lifecycle.ViewModel
import com.jess.gc.common.di.qualifier.ViewModelKey
import com.jess.gc.presenter.main.viewmodel.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

/**
 * @author jess
 * @since 2020.04.10
 */
@Module(includes = [ViewModelFactoryModule::class])
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel

}