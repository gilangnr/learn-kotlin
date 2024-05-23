package data

class UserA(val name: String, val age: Int){
    override fun toString(): String {
        return "$name $age"
    }
}

data class DataUser(val name: String, val age: Int){
    fun intro(){
        println("Halo guys namaku $name, umurku $age tahun")
    }
}