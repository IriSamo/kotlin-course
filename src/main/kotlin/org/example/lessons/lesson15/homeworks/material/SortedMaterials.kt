package org.example.lessons.lesson15.homeworks.material

class SortedMaterials : Materials() {

    override fun addMaterial(material: String) {
        val materials = getMaterials()
        materials.add(material)
        materials.sort()
    }
}