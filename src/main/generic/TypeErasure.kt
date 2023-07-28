fun main() {
    val intContainer = ContainerErasure(42)
    val strContainer = ContainerErasure("Hello, Kotlin!")

    val intValue: Int = intContainer.getValue()
    val strValue: String = strContainer.getValue()

    println("intValue: $intValue")
    println("strValue: $strValue")
}

class ContainerErasure<T>(private val value: T) {
    fun getValue(): T {
        return value
    }
}


