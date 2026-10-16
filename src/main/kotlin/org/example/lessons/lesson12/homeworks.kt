package org.example.lessons.lesson12

fun main() {
    val numbers = listOf(10, 20, 30, 40, 50, 60, 70, 80)
    val emptyNumbers = emptyList<Int>()
    val words = listOf("Kotlin", "Java", "Python", "CSharp", "JavaScript")
    val nullableWords = listOf("Kotlin", null, "Java", null, "Python")

    //--Задачи на приведение коллекции к значению

    println("1. Проверить, что размер коллекции больше 5 элементов.")
    println(numbers.size > 5)

    println("2. Проверить, что коллекция пустая")
    println(emptyNumbers.isEmpty())

    println("3. Проверить, что коллекция не пустая")
    println(numbers.isNotEmpty())

    println("4. Взять элемент по индексу или создать значение если индекса не существует")
    println(numbers.getOrElse(10) { -1 })

    println("5. Собрать коллекцию в строку")
    println(numbers.joinToString())

    println("6. Посчитать сумму всех значений")
    println(numbers.sum())

    println("7. Посчитать среднее")
    println(numbers.average())

    println("8. Взять максимальное число")
    println(numbers.maxOrNull())

    println("9. Взять минимальное число")
    println(numbers.minOrNull())

    println("10. Взять первое число или null")
    println(emptyNumbers.firstOrNull())

    println("11. Проверить что коллекция содержит элемент")
    println(numbers.contains(30))

    //--Задачи на обработку коллекций

    println("12. Отфильтровать коллекцию по диапазону 18-30")
    println(filterAges(numbers))

    println("13. Выбрать числа, которые не делятся на 2 и 3 одновременно")
    println(filterNotDivisibleByTwoAndThree(numbers))

    println("14. Очистить текстовую коллекцию от null элементов")
    println(removeNullWords(nullableWords))

    println("15. Преобразовать текстовую коллекцию в коллекцию длин слов")
    println(getWordLengths(words))

    println("16. Преобразовать текстовую коллекцию в мапу, где ключи - перевёрнутые слова, а значения - длина слов")
    println(getReversedWordMap(words))

    println("17. Отсортировать список в алфавитном порядке")
    println(sortWords(words))

    println("18. Взять первые 3 элемента списка")
    println(takeFirstThree(numbers))

    println("19. Распечатать квадраты элементов списка")
    printSquares(numbers)

    println("20. Группировать список по первой букве слов")
    println(groupWordsByFirstLetter(words))

    println("21. Очистить список от дублей")
    println(removeDuplicates(listOf(1, 2, 2, 3, 3, 4)))

    println("22. Отсортировать список по убыванию")
    println(sortDescending(numbers))

    println("23. Взять последние 3 элемента списка")
    println(takeLastThree(numbers))


    println("24. Характеристика числовой коллекции")

    val characteristicCases = listOf(
        emptyList<Int>(),
        listOf(1, 2, 3),
        listOf(0, 1, 2, 3, 4),
        listOf(3000, 3000, 3000, 3000, 3000),
        listOf(8, 9, 10, 11, 12),
        listOf(111, 22, 33, 44, 555),
        listOf(-20, -30, -40, -50, -60),
        listOf(1100, 1100, 1100, 1100, 1100),
        listOf(3, 14, 1, 2, 4),
        listOf(7, 8, 9, 11, 12)
    )

    characteristicCases.forEach {
        println("$it -> ${getCollectionCharacteristic(it)}")
    }


    println("25. Анализ учебных оценок")

    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    println(getTopGrades(grades))

    // Начальные значения для задач 26 и 27

    val furniture = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер",
        "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик",
        "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник",
        "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка",
        "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница",
        "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед",
        "Тумба", "игрушка", "Настенные часы", "подсвечник",
        "Журнальный столик", "сувенир", "Корзина для белья", "посуда",
        "Настольная лампа", "торшер", "Этажерка"
    )

    println("26. Создание каталога по первой букве")
    println(getCatalog(furniture))

    println("27. Подсчёт средней длины слов в списке")
    println(getAverageWordLength(furniture))


    println("28. Категоризация чисел")

    val categoryNumbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    println(categorizeNumbers(categoryNumbers))


    println("29. Поиск первого подходящего элемента")

    val ages = listOf(22, 18, 30, 45, 17, null, 60)
    println(findFirstAge(ages, 18))
}

