import kotlin.random.Random

fun main() {
    val score = Random.nextInt(1,100)
    println("Score : $score")
    when{
        score > 80 -> println("A")
        score > 60 -> println("B")
        score > 40 -> println("C")
        score > 20 -> println("D")
        score > 0 -> println("E")
    }
}