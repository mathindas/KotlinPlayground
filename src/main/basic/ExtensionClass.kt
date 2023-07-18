fun main() {
    val Mac = Laptop("Macbook")
    println(Mac.getBrand())
}

fun Laptop.getBrand(): String{
    return "This is ${this.brand}"
}

class Laptop(val brand: String){
    init{
        println("This is Laptop Class")
    }
}