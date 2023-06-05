package _Zadania_domowe

fun main() {
// 1. Zlicz ile występuje liczb parzystych w tablicy:
// val tab = arrayOf(5, 3, 10, -6, 0, -3, 2, 33, -22, 50, 42, 99, 100, -101, 200, 4, -1, 1)

    val tab = arrayOf(5, 3, 10, -6, 0, -3, 2, 33, -22, 50, 42, 99, 100, -101, 200, 4, -1, 1)
    var ileParzystych = 0
    for (liczba in tab) {
        if (liczba % 2 == 0) {
            ileParzystych++
        }
    }
    println(ileParzystych)

    println()

// 2. Wypisz od tyłu co trzecią liczbę od 100 do 1, czyli 100, 97, 94, 91, 88, …

    for (i in 100 downTo 1 step 3) {
        print(i)
        print(" ")
    }

    println()

// 3. Napisz algorytm, który posortuje rosnąco tablicę z zadania 1. (sortowanie bąbelkowe)
// W razie potrzeby zapoznaj się z przykładowymi algorytmami sortowania w internecie. Przykładowe: sortowanie bąbelkowe, sortowanie przez wstawianie, sortowanie przez wybieranie.

    println()

    for (i in 0..tab.size - 1) {
        for (j in 0..tab.size - 2) {
            if (tab[j] > tab[j + 1]) {
                val tmp = tab[j]
                tab[j] = tab[j + 1]
                tab[j + 1] = tmp
            }
        }
    }

    for (i in tab) {
        print(i)
        print(" ")
    }
}