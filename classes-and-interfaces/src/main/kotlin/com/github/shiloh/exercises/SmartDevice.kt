package com.github.shiloh.exercises

/**
 * 智能设备
 *
 * @property name 设备名称
 *
 * @author shiloh
 * @date 2025/9/9 21:23
 */
abstract class SmartDevice(val name: String) {
    /**
     * 打开设备
     *
     * @author shiloh
     * @date 2025/9/9 21:22
     */
    abstract fun turnOn()

    /**
     * 关闭设备
     *
     * @author shiloh
     * @date 2025/9/9 21:22
     */
    abstract fun turnOff()
}