package com.example.myfirstjatpackcompose.nesne_tabanli
import com.example.myfirstjatpackcompose.nesne_tabanli.Renkler
import com.example.myfirstjatpackcompose.nesne_tabanli.KonserveBoyut


fun main() {
    val size = KonserveBoyut.BUYUK
    val renk = Renkler.Beyaz

    when(renk){
        Renkler.Beyaz -> println("Beyaz")
        Renkler.Siyah-> println("Siyah")

    }
    fun calcPrice(adet:Int,boyut: KonserveBoyut){
when(boyut){
    KonserveBoyut.KUCUK-> println("Toplam Maliyet : ${30*adet} ₺")
    KonserveBoyut.ORTA-> println("Toplam Maliyet : ${80*adet} ₺")
    KonserveBoyut.BUYUK-> println("Toplam Maliyet : ${140*adet} ₺")

}
    }
    calcPrice(5,size);
}