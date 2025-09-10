# Kotlin Objects

## 对象声明

支持继承接口/抽象类

- object
    - 普通的对象声明，默认单例 + 延迟加载
- data object
    - 类型 data class 的对象声明，默认单例 + 延迟加载，且自带 toString 和 equals 方法
- companion object
    - 同伴对象，必须声明在类 {} 里面，且一个类只能有一个同伴对象
    - 在同伴对象之内声明的任何属性或函数, 都在类的所有实例之间共享