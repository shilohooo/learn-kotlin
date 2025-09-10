package com.github.shiloh

class BigBen {
    /**
     * 同伴对象：在 Kotlin 中, 一个类可以带有一个对象: 一个 同伴(Companion) 对象.
     * 对每个类, 你只能有 一个 同伴对象. 只有在类初次被引用时, 同伴对象才会被创建.
     *
     * 在同伴对象之内声明的任何属性或函数, 都在类的所有实例之间共享.
     *
     * @author shiloh
     * @date 2025/9/10 17:01
     */
    companion object Bonger {
        fun getBongs(nTimes: Int) {
            repeat(nTimes) { println("BONG") }
        }
    }
}