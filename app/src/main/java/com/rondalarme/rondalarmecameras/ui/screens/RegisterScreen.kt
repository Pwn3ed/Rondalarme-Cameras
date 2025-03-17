package com.rondalarme.rondalarmecameras.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.rondalarme.rondalarmecameras.R

@Composable
fun RegisterScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.rondalarme_logo), contentDescription = "Login Image",
            Modifier.size(200.dp))

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Registrar", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Usuário")
        })

        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(value = "", onValueChange = {}, label = {
            Text(text = "Senha")
        })

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {
            navController.navigate("camera")
        }) {
            Text(text = "Enviar")
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Esqueci minha senha", Modifier.clickable {

        })

    }
}