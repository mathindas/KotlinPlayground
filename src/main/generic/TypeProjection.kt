fun main() {
    val intContainer = Container(42)
    val strContainer = Container("Hello, Kotlin!")

    printValue(intContainer)
    printValue(strContainer)
}

class Container<out T>(private val value: T) {
    fun getValue(): T {
        return value
    }
}

fun printValue(container: Container<out Any>) {
    val value: Any = container.getValue()
    println(value)
}


