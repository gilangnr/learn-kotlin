package app

import data.MyData

fun main(){
    val myData = MyData("Gilang", 1)
    val data2 = MyData(10, 1)

    myData.printData()
    data2.printData()
}