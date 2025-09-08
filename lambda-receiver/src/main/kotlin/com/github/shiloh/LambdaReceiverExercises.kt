package com.github.shiloh

fun fetchData(callback: StringBuilder.() -> Unit) {
    val stringBuilder = StringBuilder("Data received")
    stringBuilder.callback()
}

fun List<Int>.incremented(): List<Int> {
    val originalList = this
    return buildList {
        originalList.forEach { add(it + 1) }
    }
}

fun main() {
    fetchData {
        append(" - Processed")
        println(this.toString())
    }

    val button = Button()
    button.onEvent {
        if (!isRightClick && amount == 2) {
            println("Double click!")
        }
    }

    val originalList = listOf(1, 2, 3)
    val newList = originalList.incremented()
    println(newList)
}