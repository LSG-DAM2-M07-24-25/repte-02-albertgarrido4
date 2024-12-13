package com.example.repte02_albert_garrido.ui.screen2

import Screen2ViewModel
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.repte02_albert_garrido.R
import com.example.repte02_albert_garrido.navigation.Routes
@Composable
fun Screen2(navController: NavController, viewModel: Screen2ViewModel) {
    val selectedImage by viewModel.selectedImage.observeAsState("")

    Column {
        Image(
            painter = painterResource(id = R.drawable.dragonball_daima_logo),
            contentDescription = "App Logo",
            modifier = Modifier.size(600.dp)
        )
        Spacer(modifier = Modifier.height(32.dp))
        Row {
            Image(
                painter = painterResource(id = R.drawable.supreme),
                contentDescription = "Supreme",
                modifier = Modifier.width(200.dp)
                    .clickable { viewModel.setSelectedImage("supreme") }
            )
            Image(
                painter = painterResource(id = R.drawable.goku),
                contentDescription = "Goku",
                modifier = Modifier.width(200.dp)
                    .clickable { viewModel.setSelectedImage("goku") }
            )
            Image(
                painter = painterResource(id = R.drawable.vegeta),
                contentDescription = "Vegeta",
                modifier = Modifier.width(200.dp)
                    .clickable { viewModel.setSelectedImage("vegeta") }
            )
        }
        Spacer(modifier = Modifier.height(32.dp))

        Row {
            Image(
                painter = painterResource(id = R.drawable.piccolo),
                contentDescription = "Piccolo",
                modifier = Modifier.width(200.dp)
                    .clickable { viewModel.setSelectedImage("piccolo") }
            )
            Image(
                painter = painterResource(id = R.drawable.gomah),
                contentDescription = "Gomah",
                modifier = Modifier.width(200.dp)
                    .clickable { viewModel.setSelectedImage("gomah") }
            )
            Image(
                painter = painterResource(id = R.drawable.masked_majin),
                contentDescription = "Masked Majin",
                modifier = Modifier.width(200.dp)
                    .clickable { viewModel.setSelectedImage("masked_majin") }
            )
        }
        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = { navController.navigate("nameInput/${selectedImage}") }
        ) {
            Text("Enviar")
        }
    }
}