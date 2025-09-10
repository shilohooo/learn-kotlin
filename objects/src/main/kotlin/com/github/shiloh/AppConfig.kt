package com.github.shiloh

/**
 * data object 数据对象，与 data class 类似，自带 toString 和 equals 方法
 *
 * 但没有 copy 方法，因为 data object 也是单例的，不能复制
 *
 * @author shiloh
 * @date 2025/9/10 16:57
 */
data object AppConfig {
    var appName: String = "My App"
    var version: String = "1.0.0"
}