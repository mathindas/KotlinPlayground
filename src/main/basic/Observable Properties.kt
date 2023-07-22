import kotlin.properties.Delegates

fun main() {
    val sensor = TemperatureSensor()
    sensor.temperature = 1
    sensor.temperature = 2
    sensor.temperature = 3
}
class TemperatureSensor {
    var temperature: Int by Delegates.observable(0) { _, oldValue, newValue ->
        println("Temperature changed: $oldValue°C -> $newValue°C")
    }
}


