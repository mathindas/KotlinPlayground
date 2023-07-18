fun main() {
    val phone = Phone("Apple", "iPhone 14")
    println(phone.upperBrand)
}

val Phone.upperBrand : String
    get() = this.brand.uppercase()

class Phone(val brand: String, val type: String){
    init{
        println("This is Phone Class")
    }
}