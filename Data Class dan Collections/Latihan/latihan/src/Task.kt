fun main() {

    // TODO 1
    val user = mapOf<String, String>(
            "Name" to "John",
            "Age" to "23",
            "Address" to "St. Petersburg")

    // TODO 2
    val name = user.getValue("Name")
    val age = user.getValue("Age")
    val address = user.getValue("Address")

    // TODO 3
    fun cetak(name: String, age: String, address: String) = """User
        |Name: $name
        |Age: $age
        |Address: $address
    """.trimMargin()

    println(cetak(name, age, address))
}
