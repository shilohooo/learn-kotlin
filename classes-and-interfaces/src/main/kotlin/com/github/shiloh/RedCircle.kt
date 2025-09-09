package com.github.shiloh

/**
 * 委托：不用重复实现功能相同的函数，只需委托给其他对象，通过关键字 by 实现
 *
 * 可以直接调用 circle 实现的 draw() 和 resize() 方法
 *
 * @author shiloh
 * @date 2025/9/9 21:16
 */
class RedCircle(val circle: Circle) : Drawable by circle {
    override val color: String? = "red"
}