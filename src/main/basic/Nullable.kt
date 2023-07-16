import java.util.SimpleTimeZone

fun main() {
    justPrint(dynamic("This is String"))
    justPrint(dynamic(0))

    safeNullPrint(dynamic("This is String"))
    safeNullPrint(dynamic(0))
}

fun dynamic(any : Any) : Any = any

fun justPrint(any: Any){
    when(any){
        is String -> println(any)
        is Int -> println(any.toString())
    }
}

fun safeNullPrint(any : Any){
    val value = any as? String
    println(value)
}
