fun main() {
    val number:Double = 0.0449999
    val number3digits:Double = Math.round(number * 1000.0) / 1000.0
    val number2digits:Double = Math.round(number * 100.0) / 100.0
    val number1digits:Double = Math.round(number * 10.0) / 10.0

    val ceiling2digit = Math.round(number3digits * 100.0) / 100.0
    val ceiling1digit = Math.round(ceiling2digit * 10.0) / 10.0

    println(number3digits)
    println(number2digits)
    println(number1digits)
    println(ceiling2digit)
    println(ceiling1digit)
}
