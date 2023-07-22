fun main() {
    val child = Child("Yun", 5)
    val (childName, childAge) = child
    println(childName)
    println(childAge)

    val (name,_) = child
    println(name)
}
data class Child(val name: String, val age: Int)

