package app

abstract class Vehicle(wheel: Int)
class Car(speed: Int) : Vehicle(4)
class Motor(speed: Int): Vehicle(2)

fun main() {
    val car = Car(200)
    val motor = Motor(100)
    var vehicle: Vehicle = car
    vehicle = motor
}
