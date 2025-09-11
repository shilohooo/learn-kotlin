package com.github.shiloh.exercise

sealed class Status {
    data object Loading : Status()
    data class Error(val problem: Problem) : Status() {

    }

    data class OK(val data: List<String>) : Status()
}