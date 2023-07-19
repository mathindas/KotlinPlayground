fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE
    val all: Array<Gender> = Gender.values()

    println(man)
    println(woman)
    println(all[0])
    println(all[1])

    man.printDesc()
    woman.printDesc()
}

enum class Gender(val desc: String){
    MALE("This is Male"),
    FEMALE("This is Female");

    fun printDesc(){
        println(desc)
    }
}

