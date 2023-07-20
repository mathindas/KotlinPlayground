fun main() {
    val baby = Baby("Carmel", 1)

    println(baby.component1())
    println(baby.component2())
}
data class Baby(val name: String, val age: Int)

