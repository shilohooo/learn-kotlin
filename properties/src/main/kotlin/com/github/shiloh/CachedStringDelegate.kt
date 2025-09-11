package com.github.shiloh

import kotlin.reflect.KProperty

class CachedStringDelegate {
    var cachedValue: String? = null

    /**
     * 获取委托属性的值
     * @param thisRef 委托属性所在的对象，默认类型为 Any?，可以声明为具体的类型
     * @param property 委托属性
     * @return String 委托属性的值
     * @author shiloh
     * @date 2025/9/11 21:33
     */
    operator fun getValue(thisRef: User, property: KProperty<*>): String {
        if (cachedValue == null) {
            cachedValue = "Default Value"
            println("Computed and cached: $cachedValue")
        } else {
            println("Accessed from cache: $cachedValue")
        }

        return cachedValue ?: "Unknown"
    }
}