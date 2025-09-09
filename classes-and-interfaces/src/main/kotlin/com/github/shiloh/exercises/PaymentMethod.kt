package com.github.shiloh.exercises

abstract class PaymentMethod(val name: String) {
    fun authorize(amount: Double) {
        println("Authorizing payment of $$amount")
    }

    abstract fun processPayment(amount: Double)
}