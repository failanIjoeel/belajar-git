fun main(){
    val user = setUser("Failan", "Gambar", 16)
    println(user)
}
fun setUser(name: String, hobby: String, age: Int) = "My name is $name, I like $hobby and im $age years old"