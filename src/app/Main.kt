package app

import data.Laptop
import data.User


fun printObject(any: Any){
    when (any) {
        is Laptop -> println("data.Laptop brand: ${any.name}")
        else -> println(any)
    }
}

fun printString(any: Any) {
    val value = any as? String
    println(value)
}

class Company(val name: String){
    override fun equals(other: Any?): Boolean {
        return when(other){
            is Company -> other.name == this.name
            else -> false
        }
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}
fun main() {
    printObject("Gilang")
    printObject(1)
    printObject(Laptop("Acer"))
    printString("Anjay")
    printString(1)
    val user = User("Gilang", "Password")
    println(user)
    val company1 = Company("A")
    val company2 = Company("B")
    println(company2 == company1)
    println(company1 == company1)

    println(company1.hashCode())
    println(company2.hashCode())

    println(company2.hashCode() == company1.hashCode())
}