package com.github.shiloh.exercises

/**
 * 类继承练习
 *
 * @author shiloh
 * @date 2025/9/9 21:30
 */
fun main() {
    val light = SmartLight("Living Root Light")
    light.turnOn()
    light.adjustBrightness(10)
    light.turnOff()

    val thermostat = SmartThermostat("Bedroom thermostat")
    thermostat.turnOn()
    thermostat.adjustTemperature(25.5)
    thermostat.turnOff()
}