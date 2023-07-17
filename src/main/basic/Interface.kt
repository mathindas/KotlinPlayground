fun main() {
    val cute = Cat("Ruru")
    cute.run()
}

interface Animal{
    val name: String
    fun run()
}

class Cat(override val name: String) : Animal{
    override fun run() {
        println(name)
    }
}

