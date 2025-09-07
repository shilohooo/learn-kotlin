/**
 * Int 类的扩展函数：判断一个数是否为整数
 *
 * @return 如果是整数，返回 true，否则返回 false
 * @author shiloh
 * @date 2025/9/7 11:17
 */
fun Int.isPositive(): Boolean = this > 0

/**
 * String 类的扩展函数：接收一个字符串参数，返回它的小写形式
 *
 * @return 小写字符串
 * @author shiloh
 * @date 2025/9/7 11:19
 */
fun String.toLowercaseStr(): String = this.lowercase()

fun main() {
    println(3.isPositive())
    println((-3).isPositive())

    println("HELLO WORLD".toLowercaseStr())
}