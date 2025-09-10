package com.github.shiloh

/**
 * Kotlin 中的对象声明：object 对象名称 {}
 *
 * 对象声明默认为单例，线程安全，且是延迟加载的
 *
 * 对象声明可以继承类 / 接口
 *
 * @author shiloh
 * @date 2025/9/10 16:52
 */
object DoAuth : Auth {
    override fun takeParams(username: String, password: String) {
        println("input Auth parameters = $username:$password")
    }
}