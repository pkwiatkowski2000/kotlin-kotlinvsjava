package _9_Klasy

class Osoba {
    var imie: String? = null
    var nazwisko: String? = null

    fun przedstawSie() {
        println("Jestem $imie $nazwisko")
    }
}

fun main() {
    var osoba = Osoba()
    osoba.imie = "Jan"
    osoba.nazwisko = "Kowalski"
    osoba.przedstawSie()
}