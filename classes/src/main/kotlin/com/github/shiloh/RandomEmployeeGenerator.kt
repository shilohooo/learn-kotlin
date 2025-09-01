package com.github.shiloh

import kotlin.random.Random

class RandomEmployeeGenerator(var minSalary: Double, var maxSalary: Double) {
    /**
     * 员工名称列表
     */
    val names: List<String> = listOf("shiloh", "bruce", "tom", "rose", "jack", "thomas")

    /**
     * 随机生成一个员工信息
     *
     * @return 员工信息
     * @author shiloh
     * @date 2025/9/1 11:50
     */
    fun generateEmployee(): Employee = Employee(
        names.random(), Random.nextDouble(minSalary, maxSalary + 1.0)
    )
}