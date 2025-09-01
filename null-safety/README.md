# Kotlin Null Safety

为了帮助在程序中防止 null 值相关的问题, Kotlin 提供了 null 值安全性功能. null 值安全性功能会在编译期检测 null 值潜在的问题,
而不是在运行期.

Null 安全性是多种功能的组合, 使得你能够:

- 如果你的程序允许 null 值, 可以明确声明.
- 检查 null 值.
- 对可能包含 null 值的属性或函数, 使用安全调用.
- 如果检测到 null 值时, 声明如何处理.

Kotlin 支持可为 null 的类型, 这样的类型允许存在 null 值. 默认情况下, 一个类型 不能 接受 null 值. 声明可为 null 的类型的方法是,
在类型声明之后明确添加 ?.

```kotlin
fun main() {
    var name: String? = "Kotlin"
    name = null
}
```