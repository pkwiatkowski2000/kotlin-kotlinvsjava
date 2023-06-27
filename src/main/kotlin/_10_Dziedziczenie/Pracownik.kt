package _10_Dziedziczenie

open class Pracownik(var imie: String, var nazwisko: String, var obowiazki: String, var pensja: Int) {

    open var lokalizacja: String = "Warszawa"

    open fun odmeldujSie() {
        println("Jestem $imie $nazwisko. Moje obowiązki to $obowiazki")
    }
}