package com.example.mycomposeapplication.ui.mycomponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycomposeapplication.R

/**
 * Created by Nicola Luigi Piriottu on 22/06/22.
 */

@Composable
fun MyCircularImage() {
    Image(
        painter = painterResource(id = R.drawable.ic_image),
        contentDescription = "Circular Image",
        modifier = Modifier
            .size(200.dp)
            .clip(
                CircleShape
            )
            .border(
                width = 5.dp,
                color = Color.Cyan,
                shape = RoundedCornerShape(100.dp)/*CircleShape*/
            ).clipToBounds()
    )
}

@Composable
@Preview(showBackground = true)
fun MyCircularImagePreview() {
    MyCircularImage()
}