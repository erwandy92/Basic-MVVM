package com.erwandy.framework.basic_mvvm.data.repository

import com.erwandy.framework.basic_mvvm.data.api.ApiHelper
import com.erwandy.framework.basic_mvvm.data.model.User
import io.reactivex.Single

//Step 4
class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }

}