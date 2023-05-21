package _3_Operatory

fun main() {
    var wiek = 40
    // 18 <= wiek <= 70
    println(18 <= wiek && wiek <= 70)
    println(wiek in 18..70)

    println(wiek <= 30 || 65 <= wiek)

    var prawda = true
    println("!prawda: " + !prawda)

    var falsz = false
    println("!falsz: " + !falsz)

    //
    var czyLadny: Boolean = true
    var czyMadry: Boolean = true
    var wynik = czyLadny and czyMadry // &&
    wynik = czyLadny or czyMadry // ||
    wynik = (18 <= wiek) and (wiek <= 70)
}