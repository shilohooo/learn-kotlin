package com.github.shiloh.exercises

class SmartThermostat(name: String) : SmartDevice(name) {
    override fun turnOn() {
        println("$name is now ON.")
    }

    override fun turnOff() {
        println("$name is now OFF.")
    }

    /**
     * 调节温度
     * @param celsius 摄氏度
     * @author shiloh
     * @date 2025/9/9 21:25
     */
    fun adjustTemperature(celsius: Double) {
        println("$name temperature set to $celsius℃.")
    }
}