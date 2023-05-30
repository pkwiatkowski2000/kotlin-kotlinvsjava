package _5_Instrukcje_warunkowe

fun main() {
    var liczba = -3
    when (liczba) {
        0 -> println("zero")
        1 -> println("jeden")
        2 -> println("dwa")
        3 -> {
            println("to moja ulubiona liczba")
            println("to jest liczba trzy")
        }
        in 4..9 -> println("liczba jest z przedziału miedzy 4 a 9")
        -1, -2, -3 -> println("liczba ujemna")
        else -> println("Przypadek nie został obsłużony")
    }

    var liczbaSlownie = when (liczba) {
        0 -> "zero"
        1 -> "jeden"
        2 -> "dwa"
        -1, -2, -3 -> "liczba ujemna"
        else -> "nie obsługuję takiej liczby"
    }
    println(liczbaSlownie)

    var a = 5
    var b = 10
    when {
        a > b -> println("a jest większe od b")
        a < b -> println("a jest mniejsze od b")
        else -> println("a jest równe b")
    }
}