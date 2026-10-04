package org.example.lessons.lesson09

//--Работа с массивами Array

//1. Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
val array1 = arrayOf(1, 2, 3, 4, 5)

//2. Создайте пустой массив строк размером 10 элементов.
val array2 = Array(10) { "" }

//3. Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
val array3 = Array(5) { i -> (i * 2).toDouble() }

//4. Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
val array4 = IntArray(5) { i -> i * 3 }

//5. Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
val array5 = arrayOfNulls<String>(3).apply {
    this[0] = null
    this[1] = "Hello"
    this[2] = "World"
}

//6. Создайте массив целых чисел и скопируйте его в новый массив в цикле.
fun copyArray(source: IntArray, destination: IntArray): IntArray {

    for (i in source.indices) {
        destination[i] = source[i]
    }
    return destination
}

//7. Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого. Распечатайте полученные значения.
fun subtractArrays(array1: IntArray, array2: IntArray): IntArray {
    val result = IntArray(array1.size)
    for (i in array1.indices) {
        result[i] = array1[i] - array2[i]
    }

    return result
}

//8. Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, печатаем -1. Реши задачу через цикл while.
fun findIndexOfFive(array: IntArray): Int {
    var i = 0
    while (i < array.size) {
        if (i == 5) {
            return array[i]
        }
        i++
    }
    return -1
}

//9. Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль.
// Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
fun printEvenOdd(array: IntArray) {
    for (i in array.indices) {
        val parity = if (array[i] % 2 == 0) "even" else "odd"
        println("${array[i]} is $parity")
    }
}

//10. Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент,
// в котором принятая строка является подстрокой (метод contains()). Распечатай найденный элемент.
fun findStringInArray(array: Array<String>, searchString: String): String? {
    for (s in array) {
        if (s.contains(searchString)) {
            return s
        }
    }
    return null
}

//--Работа со списками List

//1. Создайте пустой неизменяемый список целых чисел.
val emptyList: List<Int> = listOf()

//2. Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
val stringList: List<String> = listOf("Hello", "World", "Kotlin")

// 3. Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
val mutableIntList = mutableListOf(1, 2, 3, 4, 5)

// 4. Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
fun addElementsToMutableList(list: MutableList<Int>, elements: List<Int>): List<Int> {
    list.addAll(elements)

    return list
}

// 5. Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
val mutableStringList: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
fun removeElementFromMutableList(list: MutableList<String>, element: String): List<String> {
    list.remove(element)

    return list
}

//6. Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
fun printListElements(list: List<Int>) {
    for (element in list) {
        println(element)
    }
}
//7. Создайте список строк и получите из него второй элемент, используя его индекс.
fun getSecondElement(list: List<String>): String? {
    return if (list.size >= 2) list[1] else null
}

//8. Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент с индексом 2 на новое значение).
fun updateElementAtIndex(list: MutableList<Int>, index: Int, newValue: Int): List<Int> {
    if (index in list.indices) {
        list[index] = newValue
    }
    return list
}

//9. Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.
fun mergeStringLists(list1: List<String>, list2: List<String>): List<String> {
    val mergedList = mutableListOf<String>()
    for (element in list1) {
        mergedList.add(element)
    }
    for (element in list2) {
        mergedList.add(element)
    }
    return mergedList
}

//10. Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
fun findMinMax(list: List<Int>): Pair<Int?, Int?> {
    if (list.isEmpty()) return Pair(null, null)

    var min = list[0]
    var max = list[0]

    for (element in list) {
        if (element < min) min = element
        if (element > max) max = element
    }

    return Pair(min, max)
}

//11. Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
fun filterEvenNumbers(list: List<Int>): List<Int> {
    val evenNumbers = mutableListOf<Int>()
    for (element in list) {
        if (element % 2 == 0) {
            evenNumbers.add(element)
        }
    }
    return evenNumbers
}

//--Работа с Множествами Set

//1. Создайте пустое неизменяемое множество целых чисел.
val emptySet: Set<Int> = setOf()

//2. Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
val immutableSet: Set<Int> = setOf(1, 2, 3)

