package com.github.shiloh

data class User(val firstName: String, val lastName: String) {
    /**
     * 将属性 displayName 的实现委托给 CachedStringDelegate 去实现
     *
     * 委托属性可以实现缓存效果，不必每次都计算属性值
     *
     * @see CachedStringDelegate
     */
    val displayName: String by CachedStringDelegate()
}
