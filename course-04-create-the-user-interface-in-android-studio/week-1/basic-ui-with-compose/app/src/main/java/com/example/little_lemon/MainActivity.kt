package com.example.little_lemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.little_lemon.ui.theme.LittleLemonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    RestaurantName(
                        name = stringResource(id = R.string.title),
                        size = 32)
                }
            }
        }
    }
}


@Composable
fun RestaurantName(name: String, size: Int) {
    Text(
        text = name,
        fontSize = size.sp
    )
}


@Preview(showBackground = true)
@Composable
fun RestaurantNamePreview() {
    RestaurantName(
        name = stringResource(id = R.string.title),
        size = 32
    )
}
