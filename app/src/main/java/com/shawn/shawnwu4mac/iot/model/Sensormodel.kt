package com.shawn.shawnwu4mac.iot.model

/**
 * data class
 */
data class Sensormodel(
        var id : String,
        val macaddr : String,
        val data : String,
        val lat : String,
        val lng : String,
        val created_at : String,
        val updated_at : String

)