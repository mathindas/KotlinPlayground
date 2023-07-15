fun main() {
    println(sayHi { "valdo" })
}

inline fun sayHi(name : () -> String): String {
    return "Hi, ${name()}"
}