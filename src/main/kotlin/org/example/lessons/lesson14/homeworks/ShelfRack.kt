package org.example.lessons.lesson14.homeworks

fun main() {
    val rack = Rack(3)

    val shelf1 = Shelf(10)
    val shelf2 = Shelf(15)
    val shelf3 = Shelf(8)

    rack.addShelf(shelf1)
    rack.addShelf(shelf2)
    rack.addShelf(shelf3)

    rack.addItem("Book")      // 4 буквы
    rack.addItem("Laptop")    // 6 букв
    rack.addItem("Pen")       // 3 буквы
    rack.addItem("Notebook")  // 8 букв
    rack.addItem("Cup")       // 3 буквы

    rack.printContents()

    println("\nContains Laptop: ${rack.containsItem("Laptop")}")

    println("Remove Pen: ${rack.removeItem("Pen")}")

    println("\nAdvanced remove shelf 0:")
    val unplacedItems = rack.advancedRemoveShelf(0)

    println("Unplaced items: $unplacedItems")

    rack.printContents()
}