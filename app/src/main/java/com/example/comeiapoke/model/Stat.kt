package com.example.comeiapoke.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Stat {
    @SerializedName("stat")
    @Expose
    var stat: Stat__1? = null

    @SerializedName("effort")
    @Expose
    var effort: Int? = null

    @SerializedName("base_stat")
    @Expose
    var baseStat: Int? = null
}