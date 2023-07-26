package com.smd.cageminder.feature_authentication.presentation.sign_in.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.smd.cageminder.ui.theme.Gray01
import com.smd.cageminder.ui.theme.interNormal

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun signInTextField(
    value: String,
    onValueChange: (String) -> Unit,
    placeHolderText: String,
    singleLine: Boolean = true,
    maxLines: Int = 1
) {
    Box(
        contentAlignment = Alignment.CenterStart,
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .clip(RoundedCornerShape(50.dp))
            .background(Color(0xFF262A34))
            .padding(start = 10.dp)

    ) {
        TextField(
            value = value,
            onValueChange = onValueChange,
            textStyle = TextStyle(
                fontSize = 16.sp,
                color = Color.White,
                fontFamily = interNormal
            ),
            singleLine = singleLine,
            maxLines = maxLines,
            placeholder = {
                Text(
                    text = placeHolderText,
                    color = Gray01,
                    fontSize = 16.sp,
                    fontFamily = interNormal
                )
            },
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(0.dp)
        )
    }
}