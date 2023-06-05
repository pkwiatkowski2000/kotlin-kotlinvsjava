package _7_String

fun main() {
    var tekst1 = "Tekst1"
    var tekst2 = "Tekst2"
    var testCały = tekst1 + tekst2
    println(testCały)

    var tekstSzablon = "$tekst1$tekst2"
    println(tekstSzablon)

    var liczba = 999
    println("Liczba: $liczba")

    println("Długość $tekst1: ${tekst1.length}")
}