class Client() {
    var token: String? = null


    fun connect() = println("connected!")
    fun authenticate() = println("authenticated!")
    fun getData(): String = "Mock data"
}