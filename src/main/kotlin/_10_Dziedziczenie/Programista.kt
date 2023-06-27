package _10_Dziedziczenie

class Programista(
    imie: String,
    nazwisko: String,
    obowiazki: String,
    pensja: Int,
    var jezykProgramowania: String
) : Pracownik(imie, nazwisko, obowiazki, pensja) {

    override var lokalizacja: String = "Zdalnie"

    override fun odmeldujSie() {
        super.odmeldujSie()
        println("Mój język programowania to: $jezykProgramowania")
    }
}