package org.example.lessons.lesson15.homeworks.material

abstract class Materials {
    private val materials = mutableListOf<String>()

    protected fun getMaterials(): MutableList<String> = materials

    open fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterials(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, material ->
            println("[$index]: $material")
        }
    }
}