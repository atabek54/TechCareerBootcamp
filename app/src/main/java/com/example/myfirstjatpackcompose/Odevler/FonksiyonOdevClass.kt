package com.example.myfirstjatpackcompose.Odevler

class FonksiyonOdevClass {
    fun celsiusToFahrenheit(celsius: Double): Double {
        return celsius * 1.8 + 32
    }
    fun calcRectangle(a:Int,b:Int){
        val env = 2 * (a+b);
        println("Dikdörgen Çevresi : $env")
    }

    fun calcFact(value:Int):Int{
        var result = 1

        for (i in value downTo 1) {
            result = i * result;


        }
        return result
    }
    fun findCharCount(str:String){
      val result =   str.count{it == 'a'||it =='A'}
        println("$str harfi Sayısı: $result")
    }

    fun totalIntAngleCalc(numEdges:Int):Int{

        var result = (numEdges -2)*180
        return result
    }
    fun calcSalary(daysWorked: Int): Int {
        val normalRate = 10
        val overtimeRate = 20
        val regularHours = 160
        val totalHoursWorked = daysWorked * 8

        val regularSalary = minOf(totalHoursWorked, regularHours) * normalRate
        val overtimeHours = maxOf(0, totalHoursWorked - regularHours)
        val overtimeSalary = overtimeHours * overtimeRate

        return regularSalary + overtimeSalary
    }

    fun calcGbPrice(gb:Int):Int{
        var price = 0
        val normalGB = 50
        val normalPrice = 100
        if(gb<=normalGB){
            price = 100
        }else {
           price = 100 + (gb-normalGB) * 4
        }

        return price;
    }
}