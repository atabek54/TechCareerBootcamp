package com.example.myfirstjatpackcompose.nesne_tabanli.B

import com.example.myfirstjatpackcompose.nesne_tabanli.A.A


class B: A() {
    // A sınıfına open ekledim ve buraya kalıtım yoluyla aktardım
    fun fonksiyon(){
       /* val nesne = A()
        println(nesne.varsayilanDegisken)
        println(nesne.publicDegisken)
       // println(nesne.privateDegisken) private değişkene erişemem
        println(nesne.internalDegisken)
     println(protectedDegisken)  //  protectede de erişemem ama sınıfa kalıtım yoluyla aktarırsak kalkar bu hata
*/
        println(varsayilanDegisken)
        println(publicDegisken)
        // println(nesne.privateDegisken) private değişkene erişemem
        println(internalDegisken)
        println(protectedDegisken)
        A.metod()
    }
}