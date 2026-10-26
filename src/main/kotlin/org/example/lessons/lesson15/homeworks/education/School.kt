package org.example.lessons.lesson15.homeworks.education

open class School(
    name: String,
    address: String,
    val studentCount: Int
) : EducationalInstitution(name, address)
