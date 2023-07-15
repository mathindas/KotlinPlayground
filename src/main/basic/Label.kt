fun main() {
    name("valdo") go@{
        if(it == "valdo"){
            return@go
        }
    }

    loopA@ for (i in 1..10){
        loopB@ for (j in 1..10){
            println(i*j)
            if(j%2 == 0){
                break@loopB
            }else{
                continue@loopB
            }
        }
    }
}

fun name(name: String, param: (String) -> Unit): Unit = param(name)