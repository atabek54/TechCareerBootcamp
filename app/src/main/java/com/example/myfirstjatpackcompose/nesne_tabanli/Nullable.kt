package com.example.myfirstjatpackcompose.nesne_tabanli

import com.example.myfirstjatpackcompose.nesne_tabanli.A.A

fun main() {
var str1:String?=null
    str1 = " Merhaba "

    // Yöntem1 :
    println("Sonuç1 : ${str1?.trim()}")

    //Yöntem2
    println("Sonuç2 : ${str1!!.trim()}")

    //Yöntem3
    if(str1!=null){
        println("Sonuç3 : ${str1.trim()}")
    }else {
        println("Sonuç null dur")
    }
    // Yöntem4:
    str1.let {
        println("Sonuç 4 : ${str1.trim()}")
    }
    A.metod()
}
