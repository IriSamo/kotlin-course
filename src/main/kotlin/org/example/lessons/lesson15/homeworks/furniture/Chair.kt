package org.example.lessons.lesson15.homeworks.furniture

open class Chair(
    material: String,
    color: String,
    val hasArmrests: Boolean
) : Furniture(material, color)
