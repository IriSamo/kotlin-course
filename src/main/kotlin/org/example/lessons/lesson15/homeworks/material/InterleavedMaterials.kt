package org.example.lessons.lesson15.homeworks.material

class InterleavedMaterials : Materials() {

    fun addMaterials(newMaterials: List<String>) {
        val materials = getMaterials()

        newMaterials.forEachIndexed { index, material ->
            materials.add(index * 2, material)
        }
    }
}