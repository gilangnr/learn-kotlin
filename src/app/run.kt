package app

fun main() {
    val text = "hello"
    val result = text.run {
        val from = this
        val to = this.replace("hello", "Kotlin")
        "replace text from $from to $to"
    }
    val builder = StringBuilder().apply {
        append("Hello ")
        append("Kotlin ")
    }


    println(builder.toString())

    println(result)
}