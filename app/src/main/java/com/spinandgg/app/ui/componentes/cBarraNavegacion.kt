package com.spinandgg.app.ui.componentes

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun AgregarNavBar(
    navController: NavHostController
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(
            text = "Home",
            color = Color.White,
            modifier = Modifier.clickable {
                navController.navigate("rutaHome") {
                    launchSingleTop = true
                }
            }
        )

        Text(
            text = "Buscar",
            color = Color.White,
            modifier = Modifier.clickable {
                navController.navigate("rutaListadoDeApuestas") {
                    launchSingleTop = true
                }
            }
        )

        Text(
            text = "Ajustes",
            color = Color.White,
            modifier = Modifier.clickable {
                navController.navigate("rutaSettings") {
                    launchSingleTop = true
                }
            }
        )
    }
}
