package com.spinandgg.app.ui.modelos

data class Apuesta(
    val id: Int,
    var dineroApuesta: Double,
    var estado: EstadoApuesta,
    val categoria: String,
    val team1: String,
    val team2: String ,
    val apostadoresAFavor: Int,
    val apostadoresEnContra: Int
)