package _9_Klasy

class Osoba4(var imie: String? = null, var nazwisko: String? = null) {

    var nazwa: String? = null
        get() {
            return "$imie $nazwisko = wypisano z gettera"
        }
        private set

    var budzet: Double = 0.0
        set(wartosc) {
            field += wartosc
        }

    fun przedstawSie() {
        println("Jestem $imie $nazwisko")
    }
}

fun main() {
    var osoba = Osoba4("Jan", "Kowalski")
    println(osoba.nazwa)
//    osoba.nazwa = "Nikt"

    osoba.budzet = 1000.0
    osoba.budzet = 2000.0
    println(osoba.budzet)
}