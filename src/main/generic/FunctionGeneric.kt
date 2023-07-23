fun main() {
    val product = Product("Valdo")
    product.getFirstProduct("Tango")
    product.getSpecialProduct("Tango", 123456789)
}

class Product(val name: String){

    fun <T> getFirstProduct(firstProduct: T){
        println("Hello $name, first product is $firstProduct")
    }

    fun <T, U>getSpecialProduct(name: T, id: U){
        println("Hello $name, product name is $name and the id is $id")
    }

}
