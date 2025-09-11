package com.github.shiloh.constant

/**
 * 枚举类也可以拥有属性和成员函数
 *
 * Kotlin 将 16 进制数保存为整数, 因此 rgb 属性使用 Int 类型, 而不是 String 类型.
 *
 * @author shiloh
 * @date 2025/9/11 17:22
 */
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF),
    YELLOW(0xFFFF00);

    // 要添加函数，需要在最后一个枚举常量后面加上分号，以分割枚举常量和函数
    fun containsRed(): Boolean = (this.rgb and 0xFF0000 != 0)
}