package _9_Klasy.Model

class User constructor(var login: String, var password: String) {
    // JAVA: public / protected / private / brak modyfikatora
    public var polePublic: String? = null // wszędzie
    protected var poleProtected: String? = null // dziedziczenie (open)
    private var polePrivate: String? = null // dana klasa
    var poleBezModyfikatora: String? = null // public
    internal var poleInternal: String? = null // moduł
}

fun main() {
    var user = User("witcher1", "123456")
}