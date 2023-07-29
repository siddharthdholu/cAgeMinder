package com.smd.cageminder.feature_authentication.presentation.sign_in.components

import androidx.compose.foundation.text.ClickableText
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.smd.cageminder.ui.theme.interNormal

@Composable
fun signInClickableText(
    text: String,
    onClick: (Int) -> Unit,
    color: Color,
    fontStyle: FontStyle = FontStyle.Normal,
    fontWeight: FontWeight = FontWeight.Normal,
    fontFamily: FontFamily = interNormal

) {
    ClickableText(
        onClick = onClick,
        text = AnnotatedString(text),
        style = TextStyle(
            fontSize = 14.sp,
            color = color,
            fontFamily = fontFamily,
            fontStyle = fontStyle,
            fontWeight = fontWeight
        )
    )
}