//3. Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
val mutableStringSet = mutableSetOf("Kotlin", "Java", "Scala")

//4. Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
fun addElementsToMutableSet(set: MutableSet<String>, elements: Set<String>): Set<String> {
    set.addAll(elements)
    return set
}

//5. Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
fun removeElementFromMutableSet(set: MutableSet<Int>, element: Int): Set<Int> {
    set.remove(element)
    return set
}

//6. Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
fun printSetElements(set: MutableSet<String>) {
    for (element in set) {
        println(element)
    }
}

//7. Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка.
// Нужно распечатать булево значение true если строка есть. Реши задачу через цикл.
fun checkStringInSet(set: Set<String>, str: String): Boolean {
    for (element in set) {
        if (element == str) {
            return true
        }
    }
    return false
}

//8. Создайте неизменяемое множество строк и конвертируйте его в изменяемый список строк с использованием цикла.
fun convertSetToMutableList(set: Set<String>): MutableList<String> {
    val mutableList = mutableListOf<String>()
    for (element in set) {
        mutableList.add(element)
    }
    return mutableList
}


fun main() {
    println("-- Работа с массивами Array --")
    println("1. Array of integers: ${array1.joinToString(", ")}")
    println("2. Empty array of strings: ${array2.joinToString(", ")}")
    println("3. Array of doubles: ${array3.joinToString(", ")}")
    println("4. Array of integers with values multiplied by 3: ${array4.joinToString(", ")}")
    println("5. Array of nullable strings: ${array5.joinToString(", ")}")

    val array = intArrayOf(11, 22, 33, 44, 55)
    val copyArray6 = copyArray(array, IntArray(array.size))
    println("6. Copied array: ${copyArray6.joinToString(", ")}")

    val arr7 = intArrayOf(1, 2, 3, 4, 5)
    val subtractedArray = subtractArrays(array, arr7)
    println("7. Subtracted arrays: ${subtractedArray.joinToString(", ")}")

    val arr8 = intArrayOf(2, 3, 4, 5, 6, 7, 8)
    println("8. Index of 5: ${findIndexOfFive(arr8)}")

    println("9. Even/Odd elements:")
    printEvenOdd(array)

    println("10. Found string: ${findStringInArray(arrayOf("Kotlin", "Java", "Python"), "Java")}")

    println("\n-- Работа со списками List --")
    println("1. Empty list: $emptyList")
    println("2. Immutable list of strings: $stringList")
    println("3. Mutable list of integers: $mutableIntList")
    println("4. Mutable list after adding elements: ${addElementsToMutableList(mutableIntList, listOf(6, 7, 8))}")
    println("5. Mutable list after removing 'World': ${removeElementFromMutableList(mutableStringList, "World")}")
    println("6. Elements of the list: ")
    printListElements(mutableIntList)
    println("7. Second element of the list: ${getSecondElement(mutableStringList)}")
    println("8. Mutable list after updating index 2: ${updateElementAtIndex(mutableIntList, 2, 99)}")
    println("9. Merged string lists: ${mergeStringLists(listOf("A", "B"), listOf("C", "D"))}")
    println("10. Min and Max of the list: ${findMinMax(mutableIntList)}")
    println("11. Even numbers from the list: ${filterEvenNumbers(mutableIntList)}")

    println("\n-- Работа с Множествами Set --")
    println("1. Empty set: $emptySet")
    println("2. Immutable set of integers: $immutableSet")
    println("3. Mutable set of strings: $mutableStringSet")
    println("4. Mutable set after adding elements: ${addElementsToMutableSet(mutableStringSet, setOf("Kotlin", "Swift", "Go"))}")
    println("5. Mutable set after removing 2: ${removeElementFromMutableSet(mutableSetOf(1, 2, 3), 2)}")
    println("6. Elements of the set: ")
    printSetElements(mutableStringSet)
    println("7. Check if 'Kotlin' is in the set: ${checkStringInSet(mutableStringSet, "Kotlin")}")
    println("8. Converted set to mutable list: ${convertSetToMutableList(mutableStringSet)}")
}