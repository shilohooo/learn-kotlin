package com.github.shiloh

import com.github.shiloh.constant.Color
import com.github.shiloh.constant.State
import com.github.shiloh.sealedclass.Cat
import com.github.shiloh.sealedclass.Human
import com.github.shiloh.sealedclass.Mammal
import com.github.shiloh.valueclass.Email

fun greetMammal(mammal: Mammal): String {
    when (mammal) {
        is Human -> return "Hello ${mammal.humanName}; You're working as a ${mammal.job}"
        is Cat -> return "Hello ${mammal.catName}"
    }
}

fun sendEmail(email: Email) {
    println("Sending email to ${email.address}")
}

/**
 * 开放类与特殊类
 *
 * @author shiloh
 * @date 2025/9/11 16:04
 */
fun main() {
    val car = Car("Toyota", "Corolla", 4)
    println(car)
    println(car.transmissionType)
    car.displayInfo()

    println(greetMammal(Cat("Snowy")))
    println(greetMammal(Human("Shiloh", "Software Developer")))

    // region enum class

    val state = State.RUNNING
    var msg = when (state) {
        State.IDLE -> "It's idle"
        State.RUNNING -> "It's running"
        State.FINISHED -> "It's finished"
    }

    println(msg)

    val red = Color.RED
    println(red.containsRed())
    println(Color.BLUE.containsRed())
    println(Color.YELLOW.containsRed())

    // endregion

    // region value class

    val email = Email("shiloh595@gmail.com")
    sendEmail(email)

    // endregion
}