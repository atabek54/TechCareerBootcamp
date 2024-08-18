package com.example.myfirstjatpackcompose.nesne_tabanli.composition

fun main() {
val adres = Adres("Bursa","Kemalpaşa")
    val kisi = Kisiler("Selman",21, adres)
    println("Kişi ad: ${kisi.ad}")
    println("Kişi yas: ${kisi.yas}")

    println("Kişi il: ${kisi.adres.il}")
    println("Kişi ilce: ${kisi.adres.ilce}")

// Filmler dataları için örnek

}