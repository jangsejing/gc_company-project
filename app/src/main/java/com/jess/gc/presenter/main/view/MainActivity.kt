package com.jess.gc.presenter.main.view

import android.os.Bundle
import com.jess.gc.R
import com.jess.gc.common.base.BaseActivity
import com.jess.gc.databinding.MainActivityBinding
import com.jess.gc.presenter.main.viewmodel.MainViewModel

class MainActivity : BaseActivity<MainActivityBinding, MainViewModel>() {

    override val layoutRes: Int
        get() = R.layout.main_activity
    override val viewModelClass: Class<MainViewModel>
        get() = MainViewModel::class.java

    override fun initLayout() {

    }

    override fun onCreated(savedInstanceState: Bundle?) {

    }

}
