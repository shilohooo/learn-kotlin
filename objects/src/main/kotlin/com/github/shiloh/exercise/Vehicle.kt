package com.github.shiloh.exercise

interface Vehicle {
    /**
     * 车辆名称
     */
    val name: String

    /**
     * 车辆移动
     *
     * @author shiloh
     * @date 2025/9/10 17:22
     */
    fun move(): String
}