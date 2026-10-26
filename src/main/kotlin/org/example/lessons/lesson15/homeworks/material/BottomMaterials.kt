package org.example.lessons.lesson15.homeworks.material

class BottomMaterials : Materials() {

    override fun addMaterial(material: String) {
        getMaterials().add(0, material)
    }
}