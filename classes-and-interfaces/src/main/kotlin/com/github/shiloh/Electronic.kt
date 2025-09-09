package com.github.shiloh

class Electronic(name: String, price: Double, val warranty: Int) : Product(name, price) {
    /**
     * 实现父类定义的抽象属性
     */
    override val category: String = "Electronic"
}