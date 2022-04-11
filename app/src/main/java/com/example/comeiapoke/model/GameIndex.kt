package com.example.comeiapoke.model


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class GameIndex {
    @SerializedName("version")
    @Expose
    var version: Version? = null

    @SerializedName("game_index")
    @Expose
    var gameIndex: Int? = null
}