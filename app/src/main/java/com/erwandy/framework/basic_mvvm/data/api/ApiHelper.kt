package com.erwandy.framework.basic_mvvm.data.api

//Step 3.3
class ApiHelper (private val apiService: ApiService) {

    fun getUsers() = apiService.getUsers()

}