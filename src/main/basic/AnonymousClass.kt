fun main() {
    val greeter: Greeter = object : Greeter {
        override fun greet() {
            println("Hello")
        }
    }
    greeter.greet()
}

interface Greeter {
    fun greet()
}