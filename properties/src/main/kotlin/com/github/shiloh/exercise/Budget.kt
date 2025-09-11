package com.github.shiloh.exercise

import kotlin.properties.Delegates.observable

class Budget(val totalBudget: Int) {
    var remainingBudget: Int by observable(totalBudget) { property, oldValue, newValue ->
        if (newValue < totalBudget * 0.2) {
            println("Warning: Your remaining budget ($newValue) is below 20% of your total budget.")
        }
        if (newValue > oldValue) {
            println("Good news: Your remaining budget increased to $newValue.")
        }
    }
}