package com.erwandy.framework.basic_mvvm.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.erwandy.framework.basic_mvvm.data.api.ApiHelper
import com.erwandy.framework.basic_mvvm.data.repository.MainRepository
import com.erwandy.framework.basic_mvvm.ui.main.viewmodel.MainViewModel

//Step 10
class ViewModelFactory(private val apiHelper: ApiHelper): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainViewModel::class.java)){
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw IllegalArgumentException("Unknown class name")
    }

}