package com.github.shiloh

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    }

    return "Empty or null string"
}

// 属性/函数的安全调用
fun stringLength(maybeString: String?): Int? = maybeString?.length

/**
 * 空安全
 *
 * @author shiloh
 * @date 2025/9/1 11:57
 */
fun main() {
    // 默认不能为null
    var name: String = "shiloh"
    // 下面这行代码将会报错：Null cannot be a value of a non-null type 'String'.
    //    name = null

    // 在类型声明后面加问号，代表可以为 null，即 nullable
    var username: String? = "shiloh595"
    println(username)
    username = null
    // 输出 null
    println(username)

    val nullString: String? = null
    println(describeString(nullString))
    println(stringLength(nullString))
    // 安全调用函数
    println(nullString?.uppercase())

    // Elvis 操作符 ?:，指定检测到 null 值时的默认返回值
    // Elvis 操作符的左侧, 是需要检测 null 值的表达式. Elvis 操作符的右侧, 是检测到 null 值时应该返回的默认值.
    val length = nullString?.length ?: 0
    println(length)
}