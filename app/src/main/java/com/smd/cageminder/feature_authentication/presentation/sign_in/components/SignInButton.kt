package com.smd.cageminder.feature_authentication.presentation.sign_in.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.smd.cageminder.ui.theme.Blue02
import com.smd.cageminder.ui.theme.interBold

@Composable
fun signInButton(
    text: String,
    onClick: () -> Unit,
    textColor: Color = Color.White,
    fontFamily: FontFamily = interBold,
    fontStyle: FontStyle = FontStyle.Normal,
    fontWeight: FontWeight = FontWeight.Bold,
    background: Color = Blue02
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .clip(RoundedCornerShape(50.dp))
            .background(background)
    ) {
        Text(
            text = text,
            color = textColor,
            fontFamily = fontFamily,
            fontStyle = fontStyle,
            fontWeight = fontWeight
        )
    }
}

@Composable
fun signInButtonWithIcon(
    text: String,
    onClick: () -> Unit,
    icon: Painter,
    contentDescription: String = "",
    tintColor: Color = Color.Unspecified,
    textColor: Color = Color.White,
    fontFamily: FontFamily = interBold,
    fontStyle: FontStyle = FontStyle.Normal,
    fontWeight: FontWeight = FontWeight.Bold,
    background: Color = Color.White
) {
    Button(
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Transparent
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .clip(RoundedCornerShape(50.dp))
            .background(background)
    ) {
        Icon(
            painter = icon,
            contentDescription = contentDescription,
            tint = tintColor
        )
        Spacer(modifier = Modifier.width(12.dp))
        Text(
            text = text,
            color = textColor,
            fontFamily = fontFamily,
            fontStyle = fontStyle,
            fontWeight = fontWeight
        )
    }
}