package com.example.repte02_albert_garrido.ui.launchScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.repte02_albert_garrido.R
import com.example.repte02_albert_garrido.navigation.Routes


@Composable
fun LaunchScreen(viewModel: LaunchScreenViewModel = viewModel(), navController: NavController,
) {



    // UI del Launch Screen
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable.dragonball_daima_logo),
            contentDescription = "App Logo",
            modifier = Modifier.size(600.dp)
        )
        Button(
            onClick = {navController.navigate(Routes.Screen2.route)}
        ) {
            Text("Entrar")
        }

    }
}
