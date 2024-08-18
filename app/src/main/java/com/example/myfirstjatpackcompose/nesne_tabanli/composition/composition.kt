package com.example.myfirstjatpackcompose.nesne_tabanli.composition

class Adres(var il :String,var ilce:String) {

}

class Kisiler(var ad:String,var yas:Int,var adres: Adres){

}
data class Filmler(var film_id:Int,var film_ad:String,var film_yil:Int,var kategori:Kategoriler,var yonetmen:Yonetmenler){}

data class Kategoriler(var kategori_id:Int,var kategori_ad:String){}

data class Yonetmenler(var yonetmen_id:Int,var yonetmen_ad:String){}
