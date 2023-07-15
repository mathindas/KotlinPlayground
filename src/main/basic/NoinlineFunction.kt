fun main() {
    println(name({"Valdo"}, {"Rendy"}))
}

inline fun name(firstname:()-> String, noinline lastname:()->String): String {
    return "${firstname()} ${lastname()}"
}