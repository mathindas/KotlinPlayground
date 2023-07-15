fun main() {
    println(5 plus 100)
}

infix fun Int.plus(value: Int) : Int {
    return this + value
}