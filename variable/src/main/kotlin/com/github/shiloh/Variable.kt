package com.github.shiloh

/**
 * 变量
 *
 * @author shiloh
 * @date 2025/8/29 16:36
 */
fun main() {
    // var 定义可变变量
    var greeting = "Hello"
    // val 定义不可变变量
    val name = "Shiloh"
    println("$greeting $name")

    greeting = "Hi"
    println("$greeting $name")

    val age = 27
    println("I am $age years old:)")
}