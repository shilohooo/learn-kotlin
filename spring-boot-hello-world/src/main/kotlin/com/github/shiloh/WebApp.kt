package com.github.shiloh

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebApp

/**
 * 应用入口
 *
 * @author shiloh
 * @date 2025/9/13 17:41
 */
fun main(args: Array<String>) {
    // *args 表示展开（spread）数组，它会变成 vararg 可变参数类型
    // 由于存在的是字符串的数组, 而你想要将它的内容传递给函数,
    // 请使用展开(spread)操作符 (在数组之前加上星号 *).
    runApplication<WebApp>(*args)
}
