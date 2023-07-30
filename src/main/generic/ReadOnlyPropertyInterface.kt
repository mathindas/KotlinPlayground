import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty


fun main() {
    val exampleInt = Example(42)
    println(exampleInt.readOnlyProp)

    val exampleString = Example("Hello, world!")
    println(exampleString.readOnlyProp)
}

class Example<T>(initialValue: T) {
    private var storedValue: T = initialValue

    private class ReadOnlyPropertyImpl<T>(private val value: T) : ReadOnlyProperty<Any?, T> {
        override fun getValue(thisRef: Any?, property: KProperty<*>): T {
            return value
        }
    }

    val readOnlyProp: T by ReadOnlyPropertyImpl(storedValue)
}
