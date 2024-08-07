package com.example.myfirstjatpackcompose.standart_programlama

fun main() {
val yas= 19
    val isim ="Ahmet"

    if (yas >=18){
        println(isim + " Oy Kullanabilir.")
    }
    else {
        println(isim + " Oy Kullanamaz !.")

    }

    if (yas >=18 && isim =="Ahmet"){
        println(isim + " Oy Kullanabilir.")
    }
    else {
        println(isim + " Oy Kullanamaz !.")

    }
    if (yas == 18 || isim =="Ahmet"){
        println(isim + " Oy Kullanabilir.")
    }
    else {
        println(isim + " Oy Kullanamaz !.")

    }

    // Switch burda When

    val numara1 = 3;
    when(numara1){
        1-> println("Sayı 1")
        2-> println("Sayı 2")
        else-> println("Böyle bir sayı yok")

    }
}