package _Zadania_domowe

fun main() {
// 1. Podaj a, b i c. Napisz program, który wypisze większą liczbą.

    var a = 10
    var b = 100
    var c = 30
    var max = if (a > b) a else b
    max = if (max > c) max else c
    println(max)

    println()

// 2. Napisz program, który sprawdzi dla powyższych zmiennych czy dowolna suma a+b, a+c albo b+c daje wyniki równy 10.
// Na przykład:
// dla a=4, b=5, c=6 wypisz true, suma a+c daje 10,
// dla a=1, b=5, c=10 wypisz false, bo żadna kombinacja nie daje 10.

    if (a + b == 10 || a + c == 10 || b + c == 10) {
        println("true")
    } else {
        println("false")
    }

    when (10) {
        a + b, a + c, b + c -> println("true")
        else -> println("false")
    }

    println()

// 3. Do zmiennej "numerMiesiaca" przypisz liczbę. Wypisz nazwę miesiąca odpowiadającego tej liczbie. Następnie wypisz jaka to pora roku.

    var numerMiesiaca = 3
    var nazwaMiesiaca = when (numerMiesiaca) {
        1 -> "Styczeń"
        2 -> "Luty"
        3 -> "Marzec"
        4 -> "Kwiecień"
        5 -> "Maj"
        6 -> "Czerwiec"
        7 -> "Lipiec"
        8 -> "Sierpień"
        9 -> "Wrzesień"
        10 -> "Październik"
        11 -> "Listopad"
        12 -> "Grudzień"
        else -> "Nieodpowiednia liczba"
    }

    var poraRoku = when (numerMiesiaca) {
        in 3..5 -> "Wiosna"
        in 6..8 -> "Lato"
        in 9..11 -> "Jesień"
        in 1..2, 12 -> "Zima"
        else -> "Nieodpowiednia liczba"
    }

    println(nazwaMiesiaca)
    println(poraRoku)
}

