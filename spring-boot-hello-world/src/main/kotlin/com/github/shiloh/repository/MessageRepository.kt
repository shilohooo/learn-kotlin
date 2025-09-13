package com.github.shiloh.repository

import com.github.shiloh.domain.Message
import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String> {
}