package com.example.myfirstjatpackcompose.nesne_tabanli


class Fonksiyonlar {
    // void : geri dönüş değeri olmayan
    // return : geri dönüş değeri olan
   fun selamla(){
       val sonuc = "Merhaba Ahmet"
        println(sonuc)
   }
    fun selamla2():String{
        val sonuc ="Merhaba Ahssmet"
        return sonuc
    }
    fun selamla3(isim:String){
        val sonuc = "Merhaba $isim"
    }

    // Overloading aynı isimde fonksiyon tanımlamaya denir ama parametreleri farklı olmalı.
    fun carp(sayi1:Int,sayi2:Int){
        println("Çarpma: ${sayi1*sayi2}")
    }
    fun carp(sayi1:Double,sayi2: Int){
        println("Çarpma: ${sayi1*sayi2}")

    }

   // Extension fonksiyonlar kotlin içinde bulunan sınıfları genişletmek için  kullanılan pratik bir yöntemdir.
    fun Int.carpi(sayi:Int):Int{
        return  this*sayi;
       //this metodun önündeki sayıyı ifade eder 5.carpi mesela
    }
    val sonuc = 5.carpi(2)
    fun hesap(){
        println(sonuc)
    }
  //  infix Fonksiyon Extension fonksiyonları daha pratik kullanmamızı sağlar
  infix fun Int.carpi2(sayi:Int):Int{
      return  this*sayi;
      //this metodun önündeki sayıyı ifade eder 5.carpi mesela
  }
    val sonuc2= 5 carpi2 2
    fun hesap2(){
        println(sonuc2)
    }
}