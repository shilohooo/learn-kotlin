package com.github.shiloh.exercise

import kotlin.math.pow
import kotlin.time.measureTime

/**
 * 计算投资的价值，公式：A = P * (1 1 r/n) * n * t
 *
 * pow 函数用于快速计算幂
 *
 * @param p 本金 (初始投资额)
 * @param r 年利率 (小数)
 * @param n 每年计算复利的次数
 * @param t 投资时间 (年)
 * @return 计算利息后的累计金额 (本金 + 利息)
 * @author shiloh
 * @date 2025/9/13 11:12
 */
fun calcCompoundInterset(p: Double, r: Double, n: Int, t: Int): Double = p * (1 + r / n).pow(n * t)

/**
 * 标准库相关的练习
 *
 * @author shiloh
 * @date 2025/9/13 11:12
 */
@OptIn(ExperimentalStdlibApi::class)
fun main() {
    val principal = 1000.0
    val rate = 0.05
    val timesCompounded = 4
    val years = 5
    val amount = calcCompoundInterset(principal, rate, timesCompounded, years)
    println("The accumulated amount is: $amount")

    // region exercise 2

    val timeTaken = measureTime {
        val data = List(100) { it * 2 }
        val filteredData = data.filter { it % 3 == 0 }
        val processedData = filteredData.map { it / 2 }
        println("Processed data: $processedData")
    }

    println("Time taken: $timeTaken")

    // endregion
}