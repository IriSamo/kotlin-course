package org.example.lessons.lesson15.homeworks.material

class DictionaryMaterials : Materials() {

    fun addMaterials(items: Map<String, String>) {
        val materials = getMaterials()

        items.forEach { (key, value) ->
            materials.add(0, key)
            materials.add(value)
        }
    }
}