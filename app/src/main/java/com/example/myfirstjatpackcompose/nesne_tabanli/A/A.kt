package com.example.myfirstjatpackcompose.nesne_tabanli.A

open class A {
    //open
    var varsayilanDegisken = 1
    public var publicDegisken = 2
    private var privateDegisken = 3
    internal var internalDegisken =4
    protected var protectedDegisken = 5

  /*  Static Değişkenler ve Metodlar
    • Bir değişkenin veya metodun, bulunduğu sınıftan ( class ) nesne
    oluşturmaya gerek kalmadan erişilmek istenirse kullanılır.*/
    companion object{
        var x = 10
        fun metod(){
            println("Merhaba")
        }
    }
}