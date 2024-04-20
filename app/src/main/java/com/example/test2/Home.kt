package com.example.test2

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.test2.data.Datasource
import com.example.test2.model.CardContent
import com.example.test2.ui.theme.Test2Theme

@Composable
fun ListssApp(navController: NavHostController) {
    ColorList(
        affirmationList = Datasource().loadAffirmations(),
        navController = navController
    )
}

@Composable
fun ColorList(
    affirmationList: List<CardContent>,
    navController: NavController, // Add NavController as a parameter
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        items(affirmationList) { affirmation ->
            AffirmationCard(
                affirmation = affirmation,
                navController = navController,
            )
            Spacer(modifier = Modifier.height(5.dp))
        }
    }
}

@Composable
fun AffirmationCard(
    affirmation: CardContent,
    navController: NavController, // Add NavController as a parameter
    modifier: Modifier = Modifier
) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = affirmation.color,
        ),
        modifier = Modifier.fillMaxSize()
            .size(width = 240.dp, height = 50.dp)
            .clickable {
                when (affirmation.color) {
                    Color(0xFFFF0000) -> navController.navigate("red_screen")
                    Color(0xFFFF8A00) -> navController.navigate("orange_screen")
                    Color(0xFFEBFF00) -> navController.navigate("yellow_screen")
                    Color(0xFF00FF29) -> navController.navigate("green_screen")
                    Color(0xFF00F0FF) -> navController.navigate("light_blue_screen")
                    Color(0xFF1400FF) -> navController.navigate("blue_screen")
                    Color(0xFF9E00FF) -> navController.navigate("purple_screen")
                }
            }
    ) {
        Text(
            text = LocalContext.current.getString(affirmation.stringResourceId),
            modifier = Modifier
                .padding(16.dp),
            textAlign = TextAlign.Center,
        )
    }
}



