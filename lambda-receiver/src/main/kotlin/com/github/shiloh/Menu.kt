package com.github.shiloh

class Menu(val name: String) {
    val items = mutableListOf<MenuItem>()

    fun item(name: String) {
        this.items.add(MenuItem(name))
    }
}