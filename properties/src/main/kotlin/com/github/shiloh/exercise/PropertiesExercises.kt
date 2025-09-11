package com.github.shiloh.exercise

// region exercise 1

/**
 * 你管理着一家书店的库存系统. 库存信息保存在一个 List 中, 其中的每个元素表示某种书的数量.
 *
 * 例如, listOf(3, 0, 7, 12) 表示书店中第 1 种书有 3 份, 第 2 种书有 0 份, 第 3 种书有 7 份, 第 4 种书有 12 份.
 *
 * 编写一个函数，包含所有缺货书籍的索引
 *
 * @param inventory 仓库库存
 * @return 缺货书籍的索引
 * @author shiloh
 * @date 2025/9/11 22:06
 */
fun findOutOfStockBooks(inventory: List<Int>): List<Int> = buildList {
    for (index in inventory.indices) {
        if (inventory[index] != 0) {
            continue
        }
        add(index)
    }
}

// endregion

// region exercise 2

val Double.asMiles: Double
    get() = this * 0.621371

// endregion

// region exercise 3

fun checkAppServer(): Boolean {
    println("Performing application server health check...")
    return true
}

fun checkDatabase(): Boolean {
    println("Performing database health check...")
    return false
}

// endregion

/**
 * 属性相关的练习
 *
 * @author shiloh
 * @date 2025/9/11 22:05
 */
fun main() {
    val inventory = listOf(3, 0, 7, 0, 5)
    println(findOutOfStockBooks(inventory))

    val distanceKm = 5.0
    println("$distanceKm km is ${distanceKm.asMiles} miles")

    val marathonDistance = 42.195
    println("$marathonDistance km is ${marathonDistance.asMiles} miles")

    val isAppHealthy by lazy { checkAppServer() }
    val isDatabaseHealthy by lazy { checkDatabase() }

    when {
        isAppHealthy -> println("Application server is online and healthy")
        isDatabaseHealthy -> println("Database is healthy")
        else -> println("System is offline")
    }

    // region exercise 4

    val budget = Budget(1000)
    budget.remainingBudget = 800
    budget.remainingBudget = 150
    budget.remainingBudget = 50
    budget.remainingBudget = 300

    // endregion
}