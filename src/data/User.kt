package data

class User(var username: String, var password: String) {
    override fun toString(): String {
        return "data.User with username: ${username}"
    }
}