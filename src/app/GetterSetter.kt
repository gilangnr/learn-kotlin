package app

import data.BigNote
import data.Note

fun main() {
    val note = Note("Belajar Kotlin")

    println(note.title)

    note.title = "Ubah title"

    println(note.title)

    val bigNote = BigNote("belajar kotlin")
    println(bigNote.title)
    println(bigNote.bigTitle)

}