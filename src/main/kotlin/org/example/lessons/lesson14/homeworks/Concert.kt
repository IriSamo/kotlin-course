package org.example.lessons.lesson14.homeworks

class Concert(
    val band: String,
    val venue: String,
    val price: Double,
    val capacity: Int
) {
    private var ticketsSold: Int = 0

    fun showInfo() {
        println("Band: $band")
        println("Venue: $venue")
        println("Price: $price")
        println("Capacity: $capacity")
        println("Tickets sold: $ticketsSold")
    }

    fun buyTicket() {
        if (ticketsSold < capacity) {
            ticketsSold++
            println("Ticket purchased successfully!")
        } else {
            println("Sorry, all tickets are sold out.")
        }
    }
}

fun main() {
    val concert = Concert("Imagine Dragons", "Montreal Arena", 80.0, 100)

    concert.showInfo()

    concert.buyTicket()
    concert.buyTicket()

    concert.showInfo()
}