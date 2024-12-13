package com.example.repte02_albert_garrido.navigation

sealed class Routes(val route: String) {
        data object Screen1 : Routes("screen1")
        data object Screen2 : Routes("screen2")
        data object Screen3 : Routes("screen3")
        data object Screen4 : Routes("screen4")

}