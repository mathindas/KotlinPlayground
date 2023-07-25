fun main() {
    val myBox = Box<Drawable>()

    val pencil = Pencil()
    val crayon = Crayon()
    val candy = Candy()

    myBox.addItem(pencil)
    myBox.addItem(crayon)
//    myBox.addItem(candy) // it cant because its not Drawable

    myBox.drawFromBox()
    myBox.drawFromBox()
}

interface Drawable {
    fun draw()
}

class Box<T : Drawable> {
    private val items = mutableListOf<T>()

    fun addItem(item: T) {
        items.add(item)
    }

    fun drawFromBox() {
        if (items.isEmpty()) {
            println("Its empty Box")
        } else {
            val item = items.removeAt(0)
            item.draw()
        }
    }
}


class Pencil : Drawable {
    override fun draw() {
        println("Draw with pencil.")
    }
}

class Crayon : Drawable {
    override fun draw() {
        println("Draw with crayon")
    }
}

class Candy {}
