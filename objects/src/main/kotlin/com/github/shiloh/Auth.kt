package com.github.shiloh

interface Auth {
    /**
     * 获取账号密码
     * @param username 账号
     * @param password 密码
     * @author shiloh
     * @date 2025/9/10 16:55
     */
    fun takeParams(username: String, password: String)
}