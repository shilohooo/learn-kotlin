package com.github.shiloh

/**
 * 集合
 *
 * @author shiloh
 * @date 2025/8/29 16:55
 */
fun main() {
    // region List

    // 只读的，自动推到集合里面的元素类型
    val readonlyShapes = listOf("triangle", "square", "circle")
    println(readonlyShapes)
    // 获取集合中的元素数量
    println(readonlyShapes.count())
    println(readonlyShapes.size)
    // 通过下标访问集合元素
    println(readonlyShapes[0])

    // 检查某个元素是否在集合中
    println("circle" in readonlyShapes)

    // 可变的集合

    val numbers = mutableListOf(1, 2, 3, 4, 5)
    numbers.add(10)
    numbers.add(0, 11)
    numbers[3] = 1
    println(numbers)

    // 移除指定下标的元素
    numbers.removeAt(3)
    println(numbers)

    // 访问第一个元素和最后一个元素
    println("first number is ${numbers.first()}")
    println("last number is ${numbers.last()}")

    // 显示指定集合的元素类型
    val flags: List<Boolean> = mutableListOf(true, false)
    println(flags)

    println("${flags[0]}")

    // 创建可变集合的只读视图：将 MutableList 转换为 List
    val readonlyNumbers: List<Int> = numbers
    println(readonlyNumbers)

    // endregion

    // region Set

    // 只读的
    val numSet = setOf(1, 2, 3, 4, 5, 5)
    println(numSet)

    // 可变的
    val letters = mutableSetOf("a", "a", "b", "c", "c")
    letters.add("d")
    letters.add("d")
    letters.remove("c")
    println(letters)
    println(letters.size)
    println("d" in letters)

    // 创建只读副本：将 MutableSet 转换为 Set
    val readonlyLetters: Set<String> = letters
    println(readonlyLetters)

    // endregion

    // region Map

    // 不可变的
    val userInfo = mapOf("age" to 27, "name" to "shiloh")
    println(userInfo)
    val age = userInfo["age"]
    println(age)

    // 可变的
    val address: MutableMap<String, String> = mutableMapOf("country" to "中国", "province" to "广东")
    println(address)
    address["city"] = "佛山"
    println(address)
    // 访问不存在的键，返回 null
    val nonExistsVal = address["nonExists"]
    println(nonExistsVal)

    address.remove("city")
    println(address)
    // 是否包含某个键
    println(address.containsKey("country"))

    // 获取所有的键
    println(address.keys)
    // 获取所有的值
    println(address.values)

    // 检查某个键是否存在
    println("province" in address)
    // 检查某个值是否存在
    println("中国" in address.values)

    // endregion

    // region exercise

    val greenNumbers = listOf(1, 2, 3, 4)
    val redNumbers = listOf(5, 6, 7)
    println("total numbers: ${greenNumbers.size + redNumbers.size}")

    val protocols = setOf("HTTP", "HTTPS", "FTP")
    val requested = "smtp"
    val isSupported = requested.uppercase() in protocols
    println("$requested is supported: $isSupported")

    val numberToWord = mapOf(1 to "on", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as ${numberToWord[n]}")

    // endregion
}