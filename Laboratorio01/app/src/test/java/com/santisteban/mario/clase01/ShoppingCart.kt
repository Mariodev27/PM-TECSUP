package com.santisteban.mario.clase01

class ShoppingCart {
    private val items = mutableMapOf<Product, Int>()

    fun addItem(product: Product, quantity: Int) {
        if (items.containsKey(product)) {
            items[product] = items[product]!! + quantity
        } else {
            items[product] = quantity
        }
    }

    fun getTotal(): String {
        var total = 0.0
        val sb = StringBuilder()
        sb.appendLine("Shopping Cart:")
        for ((product, quantity) in items) {
            sb.appendLine("${product.name} x $quantity = $${product.price}")
            total += product.price * quantity
        }
        sb.appendLine("Total: $$total")
        return sb.toString()
    }
}