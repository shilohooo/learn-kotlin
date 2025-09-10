package com.github.shiloh.exercise

data object OrderTwo : Order {
    override val orderId: String = "002"
    override val customerName: String = "Bruce"
    override val orderTotal: Double = 25.50
}