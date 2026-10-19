package org.example.lessons.lesson13

fun main() {
    // 1. Определите среднее время выполнения теста.
    val testTimes = mapOf(
        "loginTest" to 5.2,
        "paymentTest" to 8.4,
        "registrationTest" to 6.4
    )
    println("1. Среднее время выполнения теста: ${getAverageTestTime(testTimes)}")

    // 2. Выведите список всех тестовых методов.
    val testMetadata = mapOf(
        "loginTest" to "UI test",
        "paymentTest" to "API test",
        "registrationTest" to "E2E test"
    )
    println("2. Список тестовых методов: ${getTestMethods(testMetadata)}")

    // 3. В изменяемый словарь добавьте новый тест и его результат.
    val testResults = mutableMapOf(
        "loginTest" to "passed",
        "paymentTest" to "failed"
    )
    addTestResult(testResults, "registrationTest", "passed")
    println("3. Результаты тестов: $testResults")

    // 4. Посчитайте количество успешных тестов.
    println("4. Количество успешных тестов: ${countPassedTests(testResults)}")

    // 5. Удалите запись о баге, который был исправлен.
    val bugs = mutableMapOf(
        "BUG-101" to "fixed",
        "BUG-102" to "open",
        "BUG-103" to "fixed"
    )
    removeFixedBug(bugs)
    println("5. Баги после удаления: $bugs")

    // 6. Выведите сообщение о странице и статусе её проверки.
    val pageStatuses = mapOf(
        "https://example.com" to 200,
        "https://example.com/login" to 401,
        "https://example.com/not-found" to 404
    )
    printPageStatuses(pageStatuses)

    // 7. Найдите сервисы, время ответа которых превышает заданный порог.
    val serviceTimes = mapOf(
        "authService" to 120.0,
        "paymentService" to 450.0,
        "userService" to 200.0
    )
    println("7. Медленные сервисы: ${getSlowServices(serviceTimes, 200.0)}")

    // 8. Найдите статус ответа для указанного endpoint.
    val apiResults = mapOf(
        "/api/users" to "200 OK",
        "/api/payments" to "500 Internal Server Error"
    )
    println("8. Статус endpoint: ${getEndpointStatus(apiResults, "/api/orders")}")

    // 9. Получите значение для browserType. Ответ не может быть null.
    val environmentConfig = mapOf(
        "browserType" to null,
        "baseUrl" to "https://example.com",
        "timeout" to "5000"
    )
    println("9. Тип браузера: ${getBrowserType(environmentConfig)}")

    // 10. Создайте копию неизменяемого словаря, добавив новую версию.
    val softwareVersions = mapOf(
        "frontend" to "1.0.0",
        "backend" to "2.1.0"
    )
    println("10. Версии ПО: ${addSoftwareVersion(softwareVersions, "mobile", "1.2.0")}")

    // 11. Получите настройки устройства или настройки по умолчанию.
    val deviceSettings = mapOf(
        "iPhone 16" to "iOS, Safari",
        "Pixel 9" to "Android, Chrome"
    )
    println("11. Настройки устройства: ${getDeviceSettings(deviceSettings, "iPad")}")

    // 12. Проверьте, содержит ли словарь определённый код ошибки.
    val errorDescriptions = mapOf(
        404 to "Not Found",
        500 to "Internal Server Error",
        503 to "Service Unavailable"
    )
    println("12. Код ошибки существует: ${containsErrorCode(errorDescriptions, 404)}")

    // 13. Оставьте сценарии, идентификаторы которых содержат требуемую версию.
    val scenarioResults = mapOf(
        "TestID_1.0" to "Passed",
        "TestID_2.0" to "Failed",
        "LoginTest_2.0" to "Passed",
        "PaymentTest_3.0" to "Skipped"
    )
    println("13. Сценарии версии 2.0: ${filterScenariosByVersion(scenarioResults, "2.0")}")

    // 14. Проверьте, есть ли модули с неудачным тестированием.
    val moduleResults = mapOf(
        "Authentication" to "passed",
        "Payments" to "failed",
        "Reports" to "passed"
    )
    println("14. Есть проваленные модули: ${hasFailedModules(moduleResults)}")

    // 15. Добавьте в изменяемый словарь настройки из другого словаря.
    val testEnvironment = mutableMapOf(
        "browser" to "Chrome",
        "environment" to "staging"
    )
    val additionalSettings = mapOf(
        "timeout" to "5000",
        "headless" to "true"
    )
    mergeEnvironmentSettings(testEnvironment, additionalSettings)
    println("15. Настройки окружения: $testEnvironment")

    // 16. Объедините два неизменяемых словаря с данными о багах.
    val bugsFirst = mapOf(
        "BUG-101" to "open",
        "BUG-102" to "fixed"
    )
    val bugsSecond = mapOf(
        "BUG-103" to "open",
        "BUG-104" to "fixed"
    )
    println("16. Объединённые баги: ${mergeBugReports(bugsFirst, bugsSecond)}")

    // 17. Очистите словарь с временными данными последнего прогона.
    val lastRunData = mutableMapOf(
        "passed" to "15",
        "failed" to "2",
        "skipped" to "3"
    )
    clearLastRunData(lastRunData)
    println("17. Временные данные после очистки: $lastRunData")

    // 18. Исключите из отчёта тесты со статусом skipped.
    val testReport = mapOf(
        "loginTest" to "passed",
        "paymentTest" to "skipped",
        "apiTest" to "failed"
    )
    println("18. Отчёт без пропущенных тестов: ${excludeSkippedTests(testReport)}")

    // 19. Создайте копию словаря, удалив несколько конфигураций.
    val configurations = mapOf(
        "Chrome" to "Desktop",
        "Firefox" to "Desktop",
        "Safari" to "Mobile",
        "Edge" to "Desktop"
    )
    println("19. Конфигурации после удаления: ${removeConfigurations(configurations, setOf("Firefox", "Edge"))}")

    // 20. Преобразуйте словарь результатов в список строк.
    val resultsForReport = mapOf(
        "TC-001" to "Passed",
        "TC-002" to "Failed",
        "TC-003" to "Skipped"
    )
    println("20. Отчёт: ${createTestReport(resultsForReport)}")

    // 21. Преобразуйте изменяемый словарь в неизменяемый.
    val mutableResults = mutableMapOf(
        "loginTest" to "passed",
        "paymentTest" to "failed"
    )
    val archivedResults = archiveTestResults(mutableResults)
    println("21. Архив результатов: $archivedResults")

    // 22. Замените числовые ID тестов на строковые.
    val executionTimes = mapOf(
        101 to 5.2,
        102 to 8.4,
        103 to 3.7
    )
    println("22. Результат со строковыми ID: ${convertTestIds(executionTimes)}")

    // 23. Увеличьте каждую оценку времени ответа на 10%.
    val performanceScores = mapOf(
        "1.0" to 120.0,
        "1.1" to 150.0,
        "2.0" to 100.0
    )
    println("23. Оценки после увеличения: ${increaseResponseTimes(performanceScores)}")

    // 24. Проверьте, пуст ли словарь с ошибками компиляции.
    val compilationErrors =
        emptyMap<String, String>()
//        mapOf(
//            "9:00 19.10.2026" to "404"
//        )
    println("24. Словарь ошибок пуст: ${compilationErrors.isEmpty()}")

    // 25. Убедитесь, что словарь нагрузочного тестирования не пуст.
    val loadTestResults =
//        emptyMap<String, String>()
    mapOf(
        "requestsPerSecond" to 500,
        "failedRequests" to 3
    )
    println("25. Результаты нагрузочного тестирования не пусты: ${loadTestResults.isNotEmpty()}")

    // 26. Проверьте, прошли ли успешно все автоматизированные тесты.
    val automationResults = mapOf(
        "loginTest" to "passed",
        "paymentTest" to "passed",
        "apiTest" to "passed"
    )
    println("26. Все тесты прошли успешно: ${allTestsPassed(automationResults)}")

    // 27. Определите, содержит ли словарь хотя бы один тест с ошибкой.
    println("27. Есть тест с ошибкой: ${containsFailedTest(automationResults)}")

    // 28. Оставьте неуспешные тесты, содержащие в названии optional.
    val serviceTestResults = mapOf(
        "optionalLoginTest" to "failed",
        "optionalPaymentTest" to "skipped",
        "requiredApiTest" to "failed",
        "optionalSearchTest" to "passed"
    )
    println("28. Неуспешные optional-тесты: ${filterOptionalFailedTests(serviceTestResults)}")
}

