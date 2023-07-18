fun main() {
    val triangle = Triangle(6.0, 8.0)
    val square = Square(5.0)

    println("Luas Segitiga: ${calculateArea(triangle)}")
    println("Luas Kotak: ${calculateArea(square)}")
}

sealed class Shape
class Triangle(val pedestal: Double, val height: Double) : Shape()
class Square(val side: Double) : Shape()

fun calculateArea(shape: Shape): Double {
    return when (shape) {
        is Triangle -> 0.5 * shape.pedestal * shape.height
        is Square -> shape.side * shape.side
        else -> 0.0
    }
}

