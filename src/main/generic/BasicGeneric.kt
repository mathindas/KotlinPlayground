fun main() {
    val genericString = GenericClass("Valdo")
    println(genericString.data)

    val genericInt = GenericClass(10)
    println(genericInt.data)
}

class GenericClass<T>(val data : T)
