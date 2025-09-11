package com.github.shiloh

/**
 * 扩展属性：
 * 和扩展函数一样, 也有扩展属性. 扩展属性让你能够向既有的类添加新的属性,
 * 而不必修改它们的源代码. 但是, Kotlin 中的扩展属性 没有 后端域变量.
 * 这就意味着你需要自己编写 get() 和 set() 函数.
 * 此外, 没有后端域变量也意味着扩展属性不能保存任何状态.
 *
 * 要声明一个扩展属性, 请在你想要扩展的类的名称之后加上 ., 再加上属性的名称.
 * 和通常的类属性一样, 你需要为你的属性声明接受者类型. 例如: 获取字符串中的最后一个字符
 */
val String.lastChar: Char
    get() = this.last()

/**
 * 当你想要属性包含计算得到的值, 而不使用继承时, 扩展属性是很有用的.
 *
 * 你可以将扩展属性想象为一个函数, 只有一个参数: 接受者对象.
 *
 * 注意：扩展属性不能覆盖既有的类属性.
 */
val User.fullName: String
    get() = "$firstName $lastName"

/**
 * 延迟加载(Lazy)属性
 * 为了只在初次访问时才初始化一个属性, 请使用延迟加载(Lazy)属性. 标准库为委托提供了 Lazy 接口.
 *
 * 要创建 Lazy 接口的实例, 请使用 lazy() 函数, 给它提供一个 Lambda 表达式,
 * get() 函数第一次被调用时会执行这个 Lambda 表达式.
 * 之后对 get() 函数的任何调用都会返回与第一次调用时提供的相同结果.
 * 延迟加载属性使用 尾缀 Lambda 表达式(Trailing Lambda) 语法来传递 Lambda 表达式.
 *
 * 延迟加载属性默认是线程安全的~
 */
val databaseConnection: Database by lazy {
    // 创建实例
    val database = Database()
    // 初始化连接
    database.connect()
    // 返回实例
    database
}

fun fetchData() {
    val data = databaseConnection.query("select * from t_user")
    println("Data: $data")
}

/**
 * Kotlin 属性
 *
 * @author shiloh
 * @date 2025/9/11 21:18
 */
fun main() {
    val person = Person()
    person.name = "shiloh"
    println(person.name)

    val msg = "Hello"
    println(msg.lastChar)

    val user = User("shiloh", "lee")
    println(user.fullName.uppercase())

    // 第一次访问，没值，计算值并缓存
    println(user.displayName)

    // 第二次访问，有缓存，直接返回缓存值
    println(user.displayName)

    // 第一次访问延迟加载属性，会进行初始化
    fetchData()

    // 第二次访问，则直接使用已有的实例
    fetchData()

    val thermostat = Thermostat()
    thermostat.temperature = 22.5
    thermostat.temperature = 27.0
    println(thermostat.temperature)

}