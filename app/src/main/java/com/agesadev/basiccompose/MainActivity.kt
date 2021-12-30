package com.agesadev.basiccompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.agesadev.basiccompose.ui.theme.BasicComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicComposeTheme {
                myApp()
            }
        }
    }
}

@Composable
fun myApp() {
    Surface(color = MaterialTheme.colors.background) {
        Greeting("Agesa.Compose")
    }
}

@Composable
fun Greeting(name: String) {
    Surface(color = MaterialTheme.colors.primary) {
        Column {
            Text(text = "Hello!", Modifier.padding(30.dp))
            Text(text = "$name!", Modifier.padding(30.dp))
        }

    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BasicComposeTheme {
      myApp()
    }
}