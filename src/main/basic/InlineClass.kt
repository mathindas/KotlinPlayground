fun main() {
    val fish = Fish("Nemo")
    println(fish.swim())
    println(fish.test())
}

//cannon has 2 parameter
inline class Fish(val name: String){
    fun swim():String = "Swim $name"
    fun test():String = "test"
}