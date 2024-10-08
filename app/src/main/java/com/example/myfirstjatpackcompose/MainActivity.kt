package com.example.myfirstjatpackcompose

import Odev3Page
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import cafe.adriel.voyager.navigator.Navigator
import com.example.myfirstjatpackcompose.Odevler.CalculaterScreen
import com.example.myfirstjatpackcompose.Odevler.Odev4Anasayfa
import com.example.myfirstjatpackcompose.ui.theme.MyFirstJatpackComposeTheme

class MainActivity : ComponentActivity() {

    var str1:String?=null
    //boş değişken oluşturamayız atama yapmamız lazım ya da lateinit var kullanmamız lazım
    lateinit var str2:String
    // int değişkeninde bunu yapamayız
    // lateinit var str3:Int
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyFirstJatpackComposeTheme {
                CalculaterScreen()
             //   Navigator(screen=Odev4Anasayfa())
            }
        }
    }
}


