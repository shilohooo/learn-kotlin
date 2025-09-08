/**
 * 发送通知
 *
 * @author shiloh
 * @date 2025/9/7 12:13
 */
fun sendNotification(recipientAddress: String): String {
    println("Yo $recipientAddress")
    return "Notification sent!"
}

/**
 * 获取下一个地址
 *
 * @author shiloh
 * @date 2025/9/7 12:13
 */
fun getNextAddress(): String {
    return "shiloh595@gmail.com"
}

/**
 * 作用域函数：围绕一个对象创建临时作用域，执行指定的代码
 *
 * 在作用域函数中，可以通过关键字 this 引用对象，或通过关键字 it 将其作为一个参数
 *
 * Kotlin 共有 5 个作用域函数: let, apply, run, also, 和 with.
 *
 * 每个作用域函数接受一个 Lambda 表达式参数, 并返回对象, 或返回 Lambda 表达式的结构.
 *
 * @author shiloh
 * @date 2025/9/7 12:08
 */
fun main() {
    // region let

    val address: String? = getNextAddress()
    // 下面这行将报错：Argument type mismatch: actual type is 'String?', but 'String' was expected.
    // val confirm = sendNotification(address)

    // 使用 if 控制流
//    val confirm = if (address != null) {
//        sendNotification(address)
//    } else {
//        null
//    }

    // 使用 let 作用域函数
    val confirm = address?.let {
        // 临时作用域，将 sendNotification() 函数作为一个 lambda 表达式传递给 let 作用域函数
        // 通过 it 引用 address 变量
        // 执行代码后将返回结果赋值给 confirm 变量
        sendNotification(it)
    }
    println(confirm)

    // endregion

    // region apply

    // 使用 apply 作用域函数, 能够在创建时而不是在之后的代码中初始化对象, 例如一个类实例.
    // 这种方法能够让你的代码更加易于阅读和管理

    // 创建 client 实例
    val client = Client()
    // 一些初始化操作
    client.token = "mock token"
    client.connect()
    client.authenticate()
    // 获取数据
    println(client.getData())

    println("======================================")

    // 使用 apply 作用域函数简化创建、配置操作
    val clientByApply = Client().apply {
        // 在临时作用域访问 client 实例的属性、函数，且无需显示引用 client 实例
        // 下面的代码可以看作是一个传递给 lambda 表达式的方法体
        token = "mock token"
        connect()
        authenticate()
    }
    // 使用 client 获取数据
    println(clientByApply.getData())

    // endregion

    // region run

    // 与 apply 类似, 你可以使用 run 作用域函数来初始化一个对象,
    // 但 run 最好的使用场景是, 在代码的某个特定时刻初始化一个对象, 并且 立即计算一个结果.

    val clientByRun = Client().apply { token = "mock token" }
    println("======================================")

    val resultByRun: String = clientByRun.run {
        connect()
        authenticate()
        getData()
    }

    println(resultByRun)

    // endregion

    // region also

    // 对一个对象完成一个额外的动作，然后返回对象在代码中继续使用
    println("======================================")
    val medals = listOf("Gold", "Silver", "Bronze")
    val reversedLongUppercaseMedals: List<String> = medals
        // 使用 it 关键字引用 medals 中的元素
        .map { it.uppercase() }
        // 使用 also 作用域函数打印一些日志，然后继续返回 medals 列表，后面可以接着用
        // 由于 also 函数返回对象, 它不仅能够用于 log 输出, 还适合于调试, 链接多个操作,
        // 以及执行其它不影响代码主体流程的副作用操作.
        .also { println(it) }
        .filter { it.length > 4 }
        .also { println(it) }
        .reversed()
    println(reversedLongUppercaseMedals)

    // endregion

    // region with

    // 当想要对一个对象调用多个函数时，可以使用 with 作用域函数
    // 需要向 with 传递接收者对象作为参数

    println("======================================")
    val canvas = Canvas()
    canvas.text(10, 10, "Foo")
    canvas.rect(20, 30, 100, 50)
    canvas.circ(40, 60, 25)
    canvas.text(15, 45, "Hello")
    canvas.rect(70, 80, 150, 100)
    canvas.circ(90, 110, 40)
    canvas.text(35, 55, "World")
    canvas.rect(120, 140, 200, 75)
    canvas.circ(160, 180, 55)
    canvas.text(50, 70, "Kotlin")

    // 使用 with 让代码更简洁
    println("======================================")
    with(canvas) {
        text(10, 10, "Foo")
        rect(20, 30, 100, 50)
        circ(40, 60, 25)
        text(15, 45, "Hello")
        rect(70, 80, 150, 100)
        circ(90, 110, 40)
        text(35, 55, "World")
        rect(120, 140, 200, 75)
        circ(160, 180, 55)
        text(50, 70, "Kotlin")
    }

    // endregion
}
