package app


inline fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}
fun main() {
    printResult(10) { value -> value + value}
    printResult(120) { value -> value + value}

}