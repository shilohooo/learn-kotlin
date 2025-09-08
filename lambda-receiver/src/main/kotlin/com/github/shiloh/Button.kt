package com.github.shiloh

class Button {
    fun onEvent(action: ButtonEvent.() -> Unit) {
        val event = ButtonEvent(false, 2, Position(100, 200))
        event.action()
    }
}