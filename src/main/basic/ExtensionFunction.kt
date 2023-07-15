fun main() {
    println(50000.inRupiah())
    println(100000.inDollar(15000)  )
}

fun Int.inRupiah(): String{
    return "Rp. $this"
}

fun Int.inDollar(dollarNow : Int): String{
    return "$${this.toFloat()/dollarNow}"
}