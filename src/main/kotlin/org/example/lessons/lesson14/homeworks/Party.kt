package org.example.lessons.lesson14.homeworks

class Party(
    val location: String,
    val attendees: Int
) {
    fun details() {
        println("Location: $location")
        println("Attendees: $attendees")
    }
}

fun main() {
    val party = Party("New York", 20)
    party.details()
}