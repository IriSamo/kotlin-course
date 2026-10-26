package org.example.lessons.lesson14.homeworks

class Emotion(
    val type: String,
    val intensity: Int
) {
    fun express() {
        println("Emotion: $type")

        if (intensity <= 3) {
            println("Intensity: low")
        } else if (intensity <= 7) {
            println("Intensity: medium")
        } else {
            println("Intensity: high")
        }
    }
}

fun main() {
    val emotion = Emotion("Happiness", 8)
    emotion.express()
}