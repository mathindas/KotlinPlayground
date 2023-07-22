fun main() {
    val myclass = myClass("Test")
    val yourclass = myclass::class

    val constructors = yourclass.constructors
}
