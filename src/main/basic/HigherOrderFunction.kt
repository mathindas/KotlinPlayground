fun main() {
    println(transformString("valdo") { it.uppercase() })
    println(transformString("LOWERCASE") { it.lowercase()})
}

fun transformString(value:String, transf: (String) -> String) : String{
    return "$value to ${transf(value)}"
}