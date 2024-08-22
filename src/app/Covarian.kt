package app

class Covarian<out T>(val data: T) {

    fun sayHai(): T {
        return data
    }

}

fun main(){
    val covarianString = Covarian<String>("Gilang")
    val covarianAny: Covarian<Any> = covarianString
    covarianAny.data
}