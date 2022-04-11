package com.example.comeiapoke.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Form {
    @SerializedName("url")
    @Expose
    var url: String? = null

    @SerializedName("name")
    @Expose
    var name: String? = null
}