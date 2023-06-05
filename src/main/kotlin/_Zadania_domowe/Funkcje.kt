package _Zadania_domowe

fun main() {
// 1. Napisz funkcję o nazwie pobierzNastepnaLiczbeParzysta, która przyjmuje liczbę całkowitą i jako wynik zwraca następna z kolei liczbę parzystą.
// Wywołaj ją w funkcji main().

//
// Na przykład
//
// wejście: 11
// wyjście: 12
//
// wejście: 20
// wyjście: 22

    fun pobierzNastepnaLiczbeParzysta(liczba: Int): Int = if ((liczba + 1) % 2 == 0) {
        liczba + 1
    } else {
        liczba + 2
    }
    println(pobierzNastepnaLiczbeParzysta(20))

    println()

// 2. Napisz funkcję o nazwie czyPrzestepny, która przyjmuje rok i jako wynik zwraca:
// true - jeżeli rok jest przestępny,
// false - jeżeli rok nie jest przestępny.
// Rok jest przestępny, jeżeli jest podzielny przez 4 oraz nie jest podzielny przez 100. Jest także przestępny, kiedy jest podzielny przez 400.
//
// Na przykład
//
// wejście: 2000
// - jest podzielny przez 4, ale również jest podzielny przez 100, więc pierwszy warunek nie jest spełniony,
// - jest podzielny przez 400, zatem drugi warunek jest spełniony
// wynik: true
//
// wejście: 2024
// - jest podzielny przez 4 i nie jest podzielny przez 100, więc pierwszy warunek jest spełniony
// wynik: true
//
// wejście: 2077
// - nie jest podzielny przez 4, więc pierwszy warunek nie jest spełniony,
// - nie jest podzielny przez 400, więc drugi warunek też nie jest spełniony
// wynik: false
//
// wejście: 2100
// - jest podzielny przez 4, ale również jest podzielny przez 100, więc pierwszy warunek nie jest spełniony,
// - nie jest podzielny przez 400, zatem drugi warunek też nie jest spełniony
// wynik: false
//
// Spróbuj później zapisać funkcję jako single expression function.

    fun czyPrzestepny(rok: Int): Boolean = (rok % 4 == 0 && rok % 100 != 0) || (rok % 400 == 0)

    println(czyPrzestepny(2100))

    println()

// 3. Napisz funkcję o nazwie wyswietlLiczby, która przyjmuje dwie liczby start, koniec i wyświetla na ekranie zakres liczb od start do koniec oddzielony spacją.
// Jeżeli przy wywołaniu funkcji argument start nie zostanie podany to niech posiada wartość domyślną równą 1. Przetestuj rozwiązanie.
//
// Na przykład
// wejście: 5, 10
// wyjście: 5 6 7 8 9 10

    fun wyswietlLiczby(start: Int = 1, koniec: Int) {
        for (i in start..koniec) {
            print("$i ")
        }
    }

    wyswietlLiczby(koniec = 10)
}