package com.github.shiloh

/**
 * Kotlin 中的 Objects
 *
 * @author shiloh
 * @date 2025/9/10 16:53
 */
fun main() {
    DoAuth.takeParams("admin", "123456")

    // 下面这一行会输出 AppConfig
    println(AppConfig)
    println(AppConfig.appName)
    println(AppConfig.version)

    BigBen.getBongs(12)
}