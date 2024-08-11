package com.example.myfirstjatpackcompose.nesne_tabanli

class Urunler(var id : Int ,var ad:String,var fiyat:Int) {
//init constructor
    init {
// Bu sınıftan nesne oluşturulduğunda çalışır
        println("Nesne oluşturuldu.")
    }
fun bilgiAl(){
    println("---------------")

    println("Id : ${id}")
    println("Ad : ${ad}")
    println("Fiyat : ${fiyat}")
}

    //this key wordu bulundugu sınıfı temsil eder this.id de diyebiliriz swift dilinde bunun karşılığı self tir
    //super key wordu bu da kalıtım yoluyla gelen üst sınıfı temsil eder
}