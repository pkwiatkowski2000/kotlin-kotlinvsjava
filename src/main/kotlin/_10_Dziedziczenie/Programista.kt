package _10_Dziedziczenie

class Programista(
    imie: String,
    nazwisko: String,
    obowiazki: String,
    pensja: Int,
    var jezykProgramowania: String
    ) : Pracownik(imie, nazwisko, obowiazki, pensja) {

    }