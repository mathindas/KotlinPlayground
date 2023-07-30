import kotlin.properties.Delegates
import kotlin.reflect.KProperty

fun main() {
    val exampleInt = Example3(42)
    println(exampleInt.observableProp)

    exampleInt.observableProp = 100 
    println(exampleInt.observableProp)

    val exampleString = Example3("Hello, world!")
    println(exampleString.observableProp) 

    exampleString.observableProp = "Hi!"
    println(exampleString.observableProp)
}

class Example3<T>(initialValue: T) {
    var observableProp: T by Delegates.observable(initialValue) { property: KProperty<*>, oldValue: T, newValue: T ->
        println("${property.name} berubah dari $oldValue menjadi $newValue")
    }
}
