package com.github.shiloh

/**
 * 使用 when 调节表达式判断对象的类型，并执行相应的逻辑
 *
 * 智能类型转换（Smart Cast）与安全类型转换（Safe Cast）
 *
 * Kotlin 有些时候能够推断类型, 不需要明确的声明.
 *
 * 如果你告诉 Kotlin 将一个变量或对象当作某个特定的类型处理, 这个过程叫做类型转换.
 *
 * 如果类型能够自动转换时, 例如能够推断得到, 称为 智能类型转换(Smart Cast).
 *
 * is 和 !is 操作符
 *
 * is - 检查对象是否属于指定的类型，并返回 Boolean 值
 *
 * !is - 检查对象是否不属于指定的类型，并返回 Boolean 值
 *
 * @author shiloh
 * @date 2025/9/12 21:57
 */
fun printObjType(obj: Any) {
    when (obj) {
        is Int -> println("It's an Integer with value $obj")
        !is Double -> println("It's not a Double")
        else -> println("Unknown type")
    }

}

/**
 * 将 as? 操作符与 Elvis 操作符 ?: 结合起来, 将多行代码精简为一行.
 *
 * @author shiloh
 * @date 2025/9/12 22:09
 */
fun calcTotalStrLength(items: List<Any>): Int {
//    var totalLength = 0
//    for (item in items) {
//        totalLength += if (item is String) {
//            item.length
//        } else {
//            // 忽略非字符串
//            0
//        }
//    }
//    return totalLength
    // 使用 as? 和 ?: 简化代码
    // as? 进行安全的类型转换，?.进行安全调用
    // 如果转换不了，则返回 0
    return items.sumOf { (it as? String)?.length ?: 0 }
}

/**
 * 获取一个学生的朋友数量
 *
 * 这个示例中, 尽管只使用 Elvis 操作符检查了一个条件, 但你可以添加多个检查来覆盖任何重要的错误路径.
 * 使用 Elvis 操作符提前返回能够防止你的程序执行不必要的工作, 并在检测到 null 值或不正确的情况时立即停止执行,
 * 让代码更加安全.
 *
 * @param students 学生 Map
 * @param studentId 学生的 ID
 * @author shiloh
 * @date 2025/9/12 22:33
 */
fun getNumbersOfFriends(students: Map<Int, Student>, studentId: Int): Int {
    // 获取学生信息，如果为 null，则直接返回 -1
    val student = students[studentId] ?: return -1
    return student.friends.size
    // 如果不使用提前返回，多次使用安全调用，会降低代码的可读性
    // return students[studentId]?.friends?.size ?: -1
}

/**
 * Null 值安全性的常见使用常见
 *
 * @author shiloh
 * @date 2025/9/12 21:56
 */
fun main() {
    printObjType(42)
    printObjType(3.14)
    printObjType(listOf(1, 2, 3))

    // as 与 as? 操作符用于将一个对象转换为指定类型，包括把可为 null 的类型转换为不可为 null 的类型
    // 如果转换失败，程序会在运行期抛出异常，因此，as 是不安全的类型转换
//    val a: String? = null
    // 下面这行代码会报错：null cannot be cast to non-null type kotlin.String
//    val b = a as String
//    println(b)

    println(calcTotalStrLength(listOf("Kotlin", "is", "awesome")))

    // region Null 值与集合处理

    // 在 Kotlin 中, 使用集合经常需要处理 null 值, 并过滤掉不需要的元素.
    // Kotlin 有很多有用的函数, 在处理 List, Set, Map, 和其他类型的集合时,
    // 你可以用它们编写出简洁, 高效, 而且 Null 值安全的代码.

    // 从一个 List 中过滤调 Null 值
    val emails: List<String?> = listOf("shiloh595@gmail.com", null, "bruce@qq.com", null, "tom@sina.com")
    val validEmails = emails.filterNotNull()
    println(validEmails)

    // 在创建 List 时直接过滤 null 值
    val serverConfig = mapOf(
        "appConfig.json" to "App configuration",
        "dbConfig.json" to "Database configuration"
    )
    val requestedFile = "appConfig.json"
    val configFiles = listOfNotNull(serverConfig[requestedFile])
    println(configFiles)

    // 在集合中查找元素，如果找不到匹配的元素，则返回 null
    // singleOrNull(), maxOrNull(), 和 minOrNull() 函数只能用于 不 包含 null 值的集合.
    // 否则, 你就无法区分: 函数找不到需要的值? 还是它找到了 null 值?
    val temperatures = listOf(15, 18, 21, 21, 19, 17, 16)
    val singleHotDay = temperatures.singleOrNull()
    println("Single hot day with 30 degrees: ${singleHotDay ?: "None"}")

    val maxTemperature = temperatures.maxOrNull()
    println("Highest temperature recorded: ${maxTemperature ?: "No data"}")

    val minTemperature = temperatures.minOrNull()
    println("Lowest temperature recorded: ${minTemperature ?: "No data"}")

    // 有些函数使用 Lambda 表达式来转换集合, 如果无法实现目的, 则返回 null 值
    // 例如, 要使用 Lambda 表达式转换集合, 并返回第一个值非 null 的值
    val users = listOf(
        User(null, 25),
        User("shiloh595", null),
        User("Tom", 30)
    )

    val firstNotNullName = users.firstNotNullOfOrNull { it.name }
    println(firstNotNullName)

    // 要使用 Lambda 函数顺序的处理每个集合元素, 并创建一个累计的值
    // (或者如果集合为空, 返回 null 值), 请使用 reduceOrNull() 函数
    // reduceOrNull() 函数只能用于 不 包含 null 值的集合.

    val itemPrices = listOf(20, 35, 15, 40, 10)
    val totalPrice = itemPrices.reduceOrNull { runningTotal, price -> runningTotal + price }
    println("Total price of items in the cart: ${totalPrice ?: "No items"}")

    val emptyCart = listOf<Int>()
    val emptyTotalPrice = emptyCart.reduceOrNull { runningTotal, price -> runningTotal + price }
    println("Total price of items in the empty cart: ${emptyTotalPrice ?: "No items"}")

    // endregion

    // region 提前返回（Early Return）与 Elvis 操作符

    val students = mapOf(
        1 to Student(1, "Alice", listOf(2, 3)),
        2 to Student(2, "Bob", listOf(1, 3)),
        3 to Student(3, "Charlie", listOf(1, 2))
    )

    println(getNumbersOfFriends(students, 1))
    println(getNumbersOfFriends(students, 2))
    println(getNumbersOfFriends(students, 4))

    // endregion
}