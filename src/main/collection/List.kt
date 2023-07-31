fun main() {
    val list = mutableListOf<String>("Zero","One","Two")
    println(list)

    list.add("Three")
    println(list)
    println(list[1])

    list.add(1,"AddOne")
    println(list)
    println(list[1])

    list.remove("AddOne")
    list.removeAt(0)
    println(list)
}

