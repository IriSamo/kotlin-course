package org.example.lessons.lesson14.homeworks

class Rack(private val maxShelves: Int) {

    private val shelves = mutableListOf<Shelf>()

    fun addShelf(shelf: Shelf): Boolean {
        if (shelves.size >= maxShelves) return false
        if (shelves.contains(shelf)) return false

        shelves.add(shelf)
        return true
    }

    fun removeShelf(index: Int): List<String> {
        if (index !in shelves.indices) return emptyList()

        return shelves.removeAt(index).getItems()
    }

    fun addItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.addItem(item)) {
                return true
            }
        }

        return false
    }

    fun removeItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.removeItem(item)) {
                return true
            }
        }

        return false
    }

    fun containsItem(item: String): Boolean {
        return shelves.any { it.containsItem(item) }
    }

    fun getShelves(): List<Shelf> {
        return shelves.toList()
    }

    fun printContents() {
        println("========== Rack contents ==========")

        for ((index, shelf) in shelves.withIndex()) {
            println("Shelf $index")
            println("  Capacity: ${shelf.capacity}")
            println("  Remaining capacity: ${shelf.getRemainingCapacity()}")
            println("  Items: ${shelf.getItems()}")
            println("-----------------------------------")
        }
    }

    fun advancedRemoveShelf(index: Int): List<String> {
        if (index !in shelves.indices) return emptyList()

        val removedShelf = shelves[index]
        val itemsToRedistribute = removedShelf.getItems()
            .sortedByDescending { it.length }

        // Сначала удаляем полку из стеллажа.
        shelves.removeAt(index)

        val unplacedItems = mutableListOf<String>()

        // Перераспределяем предметы, начиная с самых длинных.
        for (item in itemsToRedistribute) {
            if (!addItem(item)) {
                unplacedItems.add(item)
            }
        }

        return unplacedItems.toList()
    }
}