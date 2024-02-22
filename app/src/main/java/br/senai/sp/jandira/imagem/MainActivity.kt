package br.senai.sp.jandira.imagem

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.imagem.ui.theme.ImagemTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ImagemTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    Column{
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .background(Color(0xFFCE9965))
                .padding(16.dp)
        ) {
            Card (
                shape = CircleShape,
                modifier = Modifier
                    .fillMaxHeight(),
                border = BorderStroke(width = 1.dp, Color(0xff3d0f0e)),
                elevation = CardDefaults.cardElevation(8.dp)
            ){
                Image(
                    painter = painterResource(id = R.drawable.taylor),
                    contentDescription = "Taylor Swift",
                    contentScale = ContentScale.Fit
                )
            }
            Column (
                modifier = Modifier
                    .padding(start = 6.dp)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center
            ) {
                Text(text = "Taylor Swift",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xff3d0f0e)
                )
                Text(text = "taylorswift@gmail.com",
                    fontSize = 12.sp,
                    color = Color(0xff3d0f0e)
                )
            }
        }
        Column (
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {
            TextField(
                value = "",
                onValueChange = {},
                placeholder = {
                    Text(text = "Digite aqui o seu nome")
                }
            )
            OutlinedTextField(
                value = "",
                onValueChange = {},
                label = {
                    Text(text = "Digite aqui seu endereço")
                }
            )
        }
    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    ImagemTheme {
        Greeting()
    }
}