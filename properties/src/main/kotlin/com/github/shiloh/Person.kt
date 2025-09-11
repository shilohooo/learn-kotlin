package com.github.shiloh

class Person {
    var name: String = ""
        set(value) {
            // 在 set() 函数中直接引用属性, 就会导致无限循环, 并在运行期发生 StackOverflowError 错误
            // name = value.replaceFirstChar { firstChar -> firstChar.uppercase() }
            // 改为使用 field 关键字引用后端域变量（Backing Field）
            // 当你想要添加日志, 在属性值变更时发送通知,
            // 或者使用附加逻辑比较属性的旧值和新值时, 后端域变量也很有用.
            field = value.replaceFirstChar { firstChar -> firstChar.uppercase() }
        }
}