package com.github.shiloh

/**
 * 实现接口的类，一个类可以实现多个接口，用逗号隔开
 *
 * @author shiloh
 * @date 2025/9/9 21:07
 */
class CreditCardPayment(val cardNumber: String, val cardHolderName: String, val expiryDate: String) : PaymentMethod,
    PaymentType {
    override fun initiatePayment(amount: Double): String {
        // 模拟使用信用卡处理支付逻辑
        return "Payment of $$amount initiated using Credit Card ending in ${cardNumber.takeLast(4)}"
    }

    override val paymentType: String = "Credit Card"
}