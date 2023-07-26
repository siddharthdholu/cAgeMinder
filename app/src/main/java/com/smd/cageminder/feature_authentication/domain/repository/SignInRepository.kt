package com.smd.cageminder.feature_authentication.domain.repository

interface SignInRepository {
    fun onLocalLoginSuccess(username: String, password: String): Int
    fun onGoogleLoginSuccess(): Int
    fun onFacebookLoginSuccess(): Int
    fun onLoginFail(): Int
}