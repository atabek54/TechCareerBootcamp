package com.example.myfirstjatpackcompose.standart_programlama

fun main(){
    var urunAdi = "Macbook Pro";
    var fiyat = 45999;
    var boy= 1.88;
    var harf = 'A'
    var kontrol = false;



    println("Ürün Adı:     $urunAdi");
    println("Fiyat:     $fiyat");
    println("Boy:     $boy");
    println("Harf:     $harf");
    println("kontrol:     $kontrol");

    //Sabitler - constant

    // Swift let java/dart final
    var sayi = 30;
    println(sayi);
    sayi = 100;
    println(sayi);

    val numara = 90;
    println(numara);

    // Tür Dönüşümü
    //Sayısaldan Sayısala dönüşüm

    val i = 42;
    val d = 93.67;

    val sonuc1 = i.toDouble()
    val sonuc2 = d.toInt()
    println(sonuc1);
    println(sonuc2);

    /// sayısaldan metne
    val sonuc3 = i.toString()
    val sonuc4 = d.toString()
    println(sonuc3);
    println(sonuc4);

    //Metinde sayısala
    val yazi = "78"

    val sonuc5  = yazi.toIntOrNull()
    if (sonuc5 != null){
        println(sonuc5)
    }else {

    }







}