// Задача 12. Отфильтровать коллекцию по диапазону 18-30
fun filterAges(numbers: List<Int>): List<Int> {
    return numbers.filter { it in 18..30 }
}

// Задача 13. Выбрать числа, которые не делятся на 2 и 3 одновременно
fun filterNotDivisibleByTwoAndThree(numbers: List<Int>): List<Int> {
    return numbers.filterNot { it % 2 == 0 && it % 3 == 0 }
}

// Задача 14. Очистить текстовую коллекцию от null элементов
fun removeNullWords(words: List<String?>): List<String> {
    return words.filterNotNull()
}

// Задача 15. Преобразовать текстовую коллекцию в коллекцию длин слов
fun getWordLengths(words: List<String>): List<Int> {
    return words.map { it.length }
}

// Задача 16. Преобразовать текстовую коллекцию в мапу, где ключи - перевёрнутые слова, а значения - длина слов
fun getReversedWordMap(words: List<String>): Map<String, Int> {
    return words.associate { it.reversed() to it.length }
}

// Задача 17. Отсортировать список в алфавитном порядке
fun sortWords(words: List<String>): List<String> {
    return words.sorted()
}

// Задача 18. Взять первые 3 элемента списка
fun takeFirstThree(numbers: List<Int>): List<Int> {
    return numbers.take(3)
}

// Задача 19. Распечатать квадраты элементов списка
fun printSquares(numbers: List<Int>) {
    numbers.forEach { println(it * it) }
}

// Задача 20. Группировать список по первой букве слов
fun groupWordsByFirstLetter(words: List<String>): Map<Char, List<String>> {
    return words.groupBy { it.first() }
}

// Задача 21. Очистить список от дублей
fun removeDuplicates(numbers: List<Int>): List<Int> {
    return numbers.distinct()
}

// Задача 22. Отсортировать список по убыванию
fun sortDescending(numbers: List<Int>): List<Int> {
    return numbers.sortedDescending()
}

// Задача 23. Взять последние 3 элемента списка
fun takeLastThree(numbers: List<Int>): List<Int> {
    return numbers.takeLast(3)
}

// Задача 24. Характеристика числовой коллекции
fun getCollectionCharacteristic(numbers: List<Int>): String {
    return when {
        numbers.isEmpty() -> "Пусто"
        numbers.size < 5 -> "Короткая"
        numbers.first() == 0 -> "Стартовая"
        numbers.sum() > 10000 -> "Массивная"
        numbers.average() == 10.0 -> "Сбалансированная"
        numbers.joinToString("").length == 20 -> "Клейкая"
        numbers.maxOrNull()!! < -10 -> "Отрицательная"
        numbers.minOrNull()!! > 1000 -> "Положительная"
        numbers.contains(3) && numbers.contains(14) -> "Пи***тая"
        else -> "Уникальная"
    }
}

// Задача 25. Анализ учебных оценок
fun getTopGrades(grades: List<Int>): List<Int> {
    return grades
        .filter { it >= 60 }
        .sorted()
        .take(3)
}

// Задача 26. Создание каталога по первой букве
fun getCatalog(words: List<String>): Map<Char, List<String>> {
    return words
        .map { it.lowercase() }
        .groupBy { it.first() }
}

// Задача 27. Подсчёт средней длины слов в списке
fun getAverageWordLength(words: List<String>): String {
    return "Средняя длина слова: %.2f".format(
        words.map { it.length }.average()
    )
}

// Задача 28. Категоризация чисел
fun categorizeNumbers(numbers: List<Int>): Map<String, List<Int>> {
    return numbers
        .distinct()
        .sortedDescending()
        .groupBy {
            if (it % 2 == 0) "четные" else "нечетные"
        }
}

// Задача 29. Поиск первого подходящего элемента
fun findFirstAge(ages: List<Int?>, minAge: Int): Int? {
    return ages.firstOrNull { it != null && it > minAge }
}
