package com.erwandy.framework.basic_mvvm.utils

import android.util.Log

//Step 1.2
//To communicate the current state of Network Call to UI Layer
data class Resource<out T>(val status: Status, val data: T?, val message: String?) {

    companion object {

        fun <T> success(data: T?): Resource<T> {
            Log.d("Resource", "Success: "+data)
            return Resource(Status.SUCCESS, data, null)
        }

        fun <T> error(msg: String, data: T?): Resource<T> {
            Log.d("Resource", "Error: "+msg)
            return Resource(Status.ERROR, data, msg)
        }

        fun <T> loading(data: T?): Resource<T> {
            Log.d("Resource", "Loading: "+data)
            return Resource(Status.LOADING, data, null)
        }

    }

}