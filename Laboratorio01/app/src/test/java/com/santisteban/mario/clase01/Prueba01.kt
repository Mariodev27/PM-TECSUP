package com.santisteban.mario.clase01
import org.junit.Assert.assertEquals
import org.junit.Test

class Prueba01 {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testObject() {
        val nameProduct = "banana"
        val priceProduct = 12.0
        val product = Product(name = nameProduct, price = priceProduct)

        System.out.println("Nombre de producto: ${product.name}")

        System.out.println("Precio de producto: ${product.price}")
    }


    @Test
    fun declareVarInKotlin() {
        var num1 = 10;
        num1 = 15
        val num2 = 20
        val result = num1.plus(num2)

        System.out.println("El resultado de la suma es: $result")

        val name: String = "Victor"

        System.out.println("$name saico justo")
    }

    @Test
    fun typeFunctions() {
        val nameVictor = "Victor"
        val lastNameSaico = "Saico"
        saludos()
        saludosConParametroDeEntrada(nameVictor)
        saludosConParametroDeEntradaYvalorPorDefecto(name = nameVictor, lastName = lastNameSaico)
        val saludoConcatenado = saludosConParametroDeEntradaYsalida(nameVictor)
        System.out.println("-------------")
        System.out.println("saludosConParametroDeEntradaYsalida :  $saludoConcatenado")
        val saludoConcatenadoEnUnaLinea = saludosEnUnaLinea(nameVictor)
        System.out.println("-------------")
        System.out.println("saludoConcatenadoEnUnaLinea :  $saludoConcatenadoEnUnaLinea")
    }

    //Funcion básica
    fun saludos() {
        System.out.println("---------saludos------------")
        System.out.println("Saludos")
    }

    //Funcion con párametros de entrada
    fun saludosConParametroDeEntrada(name: String) {
        System.out.println("----------saludosConParametroDeEntrada-----------")
        System.out.println("Saludos $name")
    }

    //Funcion con párametros de entrada y valor por defecto
    fun saludosConParametroDeEntradaYvalorPorDefecto(name: String = "Jaime", lastName: String) {
        System.out.println("----------saludosConParametroDeEntradaYvalorPorDefecto-----------")
        System.out.println("Saludos $name $lastName")
    }

    //Funcion con párametro de entrada y salida
    fun saludosConParametroDeEntradaYsalida(name: String): String {
        return "Saludos $name"
    }

    //Funcion con párametro de entrada y salida en una sola linea
    fun saludosEnUnaLinea(name: String) = "Saludos $name"
}