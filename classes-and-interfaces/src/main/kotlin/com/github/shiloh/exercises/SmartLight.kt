package com.github.shiloh.exercises

class SmartLight(name: String) : SmartDevice(name) {
    override fun turnOn() {
        println("$name is now ON.")
    }

    override fun turnOff() {
        println("$name is now OFF.")
    }

    /**
     * 调节亮度
     * @param level 亮度级别
     * @author shiloh
     * @date 2025/9/9 21:25
     */
    fun adjustBrightness(level: Int) {
        println("Adjusting $name brightness  to $level%.")
    }
}