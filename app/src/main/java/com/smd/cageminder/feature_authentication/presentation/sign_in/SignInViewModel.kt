package com.smd.cageminder.feature_authentication.presentation.sign_in

import android.util.Log
import com.smd.cageminder.core.BaseViewModel
import com.smd.cageminder.core.util.MLog
import com.smd.cageminder.feature_authentication.domain.repository.SignInRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class SignInViewModel @Inject constructor(
    private val repository: SignInRepository
) : BaseViewModel<SignInState, SignInEvent>() {
    private val mLog = MLog(SignInViewModel::class.simpleName.toString())

    //private val _state = MutableStateFlow(LoginState())
    //val state: StateFlow<LoginState> = _state

    override fun defaultState() = SignInState()
    override fun onEvent(event: SignInEvent) {
        when (event) {
            is SignInEvent.ForgotPassword -> {
                mLog.d("ForgotPassword Clicked")
            }

            is SignInEvent.SetPassword -> {
                _state.update {
                    it.copy(
                        password = event.password
                    )
                }
                mLog.d("Password: ${event.password}")
            }

            is SignInEvent.SetUsername -> {
                _state.update {
                    it.copy(
                        username = event.username
                    )
                }
                mLog.d("Username: ${event.username}")
            }

            is SignInEvent.SignIn -> {
                Log.d("ViewModel", "Sign In Clicked")
                signIn(event.username, event.password)

            }

            is SignInEvent.SignInWithFacebook -> {
                mLog.d("Facebook Clicked")
            }

            is SignInEvent.SignInWithGoogle -> {
                mLog.d("Google Clicked")
            }

            is SignInEvent.SignUp -> {
                mLog.d("SignUp Clicked")
            }
        }
    }

    private fun signIn(username: String, password: String) {
        if (!username.equals("sid", true)) {
            repository.onLoginFail()
            return
        }
        if (!password.equals("123", true)) {
            repository.onLoginFail()
            return
        }
        repository.onLocalLoginSuccess(username, password)
    }
}