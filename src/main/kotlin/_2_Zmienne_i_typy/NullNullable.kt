package _2_Zmienne_i_typy

fun main() {
    var zmiennaNullowa: Int? = null //null safety
    zmiennaNullowa = 5
    zmiennaNullowa = null

    println(zmiennaNullowa?.minus(2))

}