package com.example.mycomposeapplication.ui.mylazycolumn

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycomposeapplication.R
import me.saket.swipe.SwipeAction
import me.saket.swipe.SwipeableActionsBox

/**
 * Created by Nicola Luigi Piriottu on 23/06/22.
 */


@Composable
fun MySwappableActionBox(person: Person?) {

    val delete = SwipeAction(
        onSwipe = { Log.d("niKO", "go to delete") },
        icon = {
            Icon(
                painter = painterResource(id = R.drawable.ic_google_logo),
                contentDescription = null,
                modifier = Modifier.padding(16.dp),
                tint = Color.White
            )
        },
        background = Color.Red,
    )


    SwipeableActionsBox(endActions = listOf(delete), swipeThreshold = 200.dp) {
        MySwappableItem(person)
    }
}

@Composable
private fun MySwappableItem(person: Person?) {

    //card
    Row(
        modifier = Modifier
            .background(MaterialTheme.colors.surface)
            .padding(horizontal = 16.dp)
            .padding(vertical = 8.dp)
    ) {
        //1 element
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(size = 50.dp))
                .background(MaterialTheme.colors.primary)
                .size(50.dp)
        )
        // space
        Spacer(modifier = Modifier.width(16.dp))

        //2 element
        Column(modifier = Modifier.weight(weight = 7f)) {
            // 1 sub element
            Text(
                text = person?.firstName ?: "",
                style = TextStyle(
                    fontSize = MaterialTheme.typography.h5.fontSize,
                    fontWeight = FontWeight.Bold
                )
            )
            // 2 sub element
            Text(text = person?.lastName?: "")
            // space
            Spacer(modifier = Modifier.height(8.dp))
            // 3 sub element
            Text(text = "Age: ${person?.age ?: ""}")
            // space
            Spacer(modifier = Modifier.height(8.dp))
        }

        //3 element
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(size = 50.dp))
                .background(MaterialTheme.colors.primary)
                .size(10.dp)
        )
    }
}

@Composable
@Preview(showBackground = true)
private fun MySwappableItemPreview() {
     MySwappableActionBox(null)
}
