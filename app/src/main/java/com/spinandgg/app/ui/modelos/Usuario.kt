package com.spinandgg.app.ui.modelos

data class Usuario(
    var username: String,
    var email: String,
    var password: String,
    var balance: Double = 0.0,
    var bets: MutableList<Apuesta> = mutableListOf()
)
