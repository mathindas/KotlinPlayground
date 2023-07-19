fun main() {
    val consolePrinter = ConsolePrinter()
    val fancyPrinter = FancyPrinter(consolePrinter)
    fancyPrinter.printMessage("This message is printed by FancyPrinter, but delegated to ConsolePrinter.")
}

interface Printer {
    fun printMessage(message: String)
}

class ConsolePrinter : Printer {
    override fun printMessage(message: String) {
        println("ConsolePrinter: $message")
    }
}

class FancyPrinter(private val delegate: Printer) : Printer by delegate


