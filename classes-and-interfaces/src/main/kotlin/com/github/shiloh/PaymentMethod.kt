package com.github.shiloh

/**
 * 接口，一个类可以实现多个接口
 *
 * @author shiloh
 * @date 2025/9/9 21:05
 */
interface PaymentMethod {
    /**
     * 接口中定义的函数默认支持继承
     *
     * @author shiloh
     * @date 2025/9/9 21:06
     */
    fun initiatePayment(amount: Double): String
}