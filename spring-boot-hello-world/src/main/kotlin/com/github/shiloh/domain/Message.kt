package com.github.shiloh.domain

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("T_MESSAGES")
data class Message(
    val text: String,
    @Id var id: String? = null
)
