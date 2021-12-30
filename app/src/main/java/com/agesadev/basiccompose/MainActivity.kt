package com.agesadev.basiccompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
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
fun myApp(names:List<String> = listOf("World,Compose")) {
    Surface(color = MaterialTheme.colors.background) {
       Column(modifier = Modifier.padding(4.dp)) {
          for (name in names){
              Greeting(name)
          }
       }
    }
}

@Composable
fun Greeting(name: String) {
    Surface(color = MaterialTheme.colors.primary,
    modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
        ) {
        Column (Modifier.padding(30.dp).fillMaxWidth()){
            Text(text = "Hello!")
            Text(text = name)
        }

    }


}

@Preview(showBackground = true, widthDp = 320)
@Composable
fun DefaultPreview() {
    BasicComposeTheme {
      myApp()
    }
}