fun main() {
    val phone = SmartPhone()
    phone.showBrand()
    println(phone.brand)
}

class SmartPhone{
    lateinit var brand : String

    fun showBrand(){
        brand = "iPhone"
    }
}

