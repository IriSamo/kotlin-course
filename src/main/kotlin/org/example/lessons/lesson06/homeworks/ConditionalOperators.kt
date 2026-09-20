package org.example.lessons.lesson06.homeworks

/*
Задание 1: "Определение сезона"

Напишите функцию, которая на основе номера месяца распечатывает сезон года. Номера месяцев начинаются с единицы.
 */
fun printSeason(month: Int) {
    if (month !in 1..12) {
        println("Некорректный номер месяца")
        return
    }

    val monthName = when (month) {
        1 -> "Январь"
        2 -> "Февраль"
        3 -> "Март"
        4 -> "Апрель"
        5 -> "Май"
        6 -> "Июнь"
        7 -> "Июль"
        8 -> "Август"
        9 -> "Сентябрь"
        10 -> "Октябрь"
        11 -> "Ноябрь"
        else -> "Декабрь"
    }

    val season = when (month) {
        12, 1, 2 -> "Зима"
        in 3..5 -> "Весна"
        in 6..8 -> "Лето"
        else -> "Осень"
    }

    println("$monthName -> $season")
}

/*
Задание 2: "Расчет возраста питомца"

Создайте функцию, которая преобразует возраст собаки в "человеческие" годы.
До 2 лет каждый год собаки равен 10.5 человеческим годам, после - каждый год равен 4 человеческим годам.
Результат распечатай в консоль.
 */
fun convertDogAgeToHumanAge(dogAge: Int) {
    if (dogAge < 0) {
        println("Некорректный возраст питомца")
        return
    }

    val humanAge = if (dogAge <= 2) {
        dogAge * 10.5
    } else {
        21 + (dogAge - 2) * 4
    }

    println("Возраст питомца в человеческих годах: $humanAge")
}

/*
Задание 3: "Определение способа перемещения"

Напишите функцию, которая печатает в консоль, какой способ перемещения лучше использовать, исходя из длины маршрута.
Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".
 */
fun printTransportMethod(distance: Double) {
    if (distance < 0) {
        println("Некорректная длина маршрута")
        return
    }

    when {
        distance < 1 -> println("Длина маршрута: $distance км. Лучший способ перемещения: пешком")
        distance < 5 -> println("Длина маршрута: $distance км. Лучший способ перемещения: велосипед")
        else -> println("Длина маршрута: $distance км. Лучший способ перемещения: автотранспорт")
    }
}

/*
Задание 4: "Расчет бонусных баллов"

Клиенты интернет-магазина получают бонусные баллы за покупки.
Напишите функцию, которая принимает сумму покупки и печатает в консоль количество бонусных баллов:
2 балла за каждые 100 рублей при сумме покупки до 1000 рублей и 3 балла за каждые 100 рублей при сумме свыше этого.
 */

fun calculateBonusPoints(purchaseAmount: Double) {
    if (purchaseAmount < 0) {
        println("Некорректная сумма покупки")
        return
    }

    val bonusPoints = if (purchaseAmount <= 1000) {
        (purchaseAmount / 100).toInt() * 2
    } else {
        (purchaseAmount / 100).toInt() * 3
    }

    println("Сумма покупки: $purchaseAmount руб. Бонусные баллы: $bonusPoints")
}

/*
Задание 5: "Определение типа документа"

В системе хранения документов каждый файл имеет расширение.
Напишите функцию, которая на основе расширения файла печатает в консоль его тип:
"Текстовый документ", "Изображение", "Таблица" или "Неизвестный тип".
 */

fun printDocumentType(fileExtension: String) {
    when (val fileExtension = fileExtension.lowercase()) {
        "txt", "doc", "docx" -> println("Тип документа: $fileExtension - Текстовый документ")
        "jpg", "jpeg", "png", "gif" -> println("Тип документа: $fileExtension - Изображение")
        "xls", "xlsx", "csv" -> println("Тип документа: $fileExtension - Таблица")
        else -> println("Тип документа: $fileExtension - Неизвестный тип")
    }
}

/*
Задание 6: "Конвертация температуры"

Создайте функцию, которая конвертирует температуру из градусов Цельсия в Фаренгейты и наоборот
в зависимости от указанной единицы измерения (C/F). Единицу измерения нужно передать вторым аргументом функции.
Несколько аргументов передаются через запятую. Распечатай в консоль результат конвертации с добавлением единицы измерения.
Чтобы добавить единицу измерения после результата, используй функцию печати без переноса строки print("C") или print("F").
 */

