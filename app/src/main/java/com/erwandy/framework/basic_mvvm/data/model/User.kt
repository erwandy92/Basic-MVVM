package com.erwandy.framework.basic_mvvm.data.model

import com.google.gson.annotations.SerializedName

//Step 2
//data class User
data class User(

    @SerializedName("id")
    val id: Int = 0,

    @SerializedName("name")
    val name: String = "",

    @SerializedName("email")
    val email: String = "",

    @SerializedName("avatar")
    val avatar: String = ""

)