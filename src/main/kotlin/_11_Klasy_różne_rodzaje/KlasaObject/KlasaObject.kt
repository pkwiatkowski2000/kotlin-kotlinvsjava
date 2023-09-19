package _11_Klasy_różne_rodzaje.KlasaObject

fun main() {
    // singleton patter
    UstawieniaAplikacji.nazwa = "Nazwa z maina"
    println(UstawieniaAplikacji.nazwa)

    val ekran = Ekran()
    ekran.zmienUstawienia()

    println(UstawieniaAplikacji.nazwa)
}

class Ekran {
    fun zmienUstawienia() {
        UstawieniaAplikacji.nazwa = "Ekran zmienił ustawienia"
    }
}