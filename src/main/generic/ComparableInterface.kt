fun main() {
    val number1 = SortableItem(10)
    val number2 = SortableItem(20)

    val string1 = SortableItem("apple")
    val string2 = SortableItem("banana")

    println(number1 < number2)
    println(string1 > string2)

    val numbers = listOf(SortableItem(5), SortableItem(2), SortableItem(8))
    val sortedNumbers = numbers.sorted()

    for (number in sortedNumbers) {
        println(number.value)
    }
}

class SortableItem<T : Comparable<T>>(val value: T) : Comparable<SortableItem<T>> {
    override fun compareTo(other: SortableItem<T>): Int {

        return value.compareTo(other.value)
    }
}
