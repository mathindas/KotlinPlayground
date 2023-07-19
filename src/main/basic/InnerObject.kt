fun main() {
    Apps.Utils.runApps("Whatsapp")
}

class Apps{
    object Utils{
        fun runApps(name:String){
            println("Hello $name")
        }
    }
}

