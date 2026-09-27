package org.example.lessons.lesson08.homeworks

//1. Преобразование строк
//Создайте функцию, которая будет анализировать входящие фразы и применять к ним различные преобразования, делая текст более ироничным или забавным.
// Функция должна уметь распознавать ключевые слова или условия и соответственно изменять фразу.
//
//Правила проверки и преобразования:
//Если фраза содержит слово "невозможно":
//Преобразование: Замените "невозможно" на "совершенно точно возможно, просто требует времени".
//Если фраза начинается с "Я не уверен":
//Преобразование: Добавьте в конец фразы ", но моя интуиция говорит об обратном".
//Если фраза содержит слово "катастрофа":
//Преобразование: Замените "катастрофа" на "интересное событие".
//Если фраза заканчивается на "без проблем":
//Преобразование: Замените "без проблем" на "с парой интересных вызовов на пути".
//Если фраза содержит только одно слово:
//Преобразование: Добавьте перед словом "Иногда," и после слова ", но не всегда".
//
//Примеры Тестовых Фраз:
//"Это невозможно выполнить за один день"
//"Я не уверен в успехе этого проекта"
//"Произошла катастрофа на сервере"
//"Этот код работает без проблем"
//"Удача"

fun transformPhrase(phrase: String) {
    var transformedPhrase = phrase

    if (transformedPhrase.contains("невозможно")) {
        transformedPhrase = transformedPhrase.replace("невозможно", "совершенно точно возможно, просто требует времени")
    }
    if (transformedPhrase.startsWith("Я не уверен")) {
        transformedPhrase += ", но моя интуиция говорит об обратном"
//        transformedPhrase = "$transformedPhrase, но моя интуиция говорит об обратном"
//        transformedPhrase = "$transformedPhrase %s".format(", но моя интуиция говорит об обратном")
    }
    if (transformedPhrase.contains("катастрофа")) {
        transformedPhrase = transformedPhrase.replace("катастрофа", "интересное событие")
    }
    if (transformedPhrase.endsWith("без проблем")) {
        transformedPhrase = transformedPhrase.replace("без проблем", "с парой интересных вызовов на пути")
    }
    if (transformedPhrase.trim().split(" ").size == 1) {
        transformedPhrase = "Иногда, $transformedPhrase, но не всегда"
    }

    println("-- 1. Преобразование строк --")
    println("Original phrase: $phrase")
    println("Transformed phrase: $transformedPhrase")
}

//2. Извлечение даты из строки лога
//У вас есть строка лога, например "Пользователь вошел в систему -> 2021-12-01 09:48:23" (данные могут быть любыми, но формат всегда такой).
// Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди. Используй indexOf или split для получения правой части сообщения.

fun extractDateTimeFromLog(log: String) {
    val parts = log.split("->")
    val dateTime = parts[1].trim()
    val dateTimeParts = dateTime.split(" ")
    val date = dateTimeParts[0]
    val time = dateTimeParts[1]

    println("-- 2. Извлечение даты из строки лога --")
    println("Дата лога: $date")
    println("Время лога: $time")
}

//3. Маскирование личных данных
//Дана строка с номером кредитной карты, например "4539 1488 0343 6467". Замаскируйте все цифры, кроме последних четырех, символами "*".

fun maskCreditCard(cardNumber: String) {
    val maskedPart = "*".repeat(cardNumber.length - 4)
    val lastFourDigits = cardNumber.takeLast(4)
    val maskedCardNumber = maskedPart + lastFourDigits

    println("-- 3. Маскирование личных данных --")
    println("Original card number: $cardNumber")
    println("Masked card number: $maskedCardNumber")
}

//4. Форматирование адреса электронной почты.
//У вас есть электронный адрес, например "username@example.com". Преобразуйте его в строку "username [at] example [dot] com", используя функцию replace()

fun formatEmail(email: String) {
    val formattedEmail = email.replace("@", " [at] ").replace(".", " [dot] ")

    println("-- 4. Форматирование адреса электронной почты --")
    println("Original email: $email")
    println("Formatted email: $formattedEmail")
}

//5. Извлечение имени файла из пути.
//Дан путь к файлу, например "C:/Пользователи/Документы/report.txt" или "D:/good.themes/dracula.theme" (может быть любым). Извлеките название файла с расширением.

fun extractFileName(filePath: String) {
    val fileName = filePath.substringAfterLast("/")

    println("-- 5. Извлечение имени файла из пути --")
    println("Путь к файлу: $filePath")
    println("Извлеченное имя файла: $fileName")
}

//6. Создание аббревиатуры из фразы.
//У вас есть фраза, например "Котлин лучший язык программирования" (может быть любой с разделителями слов - пробел).
// Создайте аббревиатуру из начальных букв слов (например, "ООП").
//Используйте split. Используйте for для перебора слов. Используйте var переменную для накопления первых букв.

fun createAbbreviation(phrase: String) {
    val words = phrase.split(" ")
    var abbreviation = ""

    for (word in words) {
        if (word.isNotEmpty() && word[0].isLetter()) {
            abbreviation += word[0].uppercaseChar()
        }
    }

    println("-- 6. Создание аббревиатуры из фразы --")
    println("Фраза: $phrase")
    println("Аббревиатура: $abbreviation")
}


fun main() {
//    -- 1. Преобразование строк --
    val testPhrases = listOf(
        "Это невозможно выполнить за один день",
        "Я не уверен в успехе этого проекта",
        "Произошла катастрофа на сервере",
        "Этот код работает без проблем",
        "Удача"
    )
    for (phrase in testPhrases) {
        transformPhrase(phrase)
        println()
    }

//    -- 2. Извлечение даты из строки лога --
    val logEntry = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    extractDateTimeFromLog(logEntry)

//    -- 3. Маскирование личных данных --
    maskCreditCard("4539 1488 0343 6467")

//    -- 4. Форматирование адреса электронной почты --
    formatEmail("username@example.com")

//    -- 5. Извлечение имени файла из пути --
    extractFileName("C:/Пользователи/Документы/report.txt")

//    -- 6. Создание аббревиатуры из фразы --
    createAbbreviation("Котлин - лучший язык программирования")
}