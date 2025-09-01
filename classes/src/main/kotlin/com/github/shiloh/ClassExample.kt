package com.github.shiloh

/**
 * Kotlin 类相关的示例代码
 *
 * @author shiloh
 * @date 2025/9/1 11:15
 */
fun main() {
    // 使用构造器 (constructor) 声明一个类的实例，即对象
    // 默认情况下, Kotlin 会使用类头部 (Class Header) 中声明的参数, 自动创建一个构造器.
    val customer = Customer(1, "shiloh595@gmail.com")
    println(customer.id)
    println(customer.email)

    // 修改属性的值
    customer.email = "shiloh@gmail.com"
    println(customer.email)
    println(customer.category)

    println("customer's email address is ${customer.email}")

    customer.printId()
}