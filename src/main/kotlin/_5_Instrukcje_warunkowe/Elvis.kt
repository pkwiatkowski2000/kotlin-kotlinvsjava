package _5_Instrukcje_warunkowe

fun main() {
    var imie: String? = "Łukasz"
    var inicjal: Char

//    if (imie != null) {
//        inicjal = imie.first()
//    } else {
//        inicjal = ' '
//    }

//    inicjal = if (imie != null) {
//        imie.first()
//    } else {
//        ' '
//    }

    inicjal = imie?.first() ?: ' '

    println(inicjal)
}