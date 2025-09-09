package com.github.shiloh

/**
 * 类与接口
 *
 * @author shiloh
 * @date 2025/9/9 21:02
 */
fun main() {
    // region 类的继承

    val laptop = Electronic("Laptop", 2333.0, 2)
    println(laptop.productInfo())

    // endregion

    // region 接口与实现

    val payment = CreditCardPayment("1234 5679 9012 3456", "Shiloh Lee", "2025-12-31")
    println(payment.initiatePayment(100.0))

    println("Payment is by ${payment.paymentType}")

    // endregion
}