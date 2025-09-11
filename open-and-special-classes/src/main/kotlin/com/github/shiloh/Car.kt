package com.github.shiloh

/**
 * 继承普通的类，父类需要使用 open 修饰符
 *
 * @author shiloh
 * @date 2025/9/11 16:02
 */
open class Car(make: String, model: String, val numOfDoors: Int) : Vehicle(make, model) {
    override val transmissionType: String = "Automatic"

    override fun toString(): String {
        return "Car Info: Make - $make, Model - $model, Number of doors - $numOfDoors"
    }

    /**
     * 覆盖父类的方法，需要使用 override 修饰符
     *
     * @author shiloh
     * @date 2025/9/11 16:12
     */
    override fun displayInfo() {
        println(this)
    }
}