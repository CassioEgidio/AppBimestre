package com.example.breadandart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.breadandart.ui.theme.BreadAndArtTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BreadAndArtTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Index()
                }
            }
        }
    }
}

@Composable
fun Index() {

    var logo = painterResource(R.drawable.image45)
    var banner = painterResource(R.drawable.banner)
    var menu = painterResource(R.drawable.menu)
    var telefone = painterResource(R.drawable.telefone)
    var what = painterResource(R.drawable.what)
    var peca = painterResource(R.drawable.peca)
    var mapa = painterResource(R.drawable.mapa)

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(Color(0xFF6E0109)),

        ) {

            Image(
                painter = logo,
                contentDescription = null,
                modifier = Modifier
                    .size(110.dp)
                    .align(Alignment.CenterVertically)
            )

            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 100.dp) // Adiciona espaçamento entre a imagem e o texto
            ) {

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(bottom = 15.dp) // Espaçamento entre as linhas
                ){
                    Image(
                        painter = telefone,
                        contentDescription = null,
                        modifier = Modifier
                            .size(30.dp)

                    )

                    Spacer(modifier = Modifier.width(10.dp)) // Espaçamento entre a imagem e o texto

                    Text(text = "999999999",
                        color = Color.White,
                        fontSize = 20.sp);

                }

                Row(

                    verticalAlignment = Alignment.CenterVertically

                ) {
                    Image(
                        painter = what,
                        contentDescription = null,
                        modifier = Modifier
                            .size(30.dp)
                    )

                    Spacer(modifier = Modifier.width(10.dp)) // Espaçamento entre a imagem e o texto
                    Text(text = "999999999",
                        color = Color.White,
                        fontSize = 20.sp);
                }

            }

        }

        Box( //isso é a nav
            modifier = Modifier
                .fillMaxWidth()
                .shadow(elevation = 4.dp, shape = RoundedCornerShape(0.dp), clip = false) // Elevation value can be adjusted
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color(0xFFFFFFFF))
                    .padding(vertical = 8.dp)
                    .padding(start = 10.dp)
            ) {
                Image(
                    painter = menu,
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp)
                )
            }
        }

        Row(
            Modifier.
            padding(5.dp) //é so para dar um espaço entre o header e o main
        ) {

        }

        Row(

        ){
            Image(
                painter = banner, //rfgthtehdfshbrdhjufdshgreyuhfg
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth() // Modificador para ocupar 100% da largura
            )
        }

        Row(
            Modifier.
            padding(10.dp) //é so para dar um espaço entre o header e o main
        ) {

        }

        Row(//primeiro
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 25.dp, end = 25.dp) // Padding externo para a esquerda e direita
                .height(190.dp)
                .background(
                    color = Color.LightGray, // Define a cor de fundo
                    shape = RoundedCornerShape(16.dp) // Define o border radius
                )
                .clip(RoundedCornerShape(16.dp)) // Clip para aplicar o formato arredondado
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .aspectRatio(1f) // Mantém a proporção quadrada da imagem
                    .clip(shape = RoundedCornerShape(16.dp)) // Clip com o mesmo border radius do Row
            ) {
                Image(
                    painter = peca,
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )
                Text(
                    text = "Peça e receba nossas delícias em casa",
                    color = Color.White,
                    fontSize = 40.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(8.dp),
                    lineHeight = 48.sp // Espaçamento entre as linhas
                )
            }
        }

        Row(
            Modifier.
            padding(10.dp) //é so para dar um espaço entre o header e o main
        ) {

        }

        Row(//segundo
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 25.dp, end = 25.dp) // Padding externo para a esquerda e direita
                .height(190.dp)
                .background(
                    color = Color(0xFF6E0109),  // Define a cor de fundo
                    shape = RoundedCornerShape(16.dp) // Define o border radius
                )
                .clip(RoundedCornerShape(16.dp)) // Clip para aplicar o formato arredondado
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .aspectRatio(1f) // Mantém a proporção quadrada da imagem
                    .clip(shape = RoundedCornerShape(16.dp)) // Clip com o mesmo border radius do Row
            ) {
                Image(
                    painter = peca,
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize()
                )
                Text(
                    text = "Fale conosco",
                    color = Color.White,
                    fontSize = 40.sp,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .padding(8.dp),
                    lineHeight = 48.sp // Espaçamento entre as linhas
                )

            }
        }

        Row(
            Modifier.
            padding(10.dp) //é so para dar um espaço entre o header e o main
        ) {

        }


    }

}

@Composable
fun FaleConosco() {

    var logo = painterResource(R.drawable.image45)
    var menu = painterResource(R.drawable.menu)
    var telefone = painterResource(R.drawable.telefone)
    var what = painterResource(R.drawable.what)

    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(Color(0xFF6E0109)),

            ) {

            Image(
                painter = logo,
                contentDescription = null,
                modifier = Modifier
                    .size(110.dp)
                    .align(Alignment.CenterVertically)
            )

            Column(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 100.dp) // Adiciona espaçamento entre a imagem e o texto
            ) {

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(bottom = 15.dp) // Espaçamento entre as linhas
                ){
                    Image(
                        painter = telefone,
                        contentDescription = null,
                        modifier = Modifier
                            .size(30.dp)

                    )

                    Spacer(modifier = Modifier.width(10.dp)) // Espaçamento entre a imagem e o texto

                    Text(text = "999999999",
                        color = Color.White,
                        fontSize = 20.sp);

                }

                Row(

                    verticalAlignment = Alignment.CenterVertically

                ) {
                    Image(
                        painter = what,
                        contentDescription = null,
                        modifier = Modifier
                            .size(30.dp)
                    )

                    Spacer(modifier = Modifier.width(10.dp)) // Espaçamento entre a imagem e o texto
                    Text(text = "999999999",
                        color = Color.White,
                        fontSize = 20.sp);
                }

            }

        }

        Box( //isso é a nav
            modifier = Modifier
                .fillMaxWidth()
                .shadow(elevation = 4.dp, shape = RoundedCornerShape(0.dp), clip = false) // Elevation value can be adjusted
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .background(Color(0xFFFFFFFF))
                    .padding(vertical = 8.dp)
                    .padding(start = 10.dp)
            ) {
                Image(
                    painter = menu,
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp)
                )
            }
        }

        Row(
            Modifier.
            padding(5.dp) //é so para dar um espaço entre o header e o main
        ) {

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center,
        ) {
            var text1 by remember { mutableStateOf("")}

            OutlinedTextField(
                value = text1,
                onValueChange = { text1 = it },
                label = { Text("Nome:") }
            )
        }
        Row(
            Modifier.
            padding(15.dp)
        ) {

        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center,
        ) {
            var text2 by remember { mutableStateOf("")}

            OutlinedTextField(
                value = text2,
                onValueChange = { text2 = it },
                label = { Text("Email:") }
            )
        }
        Row(
            Modifier
                .fillMaxWidth(),
            Arrangement.Center,
        ) {
            var text3 by remember { mutableStateOf("")}

            OutlinedTextField(
                value = text3,
                onValueChange = { text3 = it },
                label = { Text("Mensagem:") }
            )
        }
        Row(
            Modifier.
            padding(15.dp)
        ) {

        }

    }

}



@Composable
@Preview
fun Preview() {
    BreadAndArtTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(enabled = true, state = rememberScrollState())
            ) {
                FaleConosco()
            }
        }
    }
}