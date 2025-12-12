package com.spinandgg.app.ui.vistas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.spinandgg.app.ui.componentes.AgregarNavBar

@Composable
fun CargarHome(navController: NavHostController) {

    Column(modifier = Modifier.fillMaxSize()) {
        // 1. Parte Superior: Negra (20%)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.12f)
                .background(Color.Black)
        ) {

            // Logo a la izquierda
            Image(
                painter = painterResource(id = com.spinandgg.app.R.drawable.logo),
                contentDescription = null,
                modifier = Modifier
                    .size(150.dp)
                    .align(Alignment.Center)
            )

            // Avatar a la derecha
            Image(
                painter = painterResource(id = com.spinandgg.app.R.drawable.avatar),
                contentDescription = "Icono derecho",
                modifier = Modifier
                    .size(80.dp)
                    .align(Alignment.CenterEnd) // Centrado vertical, pegado a la derecha
                    .padding(end = 16.dp)
            )

        }

        // 2. Parte Media: Azul (60%)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.8f) // Ocupa el 60% de la altura
                .background(Color(0xFF00d0337))
        ) {
            // Aquí irá el contenido principal o imagen
        }

        // 3. Parte Inferior: Negra (20%)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(0.12f) // Ocupa el 20% de la altura
                .background(Color.Black)
        ) {
            // Aquí puedes poner botones o información inferior
        }

        AgregarNavBar(navController)
    }
}



