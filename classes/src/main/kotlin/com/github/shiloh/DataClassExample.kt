package com.github.shiloh

/**
 * 数据类相关的示例代码
 *
 * @author shiloh
 * @date 2025/9/1 11:32
 */
fun main() {
    val user = User(1, "shiloh")
    // 打印数据类，会自动调用 toString() 方法
    println(user)

    val user2 = User(1, "shiloh")
    println("user == user2? - ${user == user2}")

    val user3 = User(2, "Bruce")
    println("user == user3? - ${user == user3}")

    // 复制对象
    val userCopy = user.copy()
    println("userCopy = $userCopy")

    // 复制的时候，改变某些属性的值
    val userCopy2 = user.copy(2)
    println("userCopy2 = $userCopy2")

    // 创建一个实例的复制, 要比修改原来的实例更加安全,
    // 因为你对复制品所做的任何操作, 不会影响到依赖于原来那个实例的其他代码.
}