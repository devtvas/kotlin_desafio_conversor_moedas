package com.example.comeiapoke.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Type {
    @SerializedName("slot")
    @Expose
    var slot: Int? = null

    @SerializedName("type")
    @Expose
    var type: Type__1? = null
}