package com.github.shiloh

import kotlin.properties.Delegates.observable

/**
 * 可观测属性（Observable Property）
 *
 * @author shiloh
 * @date 2025/9/11 21:47
 */
class Thermostat {
    /**
     * 要监测属性值的变更, 请使用可观察(Observable)属性.
     * 如果你想要监测属性值的变更, 并利用这个信息来触发某种反应, 可观察属性会很有用.
     * 标准库提供了 Delegates 对象可以用作委托.
     *
     * 要创建一个可观察属性, 首先要导入 kotlin.properties.Delegates.observable.
     * 然后, 使用 observable() 函数, 并为这个函数提供一个 Lambda 表达式,
     * 当属性发生变更时会执行这个 Lambda 表达式.
     * 与延迟加载属性一样, 可观察属性使用 尾缀 Lambda 表达式(Trailing Lambda) 语法来传递 Lambda 表达式.
     *
     * 可观察属性的 Lambda 函数会接收三个参数:
     *
     * property: 属性对象本身
     *
     * oldValue: 属性的旧值
     *
     * newValue: 属性的新值
     */
    var temperature: Double by observable(20.0) { property, oldValue, newValue ->
        println("[observable property] - property name: ${property.name}")
        println("[observable property] - old value: $oldValue")
        println("[observable property] - new value: $newValue")
        if (newValue > 25) {
            println("[observable property] - warn - temperature is too high! ($oldValue℃ -> $newValue℃)")
        } else {
            println("[observable property] - warn - temperature updated: ($oldValue℃ -> $newValue℃)")
        }
    }
}