package com.example.mycomposeapplication.ui.mycomponents

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType

/**
 * Created by Nicola Luigi Piriottu on 16/06/22.
 */

@Composable
fun MyTextView() {
    Column(modifier = Modifier.fillMaxWidth()) {

        var text by remember { mutableStateOf("Type here ...") }
        var maxChar = 20
        //or TextField
        OutlinedTextField(
            value = text,
            onValueChange = { newText ->
                if (newText.length <= maxChar) {
                    text = newText
                }
            },
            label = { Text(text = "Title") },
            leadingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Filled.Email, contentDescription = "Email icon")
                }
            },
            trailingIcon = {
                IconButton(onClick = { Log.d("Niko", "clicked") }) {
                    Icon(imageVector = Icons.Filled.Check, contentDescription = "Check icon")
                }
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Search
            ),
            keyboardActions = KeyboardActions(onSearch = {
                Log.d("Niko", "searched! ")
            })
        )
    }
}