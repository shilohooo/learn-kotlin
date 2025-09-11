package com.github.shiloh.exercise

fun printDeliveryStatus(status: DeliveryStatus) {
    when (status) {
        is Pending -> println("The package is pending pickup from ${status.sender}.")
        is InTransit -> println("The package is in transit and expected to arrive by ${status.estimateDeliveryDate}.")
        is Delivered -> println("The package was delivered to ${status.recipient} on ${status.deliveryDate}.")
        is Canceled -> println("The delivery was canceled due to ${status.reason}.")
    }
}

fun handleStatus(status: Status) {
    when (status) {
        is Status.Loading -> println("loading...")
        is Status.OK -> println("Data received: ${status.data}")
        is Status.Error -> when (status.problem) {
            Problem.NETWORK -> println("Network issued")
            Problem.TIMEOUT -> println("Request time out")
            Problem.UNKNOWN -> println("Unknown error occurred")
        }
    }
}

/**
 * 开放类与特殊类相关的练习
 *
 * @author shiloh
 * @date 2025/9/11 17:40
 */
fun main() {
    // region exercise 1

    printDeliveryStatus(Pending("Alice"))
    printDeliveryStatus(InTransit("2024-11-20"))
    printDeliveryStatus(Delivered("Bob", "2024-11-22"))
    printDeliveryStatus(Canceled("Address not found"))

    // endregion

    // region exercise 2

    handleStatus(Status.Error(Problem.NETWORK))
    handleStatus(Status.OK(listOf("data1", "data2")))

    // endregion
}