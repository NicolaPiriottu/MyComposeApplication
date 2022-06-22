package com.example.mycomposeapplication

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mycomposeapplication.ui.mycomponents.ExpandableCard
import com.example.mycomposeapplication.ui.mycomponents.MyButton
import com.example.mycomposeapplication.ui.mycomponents.MyTextView
import com.example.mycomposeapplication.ui.mycomponents.MyCoilLoadImage
import com.example.mycomposeapplication.ui.mylazycolumn.MyCustomItem
import com.example.mycomposeapplication.ui.mylazycolumn.PersonRepository
import com.example.mycomposeapplication.ui.theme.MyComposeApplicationTheme

class MainActivity : ComponentActivity() {

    // @InternalCoroutinesApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultPreview()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyComposeApplicationTheme {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .fillMaxSize()
                .background(MaterialTheme.colors.background)
                .padding(12.dp),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.Top
        ) {
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {
                MyTextView()
            }
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {
                ExpandableCard()
            }
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
            ) {
                MyButton(onClicked = {
                    Log.d("Niko", "clicked")
                })
            }
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()

            ) {
                MyCoilLoadImage()
            }

            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()

            ) {
                MyPasswordTextField()
            }

           /* Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()

            ) {
                MyLazyColumnMock()
            }*/
        }
    }
}

@Composable
private fun MyLazyColumnRepository() {
    val personRepository = PersonRepository()
    val getAllData = personRepository.getAllData()

    LazyColumn(contentPadding = PaddingValues(12.dp)) {
        items(items = getAllData) { person ->
            MyCustomItem(person = person)
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun MyLazyColumnMock() {
    val sections = listOf("A", "B", "C", "D", "E", "F", "G")

    LazyColumn(verticalArrangement = Arrangement.spacedBy(12.dp)) {
        sections.forEach { section ->
            stickyHeader {
                Text(
                    text = "Section $section",
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.LightGray)
                        .padding(12.dp)
                )
            }

            items(count = 10) {
                Text(
                    text = "Item $it from the section $section",
                    modifier = Modifier.padding(12.dp)
                )
            }
        }
    }
}
