package org.example.lessons.lesson15.homeworks.material

fun main() {
    val bottom = BottomMaterials()
    bottom.addMaterial("Wood")
    bottom.addMaterial("Metal")
    bottom.printContainer()

    println()

    val interleaved = InterleavedMaterials()
    interleaved.addMaterial("A")
    interleaved.addMaterial("B")
    interleaved.addMaterial("C")
    interleaved.addMaterials(listOf("X", "Y"))
    interleaved.printContainer()

    println()

    val sorted = SortedMaterials()
    sorted.addMaterial("Wood")
    sorted.addMaterial("Aluminum")
    sorted.addMaterial("Glass")
    sorted.printContainer()

    println()

    val dictionary = DictionaryMaterials()
    dictionary.addMaterial("Old1")
    dictionary.addMaterial("Old2")
    dictionary.addMaterials(
        mapOf(
            "A" to "Apple",
            "B" to "Banana",
            "C" to "Cherry"
        )
    )
    dictionary.printContainer()
}
