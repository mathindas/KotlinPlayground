fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    numbers.printAllElements()

    val fruit = "apple"
    val prefixedFruit = fruit.addPrefix("Delicious")
    println(prefixedFruit)
}

private fun <T> List<T>.printAllElements() {
    for (element in this) {
        println(element)
    }
}

private fun <T> String.addPrefix(item: T): String {
    return "$item $this"
}
