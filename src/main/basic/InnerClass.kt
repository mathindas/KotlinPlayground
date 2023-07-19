fun main() {
    val house = House()
    house.Pool().swim()
}

class House{
    inner class Pool{
        fun swim(){
            println("Swimming")
        }
    }
}

