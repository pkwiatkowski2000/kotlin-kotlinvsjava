package _11_Klasy_różne_rodzaje.KlasaData

fun main() {
    val osoba1 = Osoba("Jan", "Kowalski")
    val osoba2 = Osoba("Jan", "Kowalski")

    println(osoba1)
    println(osoba1 ==osoba2)
}

data class Osoba(val imie: String, val nazwisko: String)