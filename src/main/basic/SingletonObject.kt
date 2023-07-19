fun main() {
    val utils = Utils.toUpper("this is utils")

    println(Utils.name)
    println(utils)
}

object Utils{
    val name = "Utils"
    fun toUpper(value:String) : String{
        return value.uppercase()
    }
}

