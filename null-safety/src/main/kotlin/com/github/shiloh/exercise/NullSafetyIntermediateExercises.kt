package com.github.shiloh.exercise

/**
 * 获取系统用户的通知偏好设置
 *
 * @author shiloh
 * @date 2025/9/12 22:43
 */
fun getNotificationPreferences(user: Any, emailEnabled: Boolean, smsEnabled: Boolean): List<String> {
    val validUser = user as? SysUser ?: return emptyList()
    val userName = validUser.name ?: "Guest"
    return listOfNotNull(
        "Email Notification enabled for ${userName.takeIf { emailEnabled }}",
        "SMS Notification enabled for ${userName.takeIf { smsEnabled }}"
    )
}

fun getActiveSubscription(subscriptions: List<Subscription>): Subscription? = subscriptions.singleOrNull { it.isActive }

fun getActiveUsernames(accounts: List<Account>): List<String> =
    accounts.mapNotNull { account -> account.username.takeIf { account.isActive } }

fun validateStock(requested: Int?, available: Int?): Int {
    val validRequested = requested ?: return -1
    val validAvailable = available ?: return -1
    if (validRequested < 0 || validRequested > validAvailable) {
        return -1
    }

    return validRequested
}

/**
 * Null 值安全性相关的练习
 *
 * @author shiloh
 * @date 2025/9/12 22:41
 */
fun main() {
    val user1 = SysUser("Alice")
    val user2 = SysUser(null)
    val invalidUser = "NotUser"
    println(getNotificationPreferences(user1, true, false))
    println(getNotificationPreferences(user2, false, true))
    println(getNotificationPreferences(invalidUser, true, true))

    val userWithPremiumPlans = listOf(
        Subscription("Basic Plan", false),
        Subscription("Premium Plan", true),
    )

    println(getActiveSubscription(userWithPremiumPlans))

    val userWithConflictingPlans = listOf(
        Subscription("Basic Plan", true),
        Subscription("Premium Plan", true),
    )
    println(getActiveSubscription(userWithConflictingPlans))

    val allAccounts = listOf(
        Account("Alice", true),
        Account("Bob", false),
        Account("Charlie", true),
    )
    println(getActiveUsernames(allAccounts))

    println(validateStock(5, 10))
    println(validateStock(null, 10))
    println(validateStock(-2, 10))
}