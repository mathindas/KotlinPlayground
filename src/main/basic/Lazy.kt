fun main() {
    val lazyClass = LazyClass()
    println(lazyClass.name)
    println(lazyClass.name)
}

class LazyClass{
    val name : String by lazy {
        println("Created Lazy Class")
        "Lazy"
    }
}

