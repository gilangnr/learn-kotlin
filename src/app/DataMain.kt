package app
import data.UserA
import data.DataUser
fun main() {
    val user = UserA("gilang", 20)
    val dataUser = DataUser("gilang", 20)
    val dataUser2 = DataUser("gilang", 10)
    val dataUser3 = DataUser("asep", 17)
    val dataUser4 = dataUser3.copy()
    val dataUser5 = dataUser.copy(age = 30)

    dataUser.intro()
    val name = dataUser.component2()
    val (nama, umur) = dataUser3



    println(nama + umur)

}