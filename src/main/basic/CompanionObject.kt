fun main() {
    Application.runApps("Instagram")
}

class Application(val name: String){
    companion object{
        fun runApps(name:String){
            println("Hello $name")
        }
    }
}

