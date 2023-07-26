package com.smd.cageminder.navigation

sealed class Screen(val route: String) {
    object SignInScreen: Screen("sign_in_screen")
    object SignUpScreen: Screen("sign_up_screen")
}
