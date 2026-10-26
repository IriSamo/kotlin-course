package org.example.lessons.lesson15.homeworks.furniture

class DiningChair(
    material: String,
    color: String,
    hasArmrests: Boolean,
    val isFoldable: Boolean
) : Chair(material, color, hasArmrests)