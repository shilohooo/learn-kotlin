package com.github.shiloh.exercises

class BasicMessenger : Messenger {
    override fun send(msg: String) {
        println("Sending message: $msg")
    }

    override fun receive(): String {
        return "You've got a new message!"
    }
}