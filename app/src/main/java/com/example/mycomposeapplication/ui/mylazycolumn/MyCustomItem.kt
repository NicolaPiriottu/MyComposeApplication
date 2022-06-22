package com.example.mycomposeapplication.ui.mylazycolumn

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycomposeapplication.ui.theme.Typography

/**
 * Created by Nicola Luigi Piriottu on 21/06/22.
 */

@Composable
fun MyCustomItem(person: Person) {

    Row(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxWidth()
            .padding(24.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "${person.age}",
            color = Color.Black,
            fontSize = Typography.h4.fontSize,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = person.firstName,
            color = Color.Black,
            fontSize = Typography.h5.fontSize,
            fontWeight = FontWeight.Normal
        )

        Text(text = person.lastName, color = Color.Black, fontSize = Typography.h5.fontSize, fontWeight = FontWeight.Normal)

      /*  Text(
            text = person.firstName,
            color = Color.Black,
            fontSize = Typography.h5.fontSize,
            fontWeight = FontWeight.Normal
        )

        Text(text = person.lastName, color = Color.Black, fontSize = Typography.h5.fontSize, fontWeight = FontWeight.Normal)


        Text(
            text = person.firstName,
            color = Color.Black,
            fontSize = Typography.h5.fontSize,
            fontWeight = FontWeight.Normal
        )

        Text(text = person.lastName, color = Color.Black, fontSize = Typography.h5.fontSize, fontWeight = FontWeight.Normal)
*/
    }
}

@Composable
@Preview
private fun MyCustomItemPreview() {
    MyCustomItem(
        person = Person(
            id = 0,
            firstName = "Giovanni",
            lastName = "Doe",
            age = 20
        )
    )
}