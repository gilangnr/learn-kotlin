package app

interface List<T>{
    operator fun get(index: Int): T
}
class ArrayList<T> : List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}

fun <T> run(): T{
    return TODO("Provide the return value")
}



fun main() {
//    val LongArrayList = ArrayList<Long>()
//    val firstLong = LongArrayList.get(0)
    val numberss = (1..100).toList()
    println(numberss.slice(1..10))

}