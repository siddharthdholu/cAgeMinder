package com.smd.cageminder.feature_authentication.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.smd.cageminder.navigation.Navigation
import com.smd.cageminder.ui.theme.CAgeMinderTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CAgeMinderTheme {
                val navController = rememberNavController()
                Navigation(navController = navController)
            }
        }
    }
}