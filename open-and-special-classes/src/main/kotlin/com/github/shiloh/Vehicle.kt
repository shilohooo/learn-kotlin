package com.github.shiloh

/**
 * 普通的类默认不能被继承，需要添加 open 修饰符
 * @property make 厂商
 * @property model 模型
 * @author shiloh
 * @date 2025/9/11 15:55
 */
open class Vehicle(val make: String, val model: String) {
    /**
     * 属性默认也不能被子类覆盖，如果需要覆盖，则需要添加 open 修饰符
     *
     * 但这种做法不常用，建议将属性声明到父类的构造中，在创建子类的时候直接声明属性值
     */
    open val transmissionType: String = "Manual"

    /**
     * 默认情况下，普通类的成员函数合属性不能被子类覆盖，如果需要覆盖，则需要添加 open 修饰符
     *
     * @author shiloh
     * @date 2025/9/11 16:09
     */
    open fun displayInfo() {
        print("Vehicle Info: Make - $make, Model - $model")
    }
}