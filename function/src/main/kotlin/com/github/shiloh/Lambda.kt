package com.github.shiloh

/**
 * 返回一个 lambda 表达式的函数
 *
 * @author shiloh
 * @date 2025/8/30 11:21
 */
fun toSeconds(timeType: String): (Int) -> Int = when (timeType) {
    "hour" -> { v -> v * 60 * 60 }
    "minute" -> { v -> v * 60 }
    "second" -> { v -> v }
    else -> { v -> v }
}

/**
 * 重复执行指定的函数
 *
 * @author shiloh
 * @date 2025/8/30 11:35
 */
fun repeatN(times: Int, action: () -> Unit) {
    for (i in 1..times) action()
}

/**
 * lambda 表达式
 *
 * @author shiloh
 * @date 2025/8/30 10:48
 */
fun main() {
    // lambda = 匿名函数，语法：{ param: Type -> function body }
    // 将 lambda 表达式的结果赋予一个变量，然后就可以像调用函数一样来使用它了
    val uppercaseStr = { text: String -> text.uppercase() }
    println(uppercaseStr("hello"))

    // 不带参数的 lambda，则不需要 -> 符号
    val greeting = { println("Hello, Kotlin") }
    greeting()

    // region 将 lambda 表达式传递给另外一个函数

    val numbers = listOf(-1, -2, 3, -4, 5, 6, -7, 8, 9, 10)
    // 如果一个 Lambda 表达式是函数的唯一参数, 可以去掉函数的小括号 ()
    // 这是尾缀 Lambda 表达式 (Trailing Lambda)
    val positives = numbers.filter { x -> x > 0 }
    println(positives)


    val isNegative = { x: Int -> x < 0 }
    val negatives = numbers.filter(isNegative)
    println(negatives)

    val doubled = numbers.map { x: Int -> x * 2 }
    println(doubled)

    val isTripled = { x: Int -> x * 3 }
    val tripled = numbers.map(isTripled)
    println(tripled)

    // endregion

    // region 函数类型

    // 语法：(param: Type, ...) -> ReturnType / () -> ReturnType

    val lowercase: (String) -> String = { text: String -> text.lowercase() }
    println(lowercase("HELLO WORLD"))

    val timesInMinutes = listOf(1, 2, 3, 4)
    val min2Sec = toSeconds("minute")
    val totalSeconds = timesInMinutes.sumOf(min2Sec)
    println(totalSeconds)

    // endregion

    // region 单独调用 lambda 表达式

    println({ text: String -> text.uppercase() }("Hello"))

    // endregion

    // region 尾缀 lambda 表达式 - Trailing Lambda

    // 如果一个 Lambda 表达式是函数的唯一参数, 你可以去掉函数的小括号 ().
    // 如果一个 Lambda 表达式是函数的最后一个参数, 那么 Lambda 表达式可以写在函数的小括号 () 之外.
    // 对这两种情况, 这样的语法称为 尾缀 Lambda 表达式(Trailing Lambda).

    // fold 接收一个初始值和一个操作，这里的操作是对初始值累加集合种的每一个元素
    println(listOf(1, 2, 3, 4, 5).fold(0, { x, item -> x + item }))
    println(listOf(1, 2, 3, 4, 5).fold(0) { x, item -> x + item })

    // endregion

    // region exercise

    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map { a -> "$prefix/$id/$a" }
    println(urls)

    repeatN(5, { println("Hello") })

    // endregion
}