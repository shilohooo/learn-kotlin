package com.github.shiloh.exercise

/**
 * 对象练习
 *
 * @author shiloh
 * @date 2025/9/10 17:16
 */
fun main() {
    println("Order name $OrderOne")
    println("Order name $OrderTwo")

    println("Are the two orders identical? ${OrderOne == OrderTwo}")

    if (OrderOne == OrderTwo) {
        println("The orders are identical.")
    } else {
        println("The orders are unique.")
    }

    println("Do the orders have same customer name? ${OrderOne.customerName == OrderTwo.customerName}")

    println("${FlyingSkateboard.name}: ${FlyingSkateboard.move()}")
    println("${FlyingSkateboard.name}: ${FlyingSkateboard.fly()}")

    val fahrenheit = 90.0
    val temp = Temperature.fromFahrenheit(fahrenheit)
    println("${temp.celsius}℃ is $fahrenheit ℉")

}