fun main() {
    println(factorial(10))
}

fun factorial(value: Int): Int {
    return when (value) {
        1 -> 1
        else -> value * factorial(value - 1)
    }
}