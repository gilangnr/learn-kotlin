package data

class Note(title: String) {

    var title: String = title
        get() {
            return field
        }
        set(value) {
            if (value.isNotBlank()){
                field = value
            }
        }
}

class BigNote(val title: String) {
    val bigTitle: String
        get() = title.toUpperCase()
}