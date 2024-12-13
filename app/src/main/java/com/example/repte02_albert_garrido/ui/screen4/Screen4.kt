package com.example.repte02_albert_garrido.ui.screen4

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.repte02_albert_garrido.R

@Composable
fun Screen4(selectedImage: String, name: String) {
    Column {
        Image(
            painter = painterResource(id = when (selectedImage) {
                "supreme" -> R.drawable.supreme
                "goku" -> R.drawable.goku
                "vegeta" -> R.drawable.vegeta
                "piccolo" -> R.drawable.piccolo
                "gomah" -> R.drawable.gomah
                "masked_majin" -> R.drawable.masked_majin
                else -> R.drawable.supreme
            }),
            contentDescription = selectedImage,
            modifier = Modifier.size(200.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text("Name: $name")
    }
}