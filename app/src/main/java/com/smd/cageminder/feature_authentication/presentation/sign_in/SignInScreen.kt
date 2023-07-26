package com.smd.cageminder.feature_authentication.presentation.sign_in

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.smd.cageminder.R
import com.smd.cageminder.feature_authentication.presentation.sign_in.components.signInClickableText
import com.smd.cageminder.feature_authentication.presentation.sign_in.components.signInTextField
import com.smd.cageminder.ui.theme.Blue01
import com.smd.cageminder.ui.theme.Gray01
import com.smd.cageminder.ui.theme.interBold
import com.smd.cageminder.ui.theme.interNormal

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignInScreen(
    navController: NavController,
    viewModel: SignInViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    //val scaffoldState = rememberScaffoldState()
    //val scope = rememberCoroutineScope()

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF181A1F))
            .padding(16.dp)
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxSize()
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(
                    text = stringResource(id = R.string.welcome_back),
                    color = Color.White,
                    fontFamily = interBold,
                    fontSize = 24.sp
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    text = stringResource(id = R.string.please_sign_in_to_your_account),
                    color = Gray01,
                    fontSize = 15.sp,
                    fontFamily = interNormal
                )
                Spacer(modifier = Modifier.height(30.dp))
                signInTextField(
                    value = state.username,
                    onValueChange = { viewModel.onEvent(SignInEvent.SetUsername(it)) },
                    placeHolderText = stringResource(id = R.string.username)
                )
                Spacer(modifier = Modifier.height(12.dp))
                signInTextField(
                    value = state.password,
                    onValueChange = { viewModel.onEvent(SignInEvent.SetPassword(it)) },
                    placeHolderText = stringResource(id = R.string.password)
                )
                Spacer(modifier = Modifier.height(12.dp))
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    signInClickableText(
                        text = stringResource(id = R.string.forgot_password),
                        onClick = { viewModel.onEvent(SignInEvent.ForgotPassword) },
                        color = Gray01,
                        fontStyle = FontStyle.Italic
                    )
                }
                Spacer(modifier = Modifier.height(36.dp))
                Button(
                    onClick = {
                        viewModel.onEvent(SignInEvent.SignIn(state.username, state.password))
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .background(Color(0xFF5467FF))
                ) {
                    Text(
                        text = stringResource(id = R.string.sign_in),
                        color = Color.White,
                        fontFamily = interBold,
                    )
                }
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                Button(
                    onClick = {
                        viewModel.onEvent(SignInEvent.SignInWithGoogle)
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .background(Color.White)
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_google_logo),
                        contentDescription = "Google Button",
                        tint = Color.Unspecified
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = stringResource(id = R.string.sign_in_with_google),
                        color = Color(0xFF181A1F),
                        fontFamily = interBold,
                    )
                }
                Spacer(modifier = Modifier.height(12.dp))
                Button(
                    onClick = {
                        viewModel.onEvent(SignInEvent.SignInWithFacebook)
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(60.dp)
                        .clip(RoundedCornerShape(50.dp))
                        .background(Color(0xFF3A579B))
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_fb_logo),
                        contentDescription = "Facebook Button",
                        tint = Color.White
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Text(
                        text = stringResource(id = R.string.sign_in_with_facebook),
                        color = Color.White,
                        fontFamily = interBold,
                    )
                }
                Spacer(modifier = Modifier.height(16.dp))
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = stringResource(id = R.string.dont_have_an_account),
                        color = Color.White,
                        fontFamily = interNormal,
                        fontSize = 14.sp,
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    signInClickableText(
                        text = stringResource(id = R.string.sign_up),
                        color = Blue01,
                        onClick = { viewModel.onEvent(SignInEvent.SignUp) }
                    )
                }
            }
        }
    }
}