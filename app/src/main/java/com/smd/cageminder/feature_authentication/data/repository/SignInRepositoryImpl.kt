package com.smd.cageminder.feature_authentication.data.repository

import com.smd.cageminder.feature_authentication.domain.repository.SignInRepository
import javax.inject.Inject

class SignInRepositoryImpl @Inject constructor() : SignInRepository {
    override fun onLocalLoginSuccess(username: String, password: String): Int {
        println("Congratulation! Login Successfully done!")
        return 1
    }

    override fun onGoogleLoginSuccess(): Int {
        TODO("Not yet implemented")
    }

    override fun onFacebookLoginSuccess(): Int {
        TODO("Not yet implemented")
    }

    override fun onLoginFail(): Int {
        println("Sorry! Login failed, Try again.")
        return 0
    }

}