package org.example.lessons.lesson15.homeworks.education

class HighSchool(
    name: String,
    address: String,
    studentCount: Int,
    val hasScienceLabs: Boolean
) : School(name, address, studentCount)
