package com.jess.gc.common.extension

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * @author jess
 * @since 2020.04.10
 */
fun <T : ViewModel> AppCompatActivity.createViewModel(
    factory: ViewModelProvider.Factory,
    classType: Class<T>
): T = ViewModelProvider(this, factory)[classType]