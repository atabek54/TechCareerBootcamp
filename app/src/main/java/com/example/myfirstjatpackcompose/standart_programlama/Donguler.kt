package com.example.myfirstjatpackcompose.standart_programlama

fun main() {
    // 1,2,3 ü görmek istiyorum
    for (i in 1..3){
        println("Döngü 1 : $i")
    }
    // 10 ile 20 arası 5 er artsın

    for (i in 10..20 step 5){
        println("Döngü2 : $i")
    }
    // 20 ile 10 arası 5 er azalsın

    for (i in 20 downTo 10 step 5){
        println("Döngü3 : $i")
    }
    var sayac = 1;
    while (sayac<4){
        println("Sayaç: $sayac")
        sayac++
    }
}