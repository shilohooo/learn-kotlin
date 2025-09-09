package com.github.shiloh.exercises

/**
 * 练习：接口与实现
 *
 * @author shiloh
 * @date 2025/9/9 21:36
 */
fun main() {
    val audio = Audio("Symphony No. 5", "Beethoven")
    audio.play()

    val creditCard = CreditCard("Visa")
    creditCard.authorize(100.0)
    creditCard.processPayment(100.0)
    creditCard.refund(50.0)

    val basicMessenger = BasicMessenger()
    val smartMessenger = SmartMessenger(basicMessenger)

    basicMessenger.send("Hello!")
    println(smartMessenger.receive())
    smartMessenger.send("Hello from SmartMessenger!")
}