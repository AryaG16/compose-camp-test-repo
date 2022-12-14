package com.example.app1st

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app1st.ui.theme.App1stTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App1stTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    var about="About Me"
                    var intro="From 5th Semester CE GIT"
                    var langs="Knows 5 languages: French,English,Hindi,Gujrati,Creole"
                    var dlang="Knows Java,C,MySql,Python,Web Development(Frontend)"
                    val n=6.0f;val m=3.0f;
                    val ad=addition(n,m)
                    val sub=subst(n,m)
                    val mul=mult(n,m)
                    val div=divs(n,m)
                    Greeting("Aryan Bhavsar Here!!",about,intro,langs,dlang,n,m,ad,sub,mul,div)
                }
            }
        }
    }
}
fun addition(n:Float,m:Float)=n+m
fun subst(n:Float,m:Float)=n-m
fun mult(n:Float,m:Float)=n*m
fun divs(n:Float,m:Float)=n/m

@Composable
fun Greeting(name: String,about: String,intro: String,langs: String,devl: String="In Progress",n:Float,m:Float,ad:Float,sub:Float,mul:Float,div:Float) {
    Column {
        Surface(color = Color.Cyan) {
            Text(text = "Hello $name!", modifier = Modifier.padding(18.dp),fontSize=31.sp)
        }
        Surface(color = Color.Green) {
            Column {
                Text(text = about, modifier = Modifier.padding(10.dp), fontSize = 25.sp)
                Text(text = intro, modifier = Modifier.padding(3.dp), fontSize = 20.sp)
                Text(text = langs, modifier = Modifier.padding(3.dp), fontSize = 20.sp)
                Text(text = devl , modifier = Modifier.padding(3.dp), fontSize = 20.sp)
                Surface(color=Color.Gray) {
                    Text(
                        text = "Operations on $n & $m",
                        modifier = Modifier.padding(8.dp),
                        fontSize = 24.sp
                    )
                }
                Surface(color=Color.Gray) {
                    Row {
                        Column {
                            Text(
                                text = "Addition: $ad",
                                modifier = Modifier.padding(6.dp),
                                fontSize = 18.sp
                            )
                            Text(
                                text = "Substration: $sub",
                                modifier = Modifier.padding(6.dp),
                                fontSize = 18.sp
                            )
                        }
                        Column {
                            Text(
                                text = "Multiplication: $mul",
                                modifier = Modifier.padding(6.dp),
                                fontSize = 18.sp
                            )
                            Text(
                                text = "Division: $div",
                                modifier = Modifier.padding(6.dp),
                                fontSize = 18.sp
                            )
                        }
                    }
                }
            }

        }
    }
}

@Preview(name="Aryan Intro",showBackground = false)
@Composable
fun IntroPagePreview() {
    App1stTheme {
        Greeting("Aryan Here!","About Sec","Intro me","Languages","Skills",3.0f,4.0f,ad=4.0f,sub=4.0f,mul=6.0f,div=6.0f)

    }
}