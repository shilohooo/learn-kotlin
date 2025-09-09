package com.github.shiloh.exercises

class Audio(override val title: String, val composer: String) : Media {
    override fun play() {
        println("Playing audio: $title, composer by $composer")
    }
}