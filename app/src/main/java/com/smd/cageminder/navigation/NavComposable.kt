package com.smd.cageminder.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.smd.cageminder.core.BaseScreenWrapper
import com.smd.cageminder.feature_authentication.presentation.sign_in.SignInScreen
import com.smd.cageminder.feature_authentication.presentation.sign_in.SignInViewModel


fun NavGraphBuilder.signInComposable(
    navController: NavHostController,
    route: String = Screen.SignInScreen.route
) {
    composable(route = route) {
        val viewModel: SignInViewModel = hiltViewModel()
        BaseScreenWrapper(
            navController = navController,
            viewModel = viewModel
        ) {
            SignInScreen(
                navController = navController,
                viewModel = viewModel
            )
        }
    }
}

fun NavGraphBuilder.signUpComposable(
    navController: NavHostController,
    route: String = Screen.SignUpScreen.route
) {
    composable(route = route) {
        val viewModel: SignInViewModel = hiltViewModel()
        BaseScreenWrapper(
            navController = navController,
            viewModel = viewModel
        ) {
            SignInScreen(
                navController = navController,
                viewModel = viewModel
            )
        }
    }
}