package com.example.primeiroappcomposer

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.primeiroappcomposer.ui.theme.PrimeiroAppComposerTheme
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.primeiroappcomposer.ui.theme.GreenBright
import com.example.primeiroappcomposer.ui.theme.GreenDark
import com.example.primeiroappcomposer.ui.theme.GreenMid


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrimeiroAppComposerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ProdutoItem()
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProdutoItem() {
    var nome by remember { mutableStateOf("") }
    var telefone by remember { mutableStateOf("") }
    var curso by remember { mutableStateOf("") }
    var serie by remember { mutableStateOf("") }


    Column(
        Modifier
            .fillMaxHeight()
            .background(Color(40, 40, 40))
    ) {
        Box(
            modifier = Modifier
                .height(200.dp)
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(
                            GreenDark, GreenMid, GreenBright
                        )
                    )
                )
                .fillMaxWidth()
                .wrapContentSize(Alignment.Center, true)
        ) {
            Image(
                painter = painterResource(id = R.drawable.avatar),
                contentDescription = "Descrição Imagem",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(225.dp)
                    .offset(y = (75).dp)
                    .clip(CircleShape)
                    .align(Alignment.BottomCenter)
            )
        }
        Spacer(modifier = Modifier.height(90.dp))

        Column(
            Modifier
                .padding(24.dp)
        ) {
            Text(
                text = "Dados do Usuário",
                fontSize = 28.sp,
                fontWeight = FontWeight(700),
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                color = Color.White,
                modifier = Modifier
                    .padding(bottom = 24.dp)
                    .align(Alignment.CenterHorizontally)
            )

            TextField(
                value = nome,
                onValueChange = { nome = it },
                label = { Text(
                    text = "Nome"
                ) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 24.dp),
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = GreenMid,
                    unfocusedLabelColor = GreenMid,
                    unfocusedContainerColor = Color(75, 75, 75),
                    unfocusedTextColor = Color.White,

                    focusedIndicatorColor = GreenMid,
                    focusedLabelColor = GreenMid,
                    focusedContainerColor = Color(75, 75, 75),
                    focusedTextColor = Color.White,

                    cursorColor = GreenMid
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Next,
                    keyboardType = KeyboardType.Text
                ),
                singleLine = true
            )

            TextField(
                value = telefone,
                onValueChange = { telefone = it },
                label = { Text(
                    text = "Telefone"
                ) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 24.dp),
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = GreenMid,
                    unfocusedLabelColor = GreenMid,
                    unfocusedContainerColor = Color(75, 75, 75),
                    unfocusedTextColor = Color.White,

                    focusedIndicatorColor = GreenMid,
                    focusedLabelColor = GreenMid,
                    focusedContainerColor = Color(75, 75, 75),
                    focusedTextColor = Color.White,

                    cursorColor = GreenMid
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Next,
                    keyboardType = KeyboardType.Phone
                ),
                singleLine = true
            )

            TextField(
                value = curso,
                onValueChange = { curso = it },
                label = { Text(
                    text = "Curso"
                ) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 24.dp),
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = GreenMid,
                    unfocusedLabelColor = GreenMid,
                    unfocusedContainerColor = Color(75, 75, 75),
                    unfocusedTextColor = Color.White,

                    focusedIndicatorColor = GreenMid,
                    focusedLabelColor = GreenMid,
                    focusedContainerColor = Color(75, 75, 75),
                    focusedTextColor = Color.White,

                    cursorColor = GreenMid
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Next,
                    keyboardType = KeyboardType.Text
                ),
                singleLine = true
            )

            TextField(
                value = serie,
                onValueChange = { serie = it },
                label = { Text(
                    text = "Série"
                ) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 36.dp),
                colors = TextFieldDefaults.colors(
                    unfocusedIndicatorColor = GreenMid,
                    unfocusedLabelColor = GreenMid,
                    unfocusedContainerColor = Color(75, 75, 75),
                    unfocusedTextColor = Color.White,

                    focusedIndicatorColor = GreenMid,
                    focusedLabelColor = GreenMid,
                    focusedContainerColor = Color(75, 75, 75),
                    focusedTextColor = Color.White,

                    cursorColor = GreenMid
                ),
                keyboardOptions = KeyboardOptions.Default.copy(
                    imeAction = ImeAction.Done,
                    keyboardType = KeyboardType.Text
                ),
                singleLine = true
            )

            Button(
                onClick = { /* nada ainda */},
                colors = ButtonDefaults.buttonColors(containerColor = GreenMid),
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .size(height = 60.dp, width = 120.dp)
                    .align(Alignment.CenterHorizontally)
            ) {
                Text(
                    text = "Enviar",
                    color = Color.White,
                    fontSize = 20.sp
                )
            }
        }
    }
}