fun main() {
    val map = mutableMapOf<Int, String>(
        1 to "a",
        2 to "b",
        3 to "c"
    )

    val map2 : MutableMap<Int, String> = mutableMapOf()
    map2[1] = "x"
    map2[2] = "y"
    map2[3] = "z"

    println(map)
    println(map2)

    println(map[1])
    println(map2[2])
}

