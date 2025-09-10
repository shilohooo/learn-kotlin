package com.github.shiloh.exercise

data object OrderOne : Order {
    override val orderId: String = "001"
    override val customerName: String = "Alice"
    override val orderTotal: Double = 15.50
}