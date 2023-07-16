fun main() {
//    val location = Location("Jakarta")
    val city = City("DKI")
}

abstract class Location(val name:String)
class City(name : String) : Location(name)

