package org.example.lessons.lesson14.homeworks

object Moon {
    val isVisible: Boolean = true
    val phase: String = "Full Moon"

    fun showPhase() {
        println("Current moon phase: $phase")
    }
}

fun main() {
    Moon.showPhase()
}