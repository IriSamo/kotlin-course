package org.example.lessons.lesson11

//--Задачи на сигнатуру метода

//Напишите сигнатуру метода в которую входит модификатор доступа, название функции, список аргументов с типами и возвращаемое значение.
// В теле метода можешь сделать возврат объекта нужного типа если это требуется для устранения ошибок.

//1. Не принимает аргументов и не возвращает значения.
fun task1() {
}

//2. Принимает два целых числа и возвращает их сумму.
fun task2(a: Int, b: Int): Int {
    return a + b
}

//3. Принимает строку и ничего не возвращает.
fun task3(str: String) {
    println(str)
}

//4. Принимает список целых чисел и возвращает среднее значение типа Double.
fun task4(numbers: List<Int>): Double {
    return if (numbers.isNotEmpty()) {
        numbers.average()
    } else {
        0.0
    }
}

//5. Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
private fun task5(str: String?): Int? {
    return str?.length
}

//6. Не принимает аргументов и возвращает nullable вещественное число.
fun task6(): Double? {
    val randomValue = (0..10).random() * 0.1
    return if (randomValue > 0.5) {
        randomValue
    } else {
        null
    }
}

//7. Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
private fun task7(numbers: List<Int>?) {
    // тело метода
}

//8. Принимает целое число и возвращает nullable строку.
fun task8(n: Int): String? {
    return null
}

//9. Не принимает аргументов и возвращает список nullable строк.
fun task9(): List<String?> {
    return emptyList()
}

//10. Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun task10(str: String?, n: Int?): Boolean? {
    return null
}

//--Задачи на написание кода

//Напишите валидную сигнатуру метода а так же рабочий код для задач.

//11. Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(n: Int): Int {
    return n * 2
}

//12. Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
fun isEven(n: Int): Boolean {
    return n % 2 == 0
}

//13. Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
// Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n: Int) {
    if (n < 1) return
    for (i in 1..n) {
        print(i)
        print(" ")
    }
    println()
}

//14. Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке.
// Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(numbers: List<Int>): Int? {
    for (number in numbers) {
        if (number < 0) {
            return number
        }
    }
    return null
}

//15. Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку.
// Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(strings: List<String?>) {
    for (str in strings) {
        if (str == null) return
        println(str)
    }
}

fun main() {
    println("11. Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.")
    println(multiplyByTwo(5))
    println("12. Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.")
    println(isEven(4))
    println("13. Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.")
    printNumbersUntil(5)
    println("14. Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке.")
    println(findFirstNegative(listOf(1, 2, -3, 4)))
    println("15. Напишите функцию processList, которая принимает список строк.")
    processList(listOf("Hello", "World", null, "Kotlin"))
}