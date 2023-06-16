package _9_Klasy

class Osoba3(var imie3: String, var nazwisko3: String) {

    var wiek2: Int? = null
    var adres: String? = null

    constructor(imie3: String, nazwisko3: String, wiek2: Int) : this(imie3, nazwisko3) {
        this.wiek2 = wiek2
    }

    constructor(imie3: String, nazwisko3: String, wiek2: Int, adres: String) : this(imie3, nazwisko3, wiek2) {
        this.adres = adres
    }
}