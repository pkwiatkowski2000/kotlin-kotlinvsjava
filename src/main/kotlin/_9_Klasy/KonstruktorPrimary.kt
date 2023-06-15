package _9_Klasy


class Osoba(var imie: String? = null, var nazwisko: String? = null) {


//    var nazwa: String? = null
//
//    init {
//        nazwa = "$imie $nazwisko"

    fun przedstawSie() {
        println("Jestem $imie $nazwisko")
    }
}


fun main() {
    var osoba = Osoba("Adam", "Nowak")
    osoba.przedstawSie()
    osoba.imie = "Jan"
    osoba.nazwisko = "Kowalski"
    osoba.przedstawSie()
}