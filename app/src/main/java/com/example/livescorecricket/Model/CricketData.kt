package com.example.livescorecricket.Model

data class CricketData(
    val apikey: String,
    val `data`: List<Data>,
    val info: Info,
    val status: String
)