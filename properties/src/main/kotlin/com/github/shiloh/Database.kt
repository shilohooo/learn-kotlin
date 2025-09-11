package com.github.shiloh

class Database {
    fun connect() {
        println("Connecting to the database...")
    }

    fun query(sql: String): List<String> {
        println("query by $sql")
        return listOf("Data1", "Data2", "Data3")
    }
}