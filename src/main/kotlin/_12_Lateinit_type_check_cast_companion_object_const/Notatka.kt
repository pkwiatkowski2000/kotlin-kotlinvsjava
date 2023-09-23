package _12_Lateinit_type_check_cast_companion_object_const

class Notatka {

//    Można korzystać w ciele klasy
//    Z var
//    Bez własnych getterów i setterów
//    Nie może być nullem
//    Nie może być podstawowym typem (Int, Double, itd.)

    lateinit var tekst: String
        private set

    fun zapisz(informacja: String) {
        tekst = informacja
    }
}

fun main() {
    var notatka = Notatka()
    // notatka.zapisz("Notatka z kursu: wiem do czego służy lateinit")
    println(notatka.tekst)

}