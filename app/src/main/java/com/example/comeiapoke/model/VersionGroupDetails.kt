package com.example.comeiapoke.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class VersionGroupDetail {
    @SerializedName("move_learn_method")
    @Expose
    var moveLearnMethod: MoveLearnMethod? = null

    @SerializedName("level_learned_at")
    @Expose
    var levelLearnedAt: Int? = null

    @SerializedName("version_group")
    @Expose
    var versionGroup: VersionGroup? = null
}