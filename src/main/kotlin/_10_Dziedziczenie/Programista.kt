package _10_Dziedziczenie

class Programista : Pracownik {
    var jezykProgramowania: String? = null

    constructor(
        imie: String,
        nazwisko: String,
        obowiazki: String,
        pensja: Int,
        jezykProgramowania: String
    ) : super(imie, nazwisko, obowiazki, pensja) {
        this.jezykProgramowania = jezykProgramowania
    }
}