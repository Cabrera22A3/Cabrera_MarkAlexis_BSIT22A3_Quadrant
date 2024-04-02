package com.example.cabrera_markalexis_bsit22a3_quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cabrera_markalexis_bsit22a3_quadrant.ui.theme.Cabrera_MarkAlexis_BSIT22A3_QuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Cabrera_MarkAlexis_BSIT22A3_QuadrantTheme {
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
    Row(
        Modifier.width(400.dp)
    ){
        Column (
            Modifier
                .width(190.dp)
        ){
            Row{
                Column (
                    modifier = Modifier
                        .background(color = Color(0xFFEADDFF))
                        .padding(all = 16.dp)
                        .height(300.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Row {
                        Text(
                            text = "Text Composable",
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(bottom = 14.dp)
                        )
                    }
                    Row {
                        Text(
                            text = "Displays text and follows the recommended Material Design guidelines.",
                            fontSize = 14.sp,
                            textAlign = TextAlign.Justify
                        )
                    }
                }
            }
            Row{
                Column (
                    modifier = Modifier
                        .background(color = Color(0xFFD0BCFF))
                        .padding(all = 16.dp)
                        .height(300.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Row {
                        Text(
                            text = "Row Composable",
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(bottom = 14.dp)
                        )
                    }
                    Row {
                        Text(
                            text = "A layout composable that places its children in a horizontal sequence.",
                            fontSize = 14.sp,
                            textAlign = TextAlign.Justify
                        )
                    }
                }
            }
        }
        Column{
            Row{
                Column (
                    modifier = Modifier
                        .background(color = Color(0xFFD0BCFF))
                        .padding(all = 16.dp)
                        .height(300.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Row {
                        Text(
                            text = "Image Composable",
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(bottom = 14.dp)
                        )
                    }
                    Row {
                        Text(
                            text = "Creates a composable that lays out and draws a given Partner class object.",
                            fontSize = 14.sp,
                            textAlign = TextAlign.Justify
                        )
                    }
                }
            }
            Row{
                Column (
                    modifier = Modifier
                        .background(color = Color(0xFFEADDFF))
                        .padding(all = 16.dp)
                        .height(300.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Row {
                        Text(
                            text = "Column Composable",
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(bottom = 14.dp)
                        )
                    }
                    Row {
                        Text(
                            text = "A layout composable that places children in a vertical sequence.",
                            fontSize = 14.sp,
                            textAlign = TextAlign.Justify
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Cabrera_MarkAlexis_BSIT22A3_QuadrantTheme {
        Greeting()
    }
}