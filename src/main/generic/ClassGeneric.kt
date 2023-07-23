fun main() {
    val genericData = Datas("Valdo", 100)
    println(genericData.getFirst())
    println(genericData.getSecond())
    genericData.printData()

    val genericData2 = Datas(100, 100.00)
    println(genericData2.firstData)
    println(genericData2.secondData)
    genericData2.printData()
}

class Datas<T, U>(val firstData : T, val secondData : U){

    fun getFirst():T{
        return firstData
    }

    fun getSecond():U{
        return secondData
    }

    fun printData(){
        println("Datas is $firstData & $secondData")
    }
}
