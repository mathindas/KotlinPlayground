fun main() {
    val personFull = PersonWithConstructor("Valdo", "Rendy", "Mat")
    val personFirstConstructor = PersonWithConstructor("Valdo", "Mat")
    val personSecondConstructor = PersonWithConstructor("Valdo")
    println("${personFull.firstName} ${personFull.middleName} ${personFull.lastNameParam}")
    println("${personFirstConstructor.firstName} ${personFirstConstructor.lastNameParam}")
    println(personSecondConstructor.firstName)
}

class PersonWithConstructor(firstNameParam : String, middleNameParam: String?, lastNameParam: String?){
    var firstName : String = firstNameParam
    var middleName : String? = middleNameParam
    var lastNameParam : String? = lastNameParam

    constructor(firstNameParam : String, lastNameParam:String) : this(firstNameParam, null, lastNameParam)
    constructor(firstNameParam: String): this(firstNameParam, null, null)
}