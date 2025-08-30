package com.github.shiloh

/**
 * 使用 fun 关键字定义一个函数
 *
 * @author shiloh
 * @date 2025/8/30 10:16
 */
fun hello() {
    println("Hello, World!")
}

/**
 * 带参数、返回值的函数
 * @param x 数字 1
 * @param y 数字 2
 * @return 两数之和
 * @author shiloh
 * @date 2025/8/30 10:22
 */
fun sum(x: Int, y: Int): Int {
    return x + y
}

/**
 * 带默认值的参数
 * @param greeting 问候语
 * @param name 姓名
 * @author shiloh
 * @date 2025/8/30 10:24
 */
fun sayHello(greeting: String = "Hello", name: String) {
    println("$greeting $name :)")
}

/**
 * 单一表达式的函数，省略了大括号
 *
 * 虽然会自动推导函数的返回值类型，但还是建议显示声明，增强代码的可读性
 *
 * @param x 数字
 * @author shiloh
 * @date 2025/8/30 10:29
 */
fun square(x: Int): Int = x * x

/**
 * 使用 return 关键字提前返回
 *
 * @author shiloh
 * @date 2025/8/30 10:32
 */
fun isAdmin(username: String): Boolean {
    if (username == "admin") {
        println("Admin user is in used")
        return true
    }

    return false
}

// region exercise

/**
 * 根据圆的半径获取面积
 * @param radius 半径
 * @author shiloh
 * @date 2025/8/30 10:38
 */
fun circleArea(radius: Double): Double = Math.PI * radius * radius

/**
 * 获取秒数
 * @param hours 小时
 * @param minutes 分钟
 * @param seconds 秒
 * @author shiloh
 * @date 2025/8/30 10:46
 */
fun intervalInSeconds(hours: Int = 0, minutes: Int = 0, seconds: Int = 0) = (hours * 60 + minutes) * 60 + seconds

// endregion

/**
 * 函数
 *
 * @author shiloh
 * @date 2025/8/30 10:16
 */
fun main() {
    // 调用函数
    hello()

    println(sum(1, 1))

    // 命名参数：调用函数时可以指定参数的名称，然后以任意顺序的方式进行传参
    // 使用命名参数可以提高代码的可读性~
    sayHello(name = "shiloh", greeting = "Hi")

    // 可以省略有默认值的参数，但后续的参数必须要使用命名参数的方式进行传参
    sayHello(name = "Tom")

    println(square(2))

    println(isAdmin("admin"))

    // region exercise

    println(circleArea(2.0))

    println(intervalInSeconds(1, 20, 15))
    println(intervalInSeconds(minutes = 1, seconds = 25))
    println(intervalInSeconds(hours = 2))
    println(intervalInSeconds(minutes = 10))
    println(intervalInSeconds(hours = 1, seconds = 1))

    // endregion
}