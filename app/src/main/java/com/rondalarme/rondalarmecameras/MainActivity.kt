package com.rondalarme.rondalarmecameras

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rondalarme.rondalarmecameras.ui.screens.CameraListScreen
import com.rondalarme.rondalarmecameras.ui.screens.RegisterScreen
import com.rondalarme.rondalarmecameras.ui.theme.RondalarmeCamerasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RondalarmeCamerasTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) {
                    innerPadding ->

                    // R O U T E S

                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "main/{user}") {

                        composable("main/{user}") { entry ->
                            entry.arguments?.getString("user")?.let { user ->
                                // IF AUTH
                                MainScreen(
                                    modifier = Modifier.padding(innerPadding),
                                    user = user
                                )
                            } ?: LaunchedEffect(null) {
                                // ELSE
                                navController.navigate("register")
                            }
                        }

                        composable("register") {
                            RegisterScreen(navController = navController
//                                modifier = Modifier.padding(innerPadding)
//                                onRegisterScreenClick = {}
                            )
                        }
                        
                        composable("login") {
                            LoginScreen(
                                modifier = Modifier.padding(innerPadding)
//                                onLoginScreenClick = {}
                            )
                        }

                        composable("camera") {
                            CameraListScreen(
//                                modifier = Modifier.padding(innerPadding)
//                                onLoginScreenClick = {}
                            )
                        }

                    }
                }
            }
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier, user: String) {
    Text(
        text = "Hello World!",
        modifier = modifier
    )
}

//@Composable
//fun RegisterScreen(modifier: Modifier = Modifier) {
//    Text(
//        text = "Register",
//        modifier = modifier
//    )
//}



@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Text(
        text = "Login",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    RondalarmeCamerasTheme {

    }
}