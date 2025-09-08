package com.github.shiloh

fun menu(name: String, init: Menu.() -> Unit): Menu {
    val menu = Menu(name)
    menu.init()
    return menu
}

fun printMenu(menu: Menu) {
    println("Menu: ${menu.name}")
    menu.items.forEach { println("Item: ${it.name}") }
}

/**
 * 带接收者的 lambda 表达式
 *
 * Lambda 表达式也可以带有接受者. 这种情况下, Lambda 表达式能够访问接受者对象的任何成员函数或属性, 而不必每次都明确的指明接受者对象.
 *
 * 没有了这些额外的引用, 代码会变得更加易于阅读和维护.
 *
 * 带接受者的 Lambda 表达式的语法与定义函数类型时不同.
 * 首先, 写下想要扩展的接受者类型. 之后, 是一个 . 号, 之后写下函数类型定义的其它部分. 例如:
 * MutableList<Int>.() -> Unit
 *
 * 这个函数的接收者类型是：MutableList<Int>，且()内没有参数，没有返回值：Unit
 * @author shiloh
 * @date 2025/9/8 9:05
 */
fun main() {
    // 带接收者的 lambda 表达式定义，它扩展 StringBuilder 类型，给 StringBuilder 扩展了一个 appendText 函数，用来追加特定的文本
    // 在该定义中，StringBuilder 是接收者类型，因此，在 lambda 中，可以访问 StringBuilder 的成员属性和函数
    val appendText: StringBuilder.() -> Unit = { append("Hello!") }
    // 如何使用：先创建一个接收者类型的实例
    val stringBuilder = StringBuilder()
    // 调用扩展函数
    stringBuilder.appendText()
    println(stringBuilder.toString())

    // 模拟 DSL 来创建菜单
    val mainMenu = menu("Main Menu") {
        item("Home")
        item("About")
        item("Contact")
    }
    printMenu(mainMenu)
}