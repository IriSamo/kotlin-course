package org.example.lessons.lesson07.homeworks

import org.example.advancedTask1
import org.example.advancedTask2
import org.example.advancedTask3
import org.example.advancedTask4
import org.example.advancedTask5
import org.example.advancedTask5_1
import org.example.advancedTask6
import org.example.task1
import org.example.task10
import org.example.task11
import org.example.task12
import org.example.task12_continue
import org.example.task13
import org.example.task13_continue
import org.example.task2_1
import org.example.task2_2
import org.example.task3
import org.example.task4
import org.example.task5
import org.example.task6
import org.example.task7
import org.example.task8_1
import org.example.task8_2
import org.example.task9
import kotlin.math.pow

//-Задания для цикла for
//--Прямой диапазон

//1. Напишите цикл for, который выводит числа от 1 до 5.
fun task1() {
    println("task1")
    for (i in 1..5) {
        println(i)
    }
}

//2. Напишите цикл for, который выводит четные числа от 1 до 10.
fun task2_1() {
    println("\ntask2_1")
    for (i in 2..10 step 2) {
        println(i)
    }
}

fun task2_2() {
    println("\ntask2_2")
    for (i in 2..10) {
        if (i % 2 == 0) {
            println(i)
        }
    }
}
//--Обратный диапазон

//3. Создайте цикл for, который выводит числа от 5 до 1
fun task3() {
    println("\ntask3")
    for (i in 5 downTo 1) {
        println(i)
    }
}

//4. Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
fun task4() {
    println("\ntask4")
    for (i in 10 downTo 1 step 2) {
        println(i)
    }
}

//--С шагом (step)
//5. Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
fun task5() {
    println("\ntask5")
    for (i in 1..9 step 2) {
        println(i)
    }
}

//6. Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
fun task6() {
    println("\ntask6")
    for (i in 1..20 step 3) {
        println(i)
    }
}

//--Использование до (until)
//7. Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size.
fun task7(size: Int) {
    println("\ntask7")
    for (i in 3 until size step 2) {
        println(i)
    }
}
//-Задания для цикла while
//--Цикл while

//8. Создайте цикл while, который выводит квадраты чисел от 1 до 5.
fun task8_1() {
    println("\ntask8_1")
    for (i in 1..5) {
        println(i * i)
    }
}

fun task8_2() {
    println("\ntask8_2")
    for (i in 1..5) {
        println(i.toDouble().pow(2.0).toInt())
    }
}

//9. Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
fun task9() {
    println("\ntask9")
    var i = 10
    while (i >= 5) {
        println(i--)
    }
}

//--Цикл do while
//10.  цикл do while, чтобы вывести числа от 5 до 1.
fun task10() {
    println("\ntask10")
    var i = 5
    do {
        println(i--)
    } while (i >= 1)
}

//11. Создайте цикл do while, который повторяется, пока счетчик меньше 10, начиная с 5.
fun task11() {
    println("\ntask11")
    var i = 5
    do {
        println(i++)
    } while (i < 10)
}

//-Задания для прерывания и пропуска итерации
//--Использование break

//12. Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
fun task12() {
    println("\ntask12")
    for (i in 1..10) {
        if (i == 6) {
            break
        }
        println(i)
    }
}

//13. Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
fun task13() {
    println("\ntask13")
    var i = 1
    while (true) {
        println(i)
        if (i == 10) {
            break
        }
        i++
    }
}

//--Использование continue
//12. В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
fun task12_continue() {
    println("\ntask12_continue")
    for (i in 1..10) {
        if (i % 2 == 0) {
            continue
        }
        println(i)
    }
}

//13. Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
fun task13_continue() {
    println("\ntask13_continue")
    var i = 1
    while (i <= 10) {
        if (i % 3 == 0) {
            i++
            continue
        }
        println(i++)
    }
}

//-Задача повышенной сложности (разбирается отдельно от основной домашки и награждается отдельным стимом за разбор).
// Её выполнять по желанию, проверка не выполняется.

//1. Используя вложенный цикл реализовать таблицу умножения, как на картинке.

fun advancedTask1() {
    println("\nadvancedTask1")
    for (i in 1..10) {
        for (j in 1..10) {
            print("${i * j}\t")
        }
        println()
    }
}

//2. Напишите функцию, которая суммирует числа от 1 до 'arg' с помощью цикла for. 'arg' - целочисленный аргумент функции.
fun advancedTask2(arg: Int) {
    println("\nadvancedTask2")
    var sum = 0
    for (i in 1..arg) {
        sum += i
    }
    println(sum)
}

//3. Напишите функцию, которая вычисляет факториал числа 'arg' с использованием цикла while.
fun advancedTask3(arg: Int) {
    println("\nadvancedTask3")
    var factorial = 1
    var i = 1
    while (i <= arg) {
        factorial *= i
        i++
    }
    println(factorial)
}

//4. Напишите функцию, которая находит сумму всех четных чисел от 2 до 'arg', используя цикл while.
fun advancedTask4(arg: Int) {
    println("\nadvancedTask4")
    var sum = 0
    var i = 2
    while (i <= arg) {
        sum += i
        i += 2
    }
    println(sum)
}

//5. Напишите функцию, которая используя вложенные циклы while, выведет заполненный прямоугольник размером 5x3 из символов *
fun advancedTask5() {
    println("\nadvancedTask5")
    var i = 1
    while (i <= 3) {
        var j = 1
        while (j <= 5) {
            print("*")
            j++
        }
        println()
        i++
    }
}

//6. Напишите функцию, которая используя цикл for найдёт суммы чётных и нечётных значений чисел от 1 до arg.
fun advancedTask6(arg: Int) {
    println("\nadvancedTask6")
    var evenSum = 0
    var oddSum = 0
    for (i in 1..arg) {
        if (i % 2 == 0) {
            evenSum += i
        } else {
            oddSum += i
        }
    }
    println("Sum of even numbers: $evenSum")
    println("Sum of odd numbers: $oddSum")
}

fun main() {
    task1()
    task2_1()
    task2_2()
    task3()
    task4()
    task5()
    task6()
    task7(10)
    task8_1()
    task8_2()
    task9()
    task10()
    task11()
    task12()
    task13()
    task12_continue()
    task13_continue()
    advancedTask1()
    advancedTask2(10)
    advancedTask3(5)
    advancedTask4(10)
    advancedTask5()
    advancedTask6(10)
    advancedTask5_1()
}