package com.santisteban.mario.clase01

import org.junit.Test

class Semana01 {

    @Test
    fun executeTest(){
        basic()
        parametroEntrada( "Mario")
        parametroEntradaValorDefecto()
        val age = parametroSalida()
        System.out.println("------>> Edad :$age <<------")
        System.out.println("------>> Edad :${parametroSalida()} <<------")
        System.out.println("------>> ${parametroEntradaySalida( "Max", 19  )} <<------")
        System.out.println("------>> ${parametroEntradaYSalidaEn1Linea(  "Johan", 19 )} <<------")
    }

    fun basic(){
        System.out.println("------>> Funcion Basico <<------")
    }

    fun parametroEntrada(name:String){
        System.out.println("------>> Hello: $name <<------")
    }

    fun parametroEntradaValorDefecto(name: String = "Carlos") {
        System.out.println("------>> Hello: $name <<------")
    }

    fun parametroSalida(): Int{
        return 30
    }

    fun parametroEntradaySalida(name: String, age:Int): String{
        return "Nombre: $name \n Edad: $age"
    }

    fun parametroEntradaYSalidaEn1Linea(name: String, age: Int)= "Nombre: $name \n Edad: $age"

}
