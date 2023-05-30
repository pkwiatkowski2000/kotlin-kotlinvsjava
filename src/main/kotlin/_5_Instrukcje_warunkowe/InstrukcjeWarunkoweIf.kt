package _5_Instrukcje_warunkowe

fun main() {
    var liczba = 100

    if (liczba > 0) {
        println("Liczba dodatnia")
    } else if (liczba < 0) {
        println("Liczba ujemna")
    } else {
        println("Liczba jest zerem")
    }

    var czyParzysta: Boolean
//    if (liczba % 2 == 0) {
//        czyParzysta = true
//    } else {
//        czyParzysta = false
//    }

    if (liczba % 2 == 0) czyParzysta = true else czyParzysta = false

    czyParzysta = if (liczba % 2 == 0) true else false

    czyParzysta = if (liczba % 2 == 0) {
        println("Liczba parzysta")
        true
    } else {
        println("Liczba nieparzysta")
        false
    }

    println("Czy parzysta: " + czyParzysta)
}