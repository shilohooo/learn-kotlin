package com.github.shiloh

/**
 * 字符串模板
 *
 * @author shiloh
 * @date 2025/8/29 16:36
 */
fun main() {
    val name = "shiloh"
    // 通过 $ 符号使用变量
    println("Hello, $name")
    // 通过 ${} 使用表达式
    println("1 + 1 = ${1 + 1}")

    val name2 = "Mary"
    val age = 20
    println("$name2 is $age years old")
}