package com.smd.cageminder.feature_authentication.presentation.sign_in

sealed interface SignInEvent {
    data class SetUsername(val username: String) : SignInEvent
    data class SetPassword(val password: String) : SignInEvent
    object ForgotPassword : SignInEvent
    data class SignIn(val username: String, val password: String) : SignInEvent
    object SignInWithGoogle : SignInEvent
    object SignInWithFacebook : SignInEvent

    object SignUp : SignInEvent
}