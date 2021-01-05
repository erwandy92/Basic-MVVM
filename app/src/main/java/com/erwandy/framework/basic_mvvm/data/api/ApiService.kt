package com.erwandy.framework.basic_mvvm.data.api

import com.erwandy.framework.basic_mvvm.data.model.User
import io.reactivex.Single

//Step 3.1
//an Interface for Api
interface ApiService {

    fun getUsers(): Single<List<User>>

}