package com.github.shiloh

fun employeeById(id: Int) = when (id) {
    1 -> Employee("shiloh", 1000.0)
    2 -> null
    3 -> Employee("tom", 3000.0)
    4 -> Employee("rose", 4000.0)
    else -> null
}

fun salaryById(id: Int) = employeeById(id)?.salary ?: 0.0

fun main() {
    println((1..5).map { id -> salaryById(id) })
}