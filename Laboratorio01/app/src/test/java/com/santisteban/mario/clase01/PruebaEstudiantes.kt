package com.santisteban.mario.clase01

import org.junit.Test

class PruebaEstudiantes {

    @Test
    fun executeTest(){
        val userMori = Estudiante("Magno", 20, 1 )
        val userMyriam = Estudiante("Myriam", 18, 2 )
        val userDeysi = Estudiante("Deysi", 19, 3 )

        System.out.println("------>> Nombre :${userMori.nombre} \n " +
                "Edad: ${userMori.edad} \n" +
                "Codigo: ${userMori.codigo}<<------")

        val prom = (userMori.edad + userMyriam.edad + userDeysi.edad)/3

        System.out.println("------>> Promedio :$prom <<------")

        val prom2 = (userMori.edad.plus(userMyriam.edad).plus(userDeysi.edad)).div(3)

        System.out.println("------>> Promedio :$prom <<------")

        val listStudents = listOf<Estudiante>(userMori, userMyriam, userDeysi)

        var sumEdades: Int = 0
        listStudents.forEach { student ->
            sumEdades += student.edad
        }

        val promEdades = sumEdades.div(listStudents.size)

        System.out.println("-------------> Promedio: $promEdades<-------------")
    }
}