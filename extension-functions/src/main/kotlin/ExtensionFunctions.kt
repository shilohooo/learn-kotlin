/**
 * 给 String 添加一个 bold 扩展函数，使其返回一个加粗的字符串
 *
 * this 指向当前对象
 *
 * 扩展函数的语法为：fun 类的名称.自定义的扩展函数名称(参数列表): 返回值类型 { 方法体 }
 *
 * 在这个函数中
 *
 * String 类是被扩展的类，称为接收者类型
 *
 * bold 是扩展函数的名称
 *
 * .bold() 扩展函数返回的类型为 String
 *
 * main() 中的代码，"hello world" 是一个字符串实例，称为接收者对象
 *
 * 在这个扩展数的方法体中，使用 this 来访问接收者对象
 *
 *
 * @author shiloh
 * @date 2025/9/7 11:04
 */
fun String.bold(): String = "<b>$this</b>"


/**
 * 扩展函数：给类添加自定义方法，且无需修改类的源代码
 *
 * @author shiloh
 * @date 2025/9/7 11:03
 */
fun main() {
    println("hello world".bold())
}