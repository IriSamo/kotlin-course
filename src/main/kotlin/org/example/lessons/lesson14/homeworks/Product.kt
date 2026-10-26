package org.example.lessons.lesson14.homeworks

data class Product(
    val name: String,
    val price: Double,
    val quantity: Int
)

fun main() {
    val product = Product("Milk", 2.5, 3)

    println(product)
}