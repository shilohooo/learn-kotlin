fun Product.getPriceInEuros(): Double? = getProductInfo()?.priceInDollars?.let { convertToEuros(it) }

fun convertToEuros(dollars: Double): Double = dollars * 0.85

fun updateEmail(user: User, newEmail: String): User =
    user.apply { this.email = newEmail }
        .also { println("Updating email for user with ID: ${it.id}") }

/**
 * 作用域函数练习
 *
 * @author shiloh
 * @date 2025/9/7 18:43
 */
fun main() {
    val product = Product()
    val priceInEuros = product.getPriceInEuros()
    if (priceInEuros != null) {
        println("Price in Euros: €$priceInEuros")
    } else {
        println("Price information is not available.")
    }

    val user = User(1, "shiloh595@gmail.com")
    val updateUser = updateEmail(user, "newEmail@qq.com")
    println("Updated user: $updateUser")
}