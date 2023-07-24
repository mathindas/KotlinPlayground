fun main() {
    val invariantString = Invariant("Name")
//    val invariantAny : Invariant<Any> = invariantString       -it cant because of invariant

    val covariantString = Covariant("Name")
    val covariantAny : Covariant<Any> = covariantString
    println(covariantAny)

    val contravariant1 : Contravariant<Any> = Contravariant()
    val contravariant2 : Contravariant<String> = contravariant1
    contravariant2.data("Valdo")
}

class Invariant<T>(val name: T)

class Covariant<out T>(val name:T){
    fun data():T{
        return name
    }
}

class Contravariant<in T>{
    fun data(name : T){
        return println("Hi $name")
    }
}