package codelab.javiersolis.androidbasiccompose_13092024

import android.content.Context
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import codelab.javiersolis.androidbasiccompose_13092024.ui.theme.AndroidBasicComposeExampleArticle13092024Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidBasicComposeExampleArticle13092024Theme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) {
                    innerPadding -> 
                    Greeting(
                        name = "Android",
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        val paintImage = painterResource(id = R.drawable.bg_compose_background)
        Image(
            painter = paintImage,
            contentDescription = null,
            contentScale = ContentScale.Fit
        )
        Text(
            text = stringResource(id = R.string.title),
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = stringResource(id = R.string.short_1),
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = stringResource(id = R.string.description),
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidBasicComposeExampleArticle13092024Theme {
        Greeting("Android")
    }
}