// 1. Определите среднее время выполнения теста.
fun getAverageTestTime(testTimes: Map<String, Double>): Double {
    return testTimes.values.average()
}

// 2. Выведите список всех тестовых методов.
fun getTestMethods(metadata: Map<String, String>): List<String> {
    return metadata.keys.toList()
}

// 3. В изменяемый словарь добавьте новый тест и его результат.
fun addTestResult(results: MutableMap<String, String>, name: String, result: String) {
    results[name] = result
}

// 4. Посчитайте количество успешных тестов.
fun countPassedTests(results: Map<String, String>): Int {
    return results.count { it.value == "passed" }
}

// 5. Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен.
fun removeFixedBug(bugs: MutableMap<String, String>) {
    bugs.values.removeAll { it == "fixed" }
}

// 6. Выведите сообщение о странице и статусе её проверки.
fun printPageStatuses(statuses: Map<String, Int>) {
    statuses.forEach { (url, status) ->
        println("6. Страница $url, статус проверки: $status")
    }
}

// 7. Найдите сервисы, время ответа которых превышает заданный порог.
fun getSlowServices(serviceTimes: Map<String, Double>, threshold: Double): Map<String, Double> {
    return serviceTimes.filterValues { it > threshold }
}

// 8. Найдите статус ответа для указанного endpoint.
fun getEndpointStatus(results: Map<String, String>, endpoint: String): String {
    return results.getOrElse(endpoint) { "Не тестировался" }
}

