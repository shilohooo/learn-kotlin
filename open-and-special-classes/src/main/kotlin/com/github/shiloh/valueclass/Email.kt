package com.github.shiloh.valueclass

/**
 * 内联的值类型：只能包含值，必须拥有单个属性
 *
 * 值类型自带 equals()、hashCode()、toString() 方法
 *
 * 值类型可以直接使用，不必创建对象，减少开销，提升性能
 *
 * @author shiloh
 * @date 2025/9/11 17:35
 */
@JvmInline
value class Email(val address: String)