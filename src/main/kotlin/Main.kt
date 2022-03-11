// Copyright 2000-2021 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.VerticalScrollbar
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.*

@Composable
@Preview
fun App() {
    val fondo = painterResource("fondo.jpg")

    val planta = painterResource("planta.jpg")
    val agua = painterResource("agua.jpg")
    val fuego = painterResource("fuego.jpg")

    var char1 = painterResource("001.jpg")
    var char2 = painterResource("002.jpg")
    var char3 = painterResource("003.jpg")
    var sq1 = painterResource("004.jpg")
    var sq2 = painterResource("005.jpg")
    var sq3 = painterResource("006.jpg")
    var bul1 = painterResource("007.jpg")
    var bul2 = painterResource("008.jpg")
    var bul3 = painterResource("009.jpg")


    var text1 by remember { mutableStateOf("#004 - #006") }
    var text2 by remember { mutableStateOf("#007 - #009") }
    var text3 by remember { mutableStateOf("#001 - #003") }

    var char1name by remember { mutableStateOf("#004 Charmander") }
    var char2name by remember { mutableStateOf("#005 Charmeleon") }
    var char3name by remember { mutableStateOf("#006 Charizard") }
    var sq1name by remember { mutableStateOf("#007 Squirtle") }
    var sq2name by remember { mutableStateOf("#008 Wartotle") }
    var sq3name by remember { mutableStateOf("#009 Blastoise") }
    var bul1name by remember { mutableStateOf("#001 Bulbasaur") }
    var bul2name by remember { mutableStateOf("#002 Ivysaur") }
    var bul3name by remember { mutableStateOf("#003 Venasaur") }

    var abrirVentana1 by remember { mutableStateOf(false) }
    var abrirVentana2 by remember { mutableStateOf(false) }
    var abrirVentana3 by remember { mutableStateOf(false) }

    var status001 by remember { mutableStateOf(false) }
    var status002 by remember { mutableStateOf(false) }
    var status003 by remember { mutableStateOf(false) }

    Surface {
        Image(
            painter = fondo,
            contentDescription = "fondo",
            modifier = Modifier.fillMaxSize()
        )
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {



        Text(
            text = "DEMO POKEDEX",
            modifier = Modifier
                .size(855.dp, 500.dp)
            ,
            color = Color.Black,
            textAlign = TextAlign.Center,
            style = TextStyle(
                color = Color.Yellow,
                fontWeight = FontWeight(40),
                fontStyle = FontStyle(40),
                background = Color.Yellow,
                textDecoration = null,

                )
        )

    }

    val stateVertical = rememberScrollState(0)

    VerticalScrollbar(

        adapter = rememberScrollbarAdapter(stateVertical)
    )

    Column(
        modifier = Modifier
            .fillMaxSize(1f)
            .width(500.dp) ,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {

        // PRIMERA LÍNEA EVOLUTIVA
        Button(
            onClick = {
                abrirVentana3 = !abrirVentana3
            },
            colors = ButtonDefaults.textButtonColors(
                contentColor = Color(0xFF0B0000)
            ),
            shape = RoundedCornerShape(50),
            modifier = Modifier.
            width(300.dp)

        ) {
            Text(text3)
        }
        if (abrirVentana3 == true) {
            Dialog(
                onCloseRequest = { abrirVentana3 = false },
                state = rememberDialogState(position = WindowPosition(Alignment.Center))
            ) {

                Image(
                    painter = planta,
                    contentDescription = "fondo",
                    modifier = Modifier.fillMaxSize()
                )

                Column(
                    modifier = Modifier.fillMaxSize(1f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        onClick = {
                            status001 = !status001
                        },
                        colors = ButtonDefaults.textButtonColors(
                            contentColor = Color(0xFFFF0000)
                        )
                    ) {
                        Text(bul1name)
                    }
                    if (status001) {
                        Image(
                            painter = bul1,
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize()
                        )

                    }

                    Button(
                        onClick = {
                            status002 = !status002
                        },
                        colors = ButtonDefaults.textButtonColors(
                            contentColor = Color(0xFFFF0000)
                        )
                    ) {
                        Text(bul2name)
                    }
                    if (status002) {
                        Image(
                            painter = bul2,
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize()
                        )
                    }

                    Button(
                        onClick = {
                            status003 = !status003
                        },
                        colors = ButtonDefaults.textButtonColors(
                            contentColor = Color(0xFFFF0000)
                        )
                    ) {
                        Text(bul3name)
                    }
                    if (status003) {
                        Image(
                            painter = bul3,
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize()
                        )
                    }


                }


            }
        }

        Spacer(Modifier.size(65.dp))

        // SEGUNDA LÍNEA EVOLUTIVA
        Button(
            onClick = {
                abrirVentana1 = !abrirVentana1
            },
            colors = ButtonDefaults.textButtonColors(
                contentColor = Color(0xFF0B0000)
            ),
            shape = RoundedCornerShape(50),
            modifier = Modifier.
            width(300.dp)
        ) {
            Text(text1)
        }
        if (abrirVentana1 == true) {
            Dialog(
                onCloseRequest = { abrirVentana1 = false },
                state = rememberDialogState(position = WindowPosition(Alignment.Center))
            ) {
                Image(
                    painter = fuego,
                    contentDescription = "fondo",
                    modifier = Modifier.fillMaxSize()
                )

                Column(
                    modifier = Modifier.fillMaxSize(1f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        onClick = {
                            status001 = !status001
                        },
                        colors = ButtonDefaults.textButtonColors(
                            contentColor = Color(0xFF0B0000)
                        )
                    ) {
                        Text(char1name)
                    }
                    if (status001) {
                        Image(
                            painter = char1,
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize()
                        )

                    }

                    Button(
                        onClick = {
                            status002 = !status002
                        },
                        colors = ButtonDefaults.textButtonColors(
                            contentColor = Color(0xFF0B0000)
                        )
                    ) {
                        Text(char2name)
                    }
                    if (status002) {
                        Image(
                            painter = char2,
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize()
                        )
                    }

                    Button(
                        onClick = {
                            status003 = !status003
                        },
                        colors = ButtonDefaults.textButtonColors(
                            contentColor = Color(0xFF0B0000)
                        )
                    ) {
                        Text(char3name)
                    }
                    if (status003) {
                        Image(
                            painter = char3,
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize()
                        )
                    }


                }


            }
        }

        Spacer(Modifier.size(65.dp))

        // TERCERA LÍNEA EVOLUTIVA
        Button(
            onClick = {
                abrirVentana2 = !abrirVentana2
            },
            colors = ButtonDefaults.textButtonColors(
                contentColor = Color(0xFF0B0000)
            ),
            shape = RoundedCornerShape(50),
            modifier = Modifier
                .width(300.dp)
        )
        {
            Text(text2)
        }
        if (abrirVentana2 == true) {
            Dialog(
                onCloseRequest = { abrirVentana2 = false },
                state = rememberDialogState(position = WindowPosition(Alignment.Center))
            ) {

                Image(
                    painter = agua,
                    contentDescription = "fondo",
                    modifier = Modifier.fillMaxSize()
                )

                Column(
                    modifier = Modifier.fillMaxSize(1f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        onClick = {
                            status001 = !status001
                        },
                        colors = ButtonDefaults.textButtonColors(
                            contentColor = Color(0xFFEC407A)
                        )
                    ) {
                        Text(sq1name)
                    }
                    if (status001) {
                        Image(
                            painter = sq1,
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize()
                        )

                    }

                    Button(
                        onClick = {
                            status002 = !status002
                        },
                        colors = ButtonDefaults.textButtonColors(
                            contentColor = Color(0xFFEC407A)
                        )
                    ) {
                        Text(sq2name)
                    }
                    if (status002) {
                        Image(
                            painter = sq2,
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize()
                        )
                    }

                    Button(
                        onClick = {
                            status003 = !status003
                        },
                        colors = ButtonDefaults.textButtonColors(
                            contentColor = Color(0xFFEC407A)
                        )
                    ) {
                        Text(sq3name)
                    }
                    if (status003) {
                        Image(
                            painter = sq3,
                            contentDescription = "",
                            modifier = Modifier.fillMaxSize()
                        )
                    }


                }


            }
        }




    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}
