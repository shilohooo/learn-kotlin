package com.github.shiloh

/**
 * 类相关的练习
 *
 * @author shiloh
 * @date 2025/9/1 11:41
 */
fun main() {
    val employee = Employee("shiloh", 233.33)
    println(employee)

    employee.salary += 233.33

    println(employee)

    val person = Person(
        Name("Bruce", "Lee"),
        Address("123 street", City("New York", "US")),
        false
    )
    println(person)

    val generator = RandomEmployeeGenerator(10.5, 30.0)
    println(generator.generateEmployee())
    println(generator.generateEmployee())
    println(generator.generateEmployee())

    generator.minSalary = 233.33
    generator.maxSalary = 1000.0
    println(generator.generateEmployee())
}