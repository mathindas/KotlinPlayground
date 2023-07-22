fun main() {
    val human = Human("Alice", 20)

    letExample(human)
    runExample(human)
    withExample(human)
    applyExample(human)
    alsoExample(human)
}

data class Human(var name: String, var age: Int)

fun letExample(human: Human?) {
    human?.let {
        println("Name: ${it.name}, Age: ${it.age}")
    } ?: run {
        println("Person is null.")
    }
}

fun runExample(human: Human?) {
    val result = human?.run {
        age += 5
        "In five years, ${name} will be ${age} years old."
    }
    println(result ?: "Person is null.")
}

fun withExample(human: Human?) {
    with(human) {
        this?.age = 30
        println("Age set to 30.")
    }
}

fun applyExample(human: Human?) {
    human?.apply {
        name = "John"
        age = 25
    }
    println("Name: ${human?.name}, Age: ${human?.age}")
}

fun alsoExample(human: Human?) {
    val modifiedPerson = human?.also {
        println("Modifying ${it.name}'s age.")
        it.age = 40
    }
    println("Name: ${modifiedPerson?.name}, Age: ${modifiedPerson?.age}")
}




