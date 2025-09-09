package com.github.shiloh.exercises

class SmartMessenger(val basicMessenger: BasicMessenger) : Messenger by basicMessenger {
    override fun send(msg: String) {
        println("Sending a smart message: $msg")
        basicMessenger.send("[smart] $msg")
    }
}