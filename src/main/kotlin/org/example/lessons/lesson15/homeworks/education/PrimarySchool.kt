package org.example.lessons.lesson15.homeworks.education

class PrimarySchool(
    name: String,
    address: String,
    studentCount: Int,
    val gradeLevels: Int
) : School(name, address, studentCount)