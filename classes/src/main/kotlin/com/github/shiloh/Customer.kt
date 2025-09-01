package com.github.shiloh

/**
 * 客户信息类
 *
 * @author shiloh
 * @date 2025/9/1 9:47
 */
class Customer(val id: Int, var email: String = "test@gmail.com") {
    val category: String = "work"

    /**
     * 成员函数：打印 ID
     *
     * @author shiloh
     * @date 2025/9/1 11:22
     */
    fun printId() {
        println("id = $id")
    }
}