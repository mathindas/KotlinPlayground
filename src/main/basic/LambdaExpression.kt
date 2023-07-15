fun main() {
    val toUppercase : (String) -> String = {
        it.uppercase()
    }
    val toRupiah: (Int) -> String = ::addRupiah

    println(toUppercase("valdo"))
    println(toRupiah(50000))
}

fun addRupiah(value : Int) : String = "Rp. $value"