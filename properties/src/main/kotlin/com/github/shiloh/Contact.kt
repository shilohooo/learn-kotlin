package com.github.shiloh

class Contact(val id: String, val email: String) {
    /**
     * 在 Kotlin 中, 属性拥有默认的 get() 和 set() 函数, 称为属性访问器, 负责获取和修改属性值.
     * 这些默认函数在代码中并不明确的可见, 编译器自动生成这些函数, 在后台管理属性的访问.
     * 这些访问器使用一个 后端域变量(Backing Field) 来存储实际的属性值.
     *
     * get() = 获取值
     *
     * set() = 设置值
     */
    var category: String = ""
        // field 关键字代表当前属性
        get() = field
        set(value) {
            field = value
        }
}