package org.example.lessons.lesson10

//--Задачи на работу со словарём

// 1. Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
val emptyMap = mapOf<Int, Int>()

// 2. Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
val floatDoubleMap = mapOf<Float, Double>(1.0f to 2.0, 3.0f to 4.0)

// 3. Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
val mutableMap = mutableMapOf<Int, String>()

// 4. Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".

// 5. Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом, которого в словаре нет.
val value1 = mutableMap[1]
val value2 = mutableMap[2]
val value3 = mutableMap[3] // null

// 6. Удалите определенный элемент из изменяемого словаря по его ключу.
fun removeFromMutableMap(int: Int) {
    mutableMap.remove(int)
}

// 7. Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение.
// Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
val doubleIntMap = mapOf<Double, Int>(1.0 to 2, 3.0 to 4)
fun divideKeysByValues() {
    for ((key, value) in doubleIntMap) {
        if (value == 0) {
            println("$key / $value = бесконечность")
        } else {
            println("$key / $value = ${key / value}")
        }
    }
}

// 8. Измените значение для существующего ключа в изменяемом словаре.
fun updateValueInMutableMap(key: Int, newValue: String) {
    mutableMap[key] = newValue
}

// 9. Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
fun mergeMaps(map1: Map<Int, String>, map2: Map<Int, String>): MutableMap<Int, String> {
    val mergedMap = mutableMapOf<Int, String>()
    for ((key, value) in map1) {
        mergedMap[key] = value
    }
    for ((key, value) in map2) {
        mergedMap[key] = value
    }
    return mergedMap
}

// 10. Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.
val stringListMap = mutableMapOf<String, List<Int>>()
fun addToStringListMap(key: String, values: List<Int>) {
    stringListMap[key] = values
}

// 11. Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. Добавь данные в словарь.
// Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку. Распечатай полученное множество.
val intSetMap = mutableMapOf<Int, MutableList<String>>()
fun addToSetInMap(key: Int, value: String) {
    val list = intSetMap[key] ?: mutableListOf()
    list.add(value)
    intSetMap[key] = list
    println("List for key $key: ${intSetMap[key]}")
}

// 12. Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.
val pairMap = mapOf<Pair<Int, Int>, String>(Pair(1, 2) to "A", Pair(5, 3) to "B", Pair(4, 5) to "C")
fun findValueWithFiveInPair() {
    for ((key, value) in pairMap) {
        if (key.first == 5 || key.second == 5) {
            println("Found value: $value for pair: $key")
        }
    }
}

//--Задачи на подбор оптимального типа для словаря

// 1. Словарь библиотека: Ключи - автор книги, значения - список книг
val libraryMap = mutableMapOf<String, MutableList<String>>()

// 2. Справочник растений: Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
val plantDirectoryMap = mutableMapOf<String, MutableList<String>>()

// 3. Четвертьфинала: Ключи - названия спортивных команд, значения - списки игроков каждой команды
val sportsTeamsMap = mutableMapOf<String, MutableMap<Int, MutableList<String>>>()

// 4. Курс лечения: Ключи - даты, значения - список препаратов принимаемых в дату
val treatmentScheduleMap = mutableMapOf<String, MutableMap<String, Double>>()

// 5. Словарь путешественника: Ключи - страны, значения - словари из городов со списком интересных мест.
val travelerMap = mutableMapOf<String, MutableMap<String, MutableList<String>>>()

fun main() {

    println("--Задачи на работу со словарём")

    println("1. Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.")
    println("emptyMap: $emptyMap")

    println("2. Создайте словарь, инициализированный несколькими парами \"ключ-значение\", где ключи - float, а значения - double")
    println("floatDoubleMap: $floatDoubleMap")

    println("3. Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.")
    println("mutableMap: $mutableMap")

    println("4. Имея изменяемый словарь, добавьте в него новые пары \"ключ-значение\".")
    mutableMap[1] = "значение1"
    println("mutableMap after adding: $mutableMap")
    mutableMap[2] = "значение2"
    println("mutableMap after adding: $mutableMap")

    println("5. Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом, которого в словаре нет.")
    println("Value for key 1: $value1")
    println("Value for key 2: $value2")
    println("Value for key 3 (not present): $value3")

    println("6. Удалите определенный элемент из изменяемого словаря по его ключу.")
    removeFromMutableMap(2)
    println("mutableMap after removing key: $mutableMap")

    println("7. Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение.")
    divideKeysByValues()

    println("8. Измените значение для существующего ключа в изменяемом словаре.")
    updateValueInMutableMap(1, "новое значение")

    println("9. Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.")
    println("Merged map: ${mergeMaps(mapOf(1 to "A"), mapOf(2 to "B"))}")

    println("10. Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.")
    addToStringListMap("key1", listOf(1, 2, 3))
    addToStringListMap("key2", listOf(4, 5, 6))
    println("String list map: $stringListMap")

    println("11. Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. Добавь данные в словарь.")
    addToSetInMap(1, "value1")
    addToSetInMap(1, "value2")
    println("Int set map: $intSetMap")

    println("12. Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.")
    println("Pair map: $pairMap")
    findValueWithFiveInPair()
}
