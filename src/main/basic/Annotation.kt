fun main() {
    val myclass = myClass("Test")
    val exampleCLass = ExampleClass("Example", 5)
    println(myclass.getName())
    println(exampleCLass.name)
}

@Target(AnnotationTarget.CLASS, AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER)
@Retention(AnnotationRetention.RUNTIME)
@MustBeDocumented
annotation class Valdo(val name: String)

@Target(AnnotationTarget.CLASS, AnnotationTarget.FIELD, AnnotationTarget.VALUE_PARAMETER)
annotation class ThisIsAnnotationClass

@Valdo(name = "Rivaldo")
class myClass(val className: String){
    fun getName():String = "Name $className"
}

class ExampleClass(@field:ThisIsAnnotationClass val name :String, @field:ThisIsAnnotationClass val age : Int)