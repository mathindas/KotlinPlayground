fun main() {
    val cuteDog = Corgi("Rere")
    cuteDog.barking()
    cuteDog.play()
    cuteDog.run()
}

interface Pets{
    fun play(){
        println("Play with Pets")
    }
    fun run(){
        println("Pets run")
    }
}

interface Dogs{
    fun barking(){
        println("Woof")
    }
    fun run(){
        println("Dogs run")
    }
}

class Corgi(name: String): Pets, Dogs{
    init{
        println(name)
    }

    override fun run() {
        super <Pets>.run()
        super <Dogs>.run()
    }
}