package com.github.shiloh

/**
 * 抽象类，一个类只能单继承
 *
 * @author shiloh
 * @date 2025/9/9 21:05
 */
abstract class Product(val name: String, var price: Double) {
    /**
     * 抽象属性
     */
    abstract val category: String

    /**
     * 获取产品信息
     *
     * @author shiloh
     * @date 2025/9/9 20:59
     */
    fun productInfo(): String {
        return "Product: $name, Category: $category, Price: $price"
    }
}