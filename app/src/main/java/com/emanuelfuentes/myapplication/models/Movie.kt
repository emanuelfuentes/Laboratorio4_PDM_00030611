package com.emanuelfuentes.myapplication.models

import android.media.Rating

data class Movie(
    val Title:String="N/A",
    val Year:String="N/A",
    val Released:String="N/A",
    val Runtime:String="N/A",
    val Genre:String="N/A",
    val Director:String="N/A",
    val Actors:String="N/A",
    var Plot:String="N/A",
    val Language:String="N/A",
    var imdbRating:String="N/A",
    val Poster:String="N/A"
)