package com.github.shiloh

/**
 * 基本数据类型
 *
 * @author shiloh
 * @date 2025/8/29 16:42
 */
fun main() {
    // 自动根据变量的值进行类型推到，customers 变量的类型为 Int
    var customers = 10
    // 类型推断为 Int 之后，可以进行算术运算
    customers += 3
    customers += 7
    customers -= 3
    customers *= 2
    customers /= 3
    println(customers)

    // 声明一个变量但没有初始化值，必须指定类型
    val number: Int
    number = 1
    println(number)

    // 显式指定类型并初始化
    val msg: String = "Hello, Kotlin!"
    println(msg)

    val a: Int = 1000
    val b: String = "log message"
    val c: Double = 3.14
    val d: Long = 100_000_000_000_000
    val e: Boolean = false
    val f: Char = '\n'
    println("$a $b $c $d $e $f")
}