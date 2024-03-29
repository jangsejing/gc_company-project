package com.jess.gc.common.base

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

/**
 * @author jess
 * @since 2020.04.10
 */
abstract class BaseViewModel: ViewModel() {

    // progress
    protected val _isProgress = MutableLiveData<Boolean>()
    val isProgress: LiveData<Boolean> = _isProgress

    // IO Dispatchers
    val ioDispatchers: CoroutineContext = Dispatchers.IO

    // UI Dispatchers
    val uiDispatchers: CoroutineContext = Dispatchers.Main

}