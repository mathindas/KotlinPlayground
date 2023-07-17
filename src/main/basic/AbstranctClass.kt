fun main() {
//    val location = Location("Jakarta")
    val city = City("Jakarta")
}

abstract class Location {
    abstract val name : String
    abstract fun getAddress()
}

class City(override val name: String) : Location() {
    override fun getAddress() {
        println("address")
    }
}

