package com.github.shiloh.exercise

object FlyingSkateboard : Vehicle {
    override val name: String = "Flying Skateboard"

    override fun move(): String = "Glides through the air with a hover engine"

    fun fly(): String = "Woooooooooo!"
}