package com.github.shiloh.controller

import com.github.shiloh.domain.Message
import com.github.shiloh.service.MessageService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI

/**
 * 测试消息接口
 *
 * @author shiloh
 * @date 2025/9/13 17:46
 */
@RestController
@RequestMapping("/messages")
class MessageController(val service: MessageService) {
    /**
     * 测试打招呼的接口
     * @param name 用户姓名
     * @return 问候语
     * @author shiloh
     * @date 2025/9/13 17:46
     */
    @GetMapping("/greeting")
    fun index(@RequestParam("name") name: String) = "Hello $name!"

    /**
     * 新增消息
     *
     * @param message 要新增的消息
     * @return 新增成功的消息
     * @author shiloh
     * @date 2025/9/13 18:11
     */
    @PostMapping
    fun save(@RequestBody message: Message): ResponseEntity<Message> {
        val savedMessage = service.save(message)
        return ResponseEntity.created(URI("/${savedMessage.id}"))
            .body(savedMessage)
    }

    /**
     * 获取消息列表
     *
     * @return 消息列表
     * @author shiloh
     * @date 2025/9/13 17:57
     */
    @GetMapping
    fun listMessages() = service.findMessages()

    /**
     * 根据 ID 获取消息详情
     * @param id 消息 ID
     * @return 消息详情
     * @author shiloh
     * @date 2025/9/13 18:45
     */
    @GetMapping("/{id}")
    fun getMessage(@PathVariable("id") id: String): ResponseEntity<Message> =
        service.findMessageById(id).toResponseEntity()

    private fun Message?.toResponseEntity() = this?.let { ResponseEntity.ok(it) }
        ?: ResponseEntity.notFound().build()
}