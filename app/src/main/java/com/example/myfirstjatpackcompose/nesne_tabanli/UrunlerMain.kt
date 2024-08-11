package com.example.myfirstjatpackcompose.nesne_tabanli

fun main() {
    val urun1 = Urunler(1,"TV",8999)
    // Değer erişimi
   urun1.bilgiAl()

    //Değer Atama
    urun1.ad = "Tv Samsung"
    urun1.fiyat = 10000
    println("Ad : ${urun1.ad}")
    println("Fiyat : ${urun1.fiyat}")

    val urun2 = Urunler(2,"Saat",3000)
   urun2.bilgiAl()
}