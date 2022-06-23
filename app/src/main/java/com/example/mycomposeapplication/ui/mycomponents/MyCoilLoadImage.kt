package com.example.mycomposeapplication.ui.mycomponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.transform.RoundedCornersTransformation
import com.example.mycomposeapplication.R

/**
 * Created by Nicola Luigi Piriottu on 16/06/22.
 */
@Composable
fun MyCoilLoadImage() {
    Box(
        modifier = Modifier
            .height(150.dp)
            .width(150.dp), contentAlignment = Alignment.Center
    ) {

        val painter =//fa divendare l'immagine grigia
        //GrayscaleTransformation(),
        //la fa didentare opaca
        //BlurTransformation(LocalContext.current),
        //this
        //CircleCropTransformation(),
        //or this
        //endregion builder
        //this or painterState
            //region builder
            rememberAsyncImagePainter(
                ImageRequest.Builder(LocalContext.current)
                    .data(data = "https://sites.google.com/site/gattiamici/_/rsrc/1468752127292/gatti-page/gatti%2001.jpg")
                    .apply(block = fun ImageRequest.Builder.() {
                        //this or painterState
                        //region builder
                        placeholder(R.drawable.ic_no_image)
                        error(R.drawable.ic_error)
                        crossfade(1000)
                        transformations(
                            //fa divendare l'immagine grigia
                            //GrayscaleTransformation(),
                            //la fa didentare opaca
                            //BlurTransformation(LocalContext.current),
                            //this
                            //CircleCropTransformation(),
                            //or this
                            RoundedCornersTransformation(50F),
                        )
                        //endregion builder
                    }).build()
            )

        val painterState = painter.state
        Image(painter = painter, contentDescription = "Logo Image")
        //this or painter builder

        /*if (painterState is ImagePainter.State.Loading){
            CircularProgressIndicator()
        }else if (painterState is ImagePainter.State.Error){
            Log.d("Niko", "error ${painterState.throwable}")
        }*/

    }
}

@Composable
@Preview
private fun MyCoilLoadImagePreview() {
    MyCoilLoadImage()
}