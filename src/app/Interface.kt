package app

import data.Human

fun main() {
    val human = Human("Gilang")
    println("my name is ${human.name}")
    human.sayHello("Gerry")
    human.go()
    human.move()
}