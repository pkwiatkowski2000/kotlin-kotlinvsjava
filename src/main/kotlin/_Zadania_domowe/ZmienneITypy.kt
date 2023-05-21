package _Zadania_domowe

// 1. Zacznijmy od najbardziej popularnego programu "Witaj Świecie". Utwórz funkcję main i wypisz na ekran tekst "Witaj Świecie".

fun main() {
    println("Witaj Świecie")

// 2. Wklej poniższy kod do środowiska i popraw go, aby program zaczął uruchamiać się:

    var liczba: Int = 100
    liczba = -5
    println(liczba)

// 3. Utwórz dwie, nullowalne zmienne a i b oraz przypisz do nich liczby zmiennoprzecinkowe.
// Następnie zamień wartości tych zmiennych między sobą, tzn. niech a przyjmie wartość b, b przyjmie wartość a.
// Ostatecznie za pomocą wywołania odpowiedniej funkcji skonwertuj te wartości na liczby całkowite.
//
//Przykład
//wejście: a = 12.54, b = 33.77
//wyjście: a = 33, b = 12

    var a: Double? = 12.54
    var b: Double? = 33.77

    var tmp: Double? = a
    a = b
    b = tmp

    println(a?.toInt())
    println(b?.toInt())
}




