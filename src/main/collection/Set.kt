fun main() {
    val list = mutableSetOf<String>("Zero","One","Two")
    println(list)

    list.add("Three")
    list.add("Three")
    list.add("Three")
    println(list)
    println(list.size)
    println(list.contains("Three"))
}

