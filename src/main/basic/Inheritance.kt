fun main() {
    val employee = Employee("Valdo")
    val manager = Manager("Rendy")
    val director = Director("Mat")

    employee.sayHi()
    manager.sayHi()
    director.sayHello()
}

open class Employee(open var name: String){
    open fun sayHi(){
        println("Hi, im ${this.name}")
    }
}

open class Manager(name: String) : Employee(name){
    override var name = "Mr. $name"

    override fun sayHi(){
        println("Hi, im the manager, ${super.name}")
    }

    fun sayHello(){
        println("Hello guys, im ${this.name}")
    }
}
open class Director(name : String) : Manager(name)