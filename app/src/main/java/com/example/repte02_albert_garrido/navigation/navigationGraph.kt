package com.example.repte02_albert_garrido.navigation

import Screen2ViewModel
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.repte02_albert_garrido.ui.launchScreen.LaunchScreen
import com.example.repte02_albert_garrido.ui.screen2.Screen2
import com.example.repte02_albert_garrido.ui.screen3.Screen3

@Composable
fun NavigationGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Routes.Screen1.route
    ) {
        composable(Routes.Screen1.route) {
            LaunchScreen(navController = navController)
        }
        composable(Routes.Screen2.route) {
            Screen2(navController = navController, viewModel = Screen2ViewModel())
        }
        composable(Routes.Screen3.route) {
            Screen3(navController = navController, selectedImage = "goku")
        }

    }
}
