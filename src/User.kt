class User {

    fun userData(name: String, age: Int) : String{
        return name + age
    }

    val user: (String, Int) -> String = ::userData
}