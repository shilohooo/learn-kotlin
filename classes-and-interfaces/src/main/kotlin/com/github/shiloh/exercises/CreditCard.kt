package com.github.shiloh.exercises

class CreditCard(name: String) : PaymentMethod(name), Refundable {
    override fun processPayment(amount: Double) {
        println("Processing credit card payment of $$amount")
    }

    override fun refund(amount: Double) {
        println("Refunding $$amount to the credit card")
    }
}