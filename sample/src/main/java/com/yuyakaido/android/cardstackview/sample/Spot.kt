package com.yuyakaido.android.cardstackview.sample

data class Spot(
        val id: Long = counter++,
        val name: String,
        val company: String,
        val designation: String,
        val skill: String,
        val url: String
) {
    companion object {
        private var counter = 0L
    }
}
