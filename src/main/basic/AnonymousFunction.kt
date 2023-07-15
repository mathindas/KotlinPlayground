fun main() {

    val anonymouseFun = fun (value:String) : String{
        if(value=="") return "Blank"
        return value.uppercase()
    }
    println(anonymouseFun("valdo"))
    println(anonymouseFun(""))
}