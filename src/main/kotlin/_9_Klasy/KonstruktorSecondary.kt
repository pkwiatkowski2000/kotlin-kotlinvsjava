package _9_Klasy

class Osoba2 {

    var imie2: String? = null
    var nazwisko2: String? = null
    var wiek: Int? = null

    constructor(imie2: String?, nazwisko2: String?) {
        this.imie2 = imie2
        this.nazwisko2 = nazwisko2
    }

    constructor(imie2: String?, nazwisko2: String?, wiek: Int?) : this(imie2, nazwisko2) {
        this.wiek = wiek
    }

    fun przedstawSie2() {
        println("Jestem $imie2 $nazwisko2")
    }
}

fun main() {
    var osoba2 = Osoba2("Adam", "Nowak", 30)
    osoba2.przedstawSie2()
    osoba2.imie2 = "Jan"
    osoba2.nazwisko2 = "Kowalski"
    osoba2.przedstawSie2()
}