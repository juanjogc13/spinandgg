package com.spinandgg.app.ui.vistas

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.spinandgg.app.ui.componentes.AgregarNavBar
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CargarSettings(navController: NavHostController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFF2F2F2))
    ) {

        //header
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(70.dp)
                .background(Color.Black)
        ) {
            Image(
                painter = painterResource(id = com.spinandgg.app.R.drawable.logo),
                contentDescription = "",
                modifier = Modifier
                    .size(120.dp)
                    .align(Alignment.Center)
            )

        }

        //titulo
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(Color(0xFFEEEEEE))
        ) {
            Text(
                text = "Mi Cuenta",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.Center)
            )
        }

        //contenido
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(20.dp, 10.dp, 20.dp)
        ) {
            // Email estático
            Text(
                text = "Email: ...",
                fontWeight = FontWeight.Bold,
                fontSize = 18.sp,
            )

            // Subtítulo
            Text(
                text = "Datos de contacto",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            // Campo Email
            Text(text = "Email")
            TextField(
                value = email,
                onValueChange = { email = it },
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 20.dp)
                    .background(Color(0xFFE0E0E0) ,RoundedCornerShape(10.dp)),
                singleLine = true,
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                )
            )

            // Campo Contraseña
            Text(text = "Contraseña")
            TextField(
                value = password,
                onValueChange = { password = it },
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color(0xFFE0E0E0), RoundedCornerShape(10.dp)),
                singleLine = true,
                colors = TextFieldDefaults.colors(
                    focusedIndicatorColor = Color.Transparent,
                    unfocusedIndicatorColor = Color.Transparent,
                    disabledIndicatorColor = Color.Transparent,
                )

            )

            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(Color(0xFF2D00D4)),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .width(200.dp)
                    .height(50.dp)
                    .offset(y = (40).dp),
                shape = RoundedCornerShape(25.dp)
            ) {
                Text(
                    text = "Actualizar",
                    color = Color.White,
                    fontSize = 18.sp
                )
            }

            Column (
                modifier = Modifier
                    .padding(top = 20.dp)
            ) {
                Text(
                    text = "Cerrar Sesión",
                    color = Color(0xFF2D00D4),
                    fontSize = 16.sp,
                    textDecoration = TextDecoration.Underline,
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .offset(y = (60).dp)
                        .clickable {
                            navController.navigate("rutaHome") {
                                launchSingleTop = true
                            }
                        }
                )
            }
        }
        AgregarNavBar(navController)
    }
}