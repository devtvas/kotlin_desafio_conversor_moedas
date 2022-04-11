package com.example.comeiapoke.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Move {
    @SerializedName("version_group_details")
    @Expose
    var versionGroupDetails: List<VersionGroupDetail>? = null

    @SerializedName("move")
    @Expose
    var move: Move__1? = null
}