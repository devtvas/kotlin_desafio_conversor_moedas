package com.example.comeiapoke.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Ability {
    @SerializedName("slot")
    @Expose
    var slot: Int? = null

    @SerializedName("is_hidden")
    @Expose
    var isHidden: Boolean? = null

    @SerializedName("ability")
    @Expose
    var ability: Ability__1? = null
}