fun main() {
    val arrayInt = arrayOf(1,2,3)
    val arrayChar = arrayOf('a','b', 'c', 'd')

    showLength(arrayInt)
    showLength(arrayChar)
}

fun showLength(array: Array<*>){
    println("Length : ${array.size}")
}
