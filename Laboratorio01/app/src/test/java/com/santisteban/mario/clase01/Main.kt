package com.santisteban.mario.clase01

import org.junit.Test

class Main {
    @Test
    fun main() {
        val product1 = Product("Camisas", 25.0)
        val product2 = Product("Pantalones", 35.0)

        val cart = ShoppingCart()
        cart.addItem(product1, 2)
        cart.addItem(product2, 1)

        println(cart.getTotal())
    }
}