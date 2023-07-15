fun main() {
    sum(10, 5,3,2)
    sum(100)
}

fun sum(baseValue: Int = 0, vararg sumBy : Int){
    var total = baseValue
    for(i in sumBy){
        total += i
    }
    println(total)
}
