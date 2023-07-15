fun main() {
    var counter = 0
    val addCounter: () -> Unit = {
        counter++
    }
    println(counter)
    addCounter()
    println(counter)
    addCounter()
    println(counter)
}