fun main() {
    val personValdo = Person("Valdo", "Rendy", "Mat")
    println(personValdo.firstName)
    println(personValdo.middleName)
    println(personValdo.lastNameParam)
    personValdo.sayHi("Bro")
    personValdo.sayHi("Bro", "Sist")
}

class Person(firstNameParam : String, middleNameParam: String, var lastNameParam: String){
    var firstName : String = firstNameParam
    var middleName : String = middleNameParam

    init {
        println("Person Class was created")
    }
    fun sayHi(firstName: String){
        println("Hi $firstName, my name is ${this.firstName}")
    }
    fun sayHi(yourName: String, yourName2 : String){
        println("Hi $yourName and $yourName2, my name is $firstName")
    }
}
