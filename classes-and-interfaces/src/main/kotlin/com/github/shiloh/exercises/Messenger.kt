package com.github.shiloh.exercises

interface Messenger {
    fun send(msg: String)

    fun receive(): String
}