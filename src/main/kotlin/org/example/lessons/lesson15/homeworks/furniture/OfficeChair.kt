package org.example.lessons.lesson15.homeworks.furniture

class OfficeChair(
    material: String,
    color: String,
    hasArmrests: Boolean,
    val hasWheels: Boolean
) : Chair(material, color, hasArmrests)