fun main() {
    name("Valdo")
    name("Valdo", "Rendy")
}

fun name(firstName : String, lastName : String = ""){
    println("$firstName $lastName")
}
