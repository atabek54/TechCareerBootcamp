package com.example.myfirstjatpackcompose.Odevler
fun main() {
    // Sınıf Tanımı
    val f = FonksiyonOdevClass()
//Dikdörtgen Çevresi
    val celsiusDegree = 25.0
    val fahrenheitDegree = f.celsiusToFahrenheit(celsiusDegree)
    println("$celsiusDegree °C = $fahrenheitDegree °F")
//Faktöriyel Hesabı
    f.calcRectangle(4,5)
    val fact= f.calcFact(6)
    println( "Faktöriyel: $fact")
    // Kelime içindeki Harf sayısı
    f.findCharCount("Atabek")
    //Kenar Sayısı girilen şeklin iç açılar toplamı
   val  totalAngle =  f.totalIntAngleCalc(4
    )
    println("İç Açılar Toplamı: $totalAngle")
    //Maaş Hesabı
    val salary = f.calcSalary(40)
    println("Maaş: $salary")
    //Kota ücreti
    val priceGB = f.calcGbPrice(52)
    println("Kota Ücreti: $priceGb")
}