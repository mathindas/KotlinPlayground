import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun main() {
    val exampleInt = Example2(42)
    println(exampleInt.readWriteProp)

    exampleInt.readWriteProp = 100
    println(exampleInt.readWriteProp)

    val exampleString = Example2("Hello, world!")
    println(exampleString.readWriteProp)

    exampleString.readWriteProp = "Hi!"
    println(exampleString.readWriteProp)
}

class Example2<T>(private var initialValue: T) {
    private class ReadWritePropertyImpl<T> : ReadWriteProperty<Example2<T>, T> {
        override fun getValue(thisRef: Example2<T>, property: KProperty<*>): T {
            return thisRef.initialValue
        }

        override fun setValue(thisRef: Example2<T>, property: KProperty<*>, value: T) {
            thisRef.initialValue = value
        }
    }

    var readWriteProp: T by ReadWritePropertyImpl()
}
