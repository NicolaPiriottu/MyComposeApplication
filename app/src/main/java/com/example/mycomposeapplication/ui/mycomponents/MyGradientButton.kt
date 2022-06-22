package com.example.mycomposeapplication


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycomposeapplication.ui.theme.Purple200
import com.example.mycomposeapplication.ui.theme.Teal200

/**
 * Created by Nicola Luigi Piriottu on 20/06/22.
 */
@Composable
fun MyGradientButton(
    text: String,
    textColor: Color,
    gradient: Brush,
    onClick: () -> Unit
) {

    Button(
        colors = ButtonDefaults.buttonColors(backgroundColor = androidx.compose.ui.graphics.Color.Transparent),
        contentPadding = PaddingValues(),
        onClick = { onClick() })
    {
        Box(
            modifier = Modifier
                .background(gradient)
                .padding(horizontal = 16.dp, vertical = 8.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(text = text, color = textColor)
        }
    }
}

@Preview
@Composable
private fun MyGradientButtonPreview() {
    MyGradientButton(
        text = "Button",
        textColor = Color.White,
        gradient = Brush.horizontalGradient(colors = listOf(Purple200, Teal200))
    ){}
}