fun convertTemperature(value: Double, unit: String) {
    when (unit.uppercase()) {
        "C" -> {
            val fahrenheit = value * 9 / 5 + 32
            println("$value°C = $fahrenheit°F")
        }

        "F" -> {
            val celsius = (value - 32) * 5 / 9
            println("$value°F = $celsius°C")
        }

        else -> println("Некорректная единица измерения. Используйте 'C' для Цельсия или 'F' для Фаренгейта.")
    }
}

/*
Задание 7: "Подбор одежды по погоде"

Напишите функцию, которая на основе температуры воздуха рекомендует тип одежды:
"куртка и шапка" при температуре ниже +10, "ветровка" от +10 до +18 градусов включительно и "футболка и шорты"
при температуре выше +18 градусов. При температурах ниже -30 и выше +35 рекомендуйте не выходить из дома.
 */

fun recommendClothing(temperature: Double) {
    when {
        temperature < -30 || temperature > 35 -> println("Температура: $temperature°C. Рекомендация: не выходить из дома.")
        temperature < 10 -> println("Температура: $temperature°C. Рекомендация надеть: куртку и шапку.")
        temperature <= 18 -> println("Температура: $temperature°C. Рекомендация надеть: ветровку.")
        else -> println("Температура: $temperature°C. Рекомендация надеть: футболку и шорты.")
    }
}

/*
Задание 8: "Выбор фильма по возрасту"

Кинотеатр предлагает фильмы разных возрастных категорий. Напишите функцию, которая принимает возраст зрителя и
возвращает доступные для него категории фильмов: "детские" (от 0 до 9), "подростковые" (от 10 до 18), "18+" для остальных.
 */

fun getAvailableMovieCategories(age: Int): String {
    return when {
        age < 0 -> "Возраст: $age. Некорректный возраст"
        age <= 9 -> "Возраст: $age. Доступные категории фильмов: детские"
        age <= 18 -> "Возраст: $age. Доступные категории фильмов: подростковые"
        else -> "Возраст: $age. Доступные категории фильмов: 18+"
    }
}

fun main() {
    println("# Задание 1: \"Определение сезона\"")
    printSeason(1)  // Зима
    printSeason(4)  // Весна
    printSeason(7)  // Лето
    printSeason(10) // Осень
    printSeason(13) // Некорректный номер месяца

    println("\n# Задание 2: \"Расчет возраста питомца\"")
    convertDogAgeToHumanAge(1)  // 10.5
    convertDogAgeToHumanAge(2)  // 21.0
    convertDogAgeToHumanAge(3)  // 25.0
    convertDogAgeToHumanAge(-1) // Некорректный возраст питомца

    println("\n# Задание 3: \"Определение способа перемещения\"")
    printTransportMethod(0.5) // пешком
    printTransportMethod(3.0) // велосипед
    printTransportMethod(10.0) // автотранспорт
    printTransportMethod(-10.0) // Некорректная длина маршрута

    println("\n# Задание 4: \"Расчет бонусных баллов\"")
    calculateBonusPoints(500.0)  // 10
    calculateBonusPoints(1500.0) // 45
    calculateBonusPoints(-100.0) // Некорректная сумма покупки

    println("\n# Задание 5: \"Определение типа документа\"")
    printDocumentType("txt")  // Текстовый документ
    printDocumentType("jpg")  // Изображение
    printDocumentType("xls")  // Таблица
    printDocumentType("pdf")  // Неизвестный тип

    println("\n# Задание 6: \"Конвертация температуры\"")
    convertTemperature(0.0, "C")   // 32.0°F
    convertTemperature(32.0, "F")  // 0.0°C
    convertTemperature(100.0, "C") // 212.0°F
    convertTemperature(212.0, "F") // 100.0°C
    convertTemperature(25.0, "X")  // Некорректная еди

    println("\n# Задание 7: \"Подбор одежды по погоде\"")
    recommendClothing(-35.0) // не выходить из дома
    recommendClothing(5.0)   // куртка и шапка
    recommendClothing(15.0)  // ветровка
    recommendClothing(25.0)  // футболка и шорты
    recommendClothing(40.0)  // не выходить из дома

    println("\n# Задание 8: \"Выбор фильма по возрасту\"")
    println(getAvailableMovieCategories(5))   // детские
    println(getAvailableMovieCategories(15))  // подростковые
    println(getAvailableMovieCategories(20))  // 18+
    println(getAvailableMovieCategories(-1))  // Некорректный возраст
}