// 9. Получите значение для browserType. Ответ не может быть null.
fun getBrowserType(config: Map<String, String?>): String {
    return config["browserType"] ?: "unknown"
}

// 10. Создайте копию неизменяемого словаря, добавив новую версию.
fun addSoftwareVersion(versions: Map<String, String>, name: String, version: String): Map<String, String> {
    return versions + (name to version)
}

// 11. Получите настройки устройства или настройки по умолчанию.
fun getDeviceSettings(settings: Map<String, String>, model: String): String {
    return settings.getOrDefault(model, "Default settings")
}

// 12. Проверьте, содержит ли словарь определённый код ошибки.
fun containsErrorCode(errors: Map<Int, String>, code: Int): Boolean {
    return errors.containsKey(code)
}

// 13. Оставьте сценарии, идентификаторы которых содержат требуемую версию.
fun filterScenariosByVersion(scenarios: Map<String, String>, version: String): Map<String, String> {
    return scenarios.filterKeys { it.contains(version) }
}

// 14. Проверьте, есть ли модули с неудачным тестированием.
fun hasFailedModules(modules: Map<String, String>): Boolean {
    return modules.any { it.value == "failed" }
}

// 15. Добавьте настройки из другого словаря.
fun mergeEnvironmentSettings(environment: MutableMap<String, String>, additionalSettings: Map<String, String>) {
    environment.putAll(additionalSettings)
}

// 16. Объедините два неизменяемых словаря с данными о багах.
fun mergeBugReports(first: Map<String, String>, second: Map<String, String>): Map<String, String> {
    return first + second
}

// 17. Очистите словарь с временными данными последнего прогона.
fun clearLastRunData(data: MutableMap<String, String>) {
    data.clear()
}

// 18. Исключите из отчёта тесты со статусом skipped.
fun excludeSkippedTests(report: Map<String, String>): Map<String, String> {
    return report.filterValues { it != "skipped" }
}

// 19. Создайте копию словаря, удалив несколько конфигураций.
fun removeConfigurations(configurations: Map<String, String>, namesToRemove: Set<String>): Map<String, String> {
    return configurations - namesToRemove
}

// 20. Преобразуйте словарь результатов в список строк.
fun createTestReport(results: Map<String, String>): List<String> {
    return results.map { (id, result) -> "$id: $result" }
}

// 21. Преобразуйте изменяемый словарь в неизменяемый.
fun archiveTestResults(results: MutableMap<String, String>): Map<String, String> {
    return results.toMap()
}

// 22. Замените числовые ID тестов на строковые.
fun convertTestIds(times: Map<Int, Double>): Map<String, Double> {
    return times.entries.associate { (id, time) -> id.toString() to time }
}

// 23. Увеличьте каждую оценку времени ответа на 10%.
fun increaseResponseTimes(scores: Map<String, Double>): Map<String, Double> {
    return scores.mapValues { it.value * 1.1 }
}

// 26. Проверьте, прошли ли успешно все автоматизированные тесты.
fun allTestsPassed(results: Map<String, String>): Boolean {
    return results.all { it.value == "passed" }
}

// 27. Определите, содержит ли словарь хотя бы один тест с ошибкой.
fun containsFailedTest(results: Map<String, String>): Boolean {
    return results.containsValue("failed")
}

// 28. Оставьте неуспешные тесты, содержащие в названии optional.
fun filterOptionalFailedTests(results: Map<String, String>): Map<String, String> {
    return results.filter { (name, status) ->
        status != "passed" && name.contains("optional", ignoreCase = true)
    }
}


