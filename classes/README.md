# Kotlin Class

- 类的属性可以有默认值
- 类的属性推荐使用 `val` 声明，需要修改的时候，才改为 `var`
- 类的属性声明可以放在两个地方
    - 类名称的小括号里面：`class Person(val name: String, age: Int)`
    - 类的大括号里面（body）：`class Person { val name: String, age: Int }`

## Data class

适用于存储数据，自带一些成员函数，比如：

- `toString()` - 将类实例和它的属性打印为一个易于阅读的字符串.
- `equals()` / == - 比较一个类的实例.
- `copy()` - 创建一个类的实例, 从另一个实例复制, 一部分属性可以不同.