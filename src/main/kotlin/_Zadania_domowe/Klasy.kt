package _Zadania_domowe

fun main() {
// 1. Napisz klasę Prostokat, która w konstruktorze przyjmuje argumenty a i b, będącymi długościami boków prostokąta.
// Napisz funkcję o nazwie obliczPole, która oblicza pole prostokąta (wzór: a*b).

    class Prostokat(var a: Int, var b: Int) {
        fun obliczPole(): Int = a * b
    }

    var prostokat = Prostokat(3, 5)
    println(prostokat.obliczPole())

// 2. Napisz klasę Pogoda, która w konstruktorze primary przyjmuję argumenty miasto oraz temperatura,
// a w konstruktorze secondary dodatkowy argument wiatr.

    class Pogoda(var miasto: String, var temperatura: Double) {
        var wiatr: Double? = null

        constructor(miasto: String, temperatura: Double, wiatr: Double) : this(miasto, temperatura) {
            this.wiatr = wiatr
        }
    }

    var pogodaWarszawa = Pogoda("Warszawa", 22.0)
    var pogodaTorun = Pogoda("Toruń", 20.4, 5.0)

// 3. Mówi się, że przed osiemnastką człowiek dodaje sobie lat, a później zaczyna odejmować.
// Stąd napisz klasę Czlowiek, dla której napiszesz własny setter dla pola wiek.
// Jeżeli ustawiany wiek będzie poniżej 18, to zawsze ustaw wartość 18,
// jeżeli będzie między 18 a 30, to ustaw wartość taką samą jak podana, a powyżej 30 odejmij 5 od podanej wartości.
//
// Na przykład
//
// wejście: 10
// wyjście: 18
//
// wejście: 25
// wyjście: 25
//
// wejście: 55
// wyjście: 50

    class Czlowiek {
        var wiek: Int = 0
            set(value) {
                field = when {
                    value < 18 -> 18
                    value in 18..30 -> value
                    else -> value - 5
                }
            }
    }

    var czlowiek = Czlowiek()
    czlowiek.wiek = 15
    println(czlowiek.wiek)

    czlowiek.wiek = 25
    println(czlowiek.wiek)

    czlowiek.wiek = 44
    println(czlowiek.wiek)
}