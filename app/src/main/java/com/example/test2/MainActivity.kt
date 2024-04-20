package com.example.test2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.test2.ui.theme.Test2Theme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Test2Theme {
                val navController= rememberNavController()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ListssApp(navController)
                    NavHost(navController = navController, startDestination ="List"){
                        composable("list") { ListssApp(navController) }
                        composable("red_screen") { RedScreen(navController) }
                        composable("orange_screen") { OrangeScreen(navController) }
                        composable("yellow_screen") { YellowScreen(navController) }
                        composable("green_screen") { GreenScreen(navController) }
                        composable("light_blue_screen") { BlueScreen(navController) }
                        composable("blue_screen") { BlueDarkScreen(navController) }
                        composable("purple_screen") { VioletScreen(navController) }

                    }
                }
            }
        }
    }

}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Test2Theme {
      //  ListssApp(navController)
    }
}