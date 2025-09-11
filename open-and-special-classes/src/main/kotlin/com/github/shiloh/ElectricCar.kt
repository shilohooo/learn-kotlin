package com.github.shiloh

/**
 * 继承一个开放类，并实现多个接口
 *
 * @author shiloh
 * @date 2025/9/11 16:26
 */
class ElectricCar(
    make: String, model: String, numOfDoors: Int,
    // 实现接口中定义的属性
    override val emissionLevel: String,
    override val batteryCapacity: Double
) :
    Car(make, model, numOfDoors), EcoFriendly, ElectricVehicle