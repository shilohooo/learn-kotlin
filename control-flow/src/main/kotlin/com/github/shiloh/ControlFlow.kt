package com.github.shiloh

import kotlin.random.Random

/**
 * 控制流：if else / when, loop
 *
 * @author shiloh
 * @date 2025/8/30 9:06
 */
fun main() {
    // region if

    var d: Int
    val check = true
    // if 作为语句
    if (check) {
        d = 1
    } else {
        d = 2
    }
    println(d)

    // if 作为表达式，在 Kotlin 中没有三元操作符 condition ? a : b，可以用 if 表达式代替
    d = if (check) 3 else 4
    println(d)

    // endregion

    // region when

    // 条件表达式存在多个分支时，建议使用 when

    val msg = "hello"

    when (msg) {
        // msg 是否等于 "hello"
        "hello" -> println("greeting")
        // msg 是否等于 "1"
        "1" -> println("one")
        // 都不成立，则执行默认语句
        else -> println("other")
    }

    // when 表达式，可以用来获取一个值
    // 与 (subject) 进行比较，并返回一个值
    val result = when (msg) {
        "1" -> "one"
        "hello" -> "greeting"
        else -> "unknown"
    }
    println(result)

    // when 中的分支判断也可以是一个 Boolean 表达式，此时不需要添加 when (subject)
    val trafficLightState = "Red"
    val trafficAction = when {
        trafficLightState == "Green" -> "Go"
        trafficLightState == "Yellow" -> "Slow down"
        trafficLightState == "Red" -> "Stop"
        else -> "Malfunction"
    }

    println(trafficAction)

    // 两种使用方式，都要在最后添加一个 else 默认分支，建议始终带上 subject 去判断
    // 使用带有判定对象的 when 可以让你的代码更加易于阅读和维护.
    // 当你对 when 表达式使用判定对象时, 也有助于 Kotlin 检查是否覆盖了所有的可能情况.

    // endregion

    // region exercise

    val firstNum = Random.nextInt(10)
    val secondNum = Random.nextInt(10)
    when {
        firstNum == secondNum -> println("You win :)")
        else -> println("You lose :(")
    }

    // endregion

    // region loop

    // for 循环

    for (num in 1..5) {
        println(num)
    }

    // 遍历集合
    val fruits = listOf("apple", "banana", "orange")
    for (fruit in fruits) {
        println("I like eating $fruit :)")
    }

    // while 循环

    var cakesEaten = 3
    while (cakesEaten > 0) {
        println("Eat a cake")
        cakesEaten--
    }

    // do while 会先执行一次循环，再判断条件
    var cakesBaked = 0
    do {
        println("Bake a cake")
        cakesBaked++
    } while (cakesBaked < 3)

    // endregion

    // region exercise1

    var pizzaSlices = 0
//    while (pizzaSlices < 8) {
//        pizzaSlices++;
//        println("There is only $pizzaSlices slice/s of pizza:(")
//    }

    do {
        pizzaSlices++
        println("There is only $pizzaSlices slice/s of pizza:(")
    } while (pizzaSlices < 8)

    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")

    // endregion

    // region exercise2

    for (num in 1..100) {
        when {
            num % 15 == 0 -> println("fizzbuzz")
            num % 5 == 0 -> println("buzz")
            num % 3 == 0 -> println("fizz")
            else -> println(num)
        }
    }

    // endregion

    // region exercise3

    val words = listOf("dinosaur", "limousine", "magazine", "language")
    for (word in words) {
        if (word.startsWith('l')) {
            println(word)
        }
    }

    // endregion
}