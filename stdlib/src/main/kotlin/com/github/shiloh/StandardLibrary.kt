package com.github.shiloh

import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import kotlin.time.Duration
// 同伴对象不可以使用 import xxx.* 导入
import kotlin.time.Duration.Companion.hours
import kotlin.time.Duration.Companion.minutes

/**
 * Kotlin 中的标准库
 *
 * 大部分标准库的 API 在使用时都不需要显示导入
 *
 * 需要显示导入的 API 有：
 *
 * 操作时间的：kotlin.time
 *
 * @OptIn(ExperimentalUnsignedTypes::class) 表示同意使用还处于实验性阶段/开发阶段的 API
 *
 * 如果没有使用这个注解去标识，直接使用的话可能会看到一些警告日志
 *
 * 要选择使用者同意(Opt-in), 请标注 @OptIn, 之后是括号, 括号之内是对 API 进行分组的类名称,
 * 之后是 2 个冒号 :: 和 class 关键字
 *
 * @author shiloh
 * @date 2025/9/13 10:13
 */
@OptIn(ExperimentalUnsignedTypes::class)
fun main() {
    val text = "emosewa si niltoK"
    println(text.reversed())

    val minutes: Duration = 30.minutes
    val halfHour: Duration = 0.5.hours
    println(minutes == halfHour)

    // region kotlinx.datetime

    // 获取当前时间
    val now = Clock.System.now()
    println("Current instant: $now")

    // 根据时区进行转换，获取所有支持的时区 Id：TimeZone.availableZoneIds
    val zone = TimeZone.of("Asia/Shanghai")
    val localDateTime = now.toLocalDateTime(zone)
    println("Local date-time in Shanghai: $localDateTime")

    // endregion

    // region experimental api

    // 创建一个无符号的整数数组
    val unsignedArr = uintArrayOf(1u, 2u, 3u, 4u, 5u)
    // 修改一个元素
    unsignedArr[2] = 42u
    println("Updated array: ${unsignedArr.joinToString()}")

    // endregion
}