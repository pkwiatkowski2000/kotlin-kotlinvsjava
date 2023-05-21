package _3_Operatory

fun main() {
    var a = 5
    var b = 10
    var wynik: Boolean

    wynik = a == b
    println("a == b: " + wynik)

    wynik = a != b
    println("a != b: " + wynik)

    wynik = a < b
    println("a < b: " + wynik)

    wynik = a <= b
    println("a <= b: " + wynik)

    wynik = a > b
    println("a > b: " + wynik)

    wynik = a >= b
    println("a >= b: " + wynik)

    var sprawdzZmienna = 3
    wynik = sprawdzZmienna in a..b
    println("3 in a..b: " + wynik)

    wynik = sprawdzZmienna !in a..b
    println("3 !in a..b: " + wynik)
}