package com.example.test2

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import java.lang.reflect.Modifier

@Composable
fun GreenScreen(navController:NavController) {
    Box(
        modifier = androidx.compose.ui.Modifier
            .fillMaxSize()
            .background(Color(0xFF00FF29))
            .clickable {
                // Navigate back to the list screen
                navController.navigate("list")
            }
    ) {

    }
}