package com.github.shiloh.sealedclass

/**
 * 封闭类，仅允许同一个包下面的类继承
 *
 * @author shiloh
 * @date 2025/9/11 16:36
 */
sealed class Mammal(val name: String)