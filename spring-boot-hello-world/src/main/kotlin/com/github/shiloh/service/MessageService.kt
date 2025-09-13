package com.github.shiloh.service

import com.github.shiloh.domain.Message
import com.github.shiloh.repository.MessageRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

/**
 * 消息服务层
 *
 * @property db 通过依赖注入的 JdbcTemplate 对象实例（单例）
 * @author shiloh
 * @date 2025/9/13 18:05
 */
@Service
class MessageService(
//    private val db: JdbcTemplate
    private val db: MessageRepository
) {
    /**
     * 查询消息列表
     * @return 消息列表
     * @author shiloh
     * @date 2025/9/13 18:06
     */
    fun findMessages(): List<Message> = db.findAll().toList()
//        db.query("select * from t_messages") { resultSet, _ ->
//        Message(resultSet.getString("id"), resultSet.getString("text"))
//    }

    /**
     * 根据 ID 查询消息详情
     *
     * @author shiloh
     * @date 2025/9/13 18:29
     */
    fun findMessageById(id: String): Message? = db.findByIdOrNull(id)
//        db.query(
//        "select * from t_messages where id = ?",
//        { resultSet, _ -> Message(resultSet.getString("id"), resultSet.getString("text")) },
//        id
//    ).singleOrNull()

    /**
     * 保存消息
     *
     * @author shiloh
     * @date 2025/9/13 18:08
     */
    fun save(message: Message): Message = db.save(message)
//    {
//        val id = message.id ?: UUID.randomUUID().toString()
//        db.update(
//            "insert into t_messages values ( ?, ? )",
//            id, message.text
//        )
//        message.id = id
//        return message
//
//    }
}