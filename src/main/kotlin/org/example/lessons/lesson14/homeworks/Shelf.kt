package org.example.lessons.lesson14.homeworks

class Shelf(val capacity: Int) {

    private val items = mutableListOf<String>()

    private val usedCapacity: Int
        get() = items.sumOf { it.length }

    fun canAccommodate(item: String): Boolean {
        return usedCapacity + item.length <= capacity
    }

    fun addItem(item: String): Boolean {
        if (!canAccommodate(item)) return false

        items.add(item)
        return true
    }

    fun removeItem(item: String): Boolean {
        return items.remove(item)
    }

    fun containsItem(item: String): Boolean {
        return items.contains(item)
    }

    fun getItems(): List<String> {
        return items.toList()
    }

    fun getRemainingCapacity(): Int {
        return capacity - usedCapacity
    }
}