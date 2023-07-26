package com.smd.cageminder.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun Navigation(
    navController: NavHostController
) {
    NavHost(
        navController = navController, startDestination = Screen.SignInScreen.route
    ) {
        signInComposable(navController, Screen.SignInScreen.route)

        signUpComposable(navController, Screen.SignUpScreen.route)
    }
}