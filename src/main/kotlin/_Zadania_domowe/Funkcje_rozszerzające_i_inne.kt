package _Zadania_domowe

fun main() {
// 1. Napisz funkcję rozszerzającą (extension function) o nazwie ostatniaCyfra, która rozszerza liczby całkowite Int
// o możliwość zwrócenia ostatniej cyfry z tej liczby.
//
// Na przykład:
//
// wejście: 12345
// wyjście: 5
//
// wejście: 9
// wyjście: 9

    fun Int.ostatniaCyfra(): Int {
        return this % 10
    }

    val liczba1 = 12345
    val ostatniaCyfra1 = liczba1.ostatniaCyfra()
    println(ostatniaCyfra1)

    val liczba2 = 9
    val ostatniaCyfra2 = liczba2.ostatniaCyfra()
    println(ostatniaCyfra2)

// 2. Dla poniższej klasy CiagZnakow przeciąż operator negacji !. Niech ta funkcja zwraca CiagZnakow.
// Jeżeli tekst:
// - będzie posiadał tylko słowo "tak", to zamień go na "nie"
// - będzie posiadał tylko słowo "nie", to zamień go na "tak"
// - będzie rozpoczynał się słowem "nie " (ze spacją), to usuń to słowo
// - dla reszty przypadków dopisuj zawsze na początku "nie " (ze spacją).
//
// data class CiagZnakow(var tekst: String)
// Dla uproszczenia załóżmy, że wszystkie wyrazy posiadają tylko małe litery.

    data class CiagZnakow(var tekst: String) {
        operator fun not(): CiagZnakow {
            return when {
                tekst == "tak" -> CiagZnakow("nie")
                tekst == "nie" -> CiagZnakow("tak")
                tekst.startsWith("nie ") -> CiagZnakow(tekst.substring(4))
                else -> CiagZnakow("nie $tekst")
            }
        }
    }

    val tekst1 = CiagZnakow("tak")
    val wynik1 = !tekst1
    println(wynik1)

    val tekst2 = CiagZnakow("nie chce mi się uczyć")
    val wynik2 = !tekst2
    println(wynik2)

    val tekst3 = CiagZnakow("zjem na kolację fast fooda")
    val wynik3 = !tekst3
    println(wynik3)

// 2. a)* Jako rozszerzenie spróbuj dodać przeciążenie operatora dla istniejącej klasy String, który ma działać tak samo, jak powyżej.

    operator fun String.not(): String {
        return when {
            this == "tak" -> "nie"
            this == "nie" -> "tak"
            this.startsWith("nie ") -> this.substring(4)
            else -> "nie $this"
        }
    }

    val tekstString1 = "tak"
    val wynikString1 = !tekstString1
    println(wynikString1)

    val tekstString2 = "nie chce mi się uczyć"
    val wynikString2 = !tekstString2
    println(wynikString2)

    val tekstString3 = "zjem na kolację fast fooda"
    val wynikString3 = !tekstString3
    println(wynikString3)

// 3. Napisz funkcję infix o nazwie polacz, która łączy ze sobą elementy dwóch tablica IntArray i zwraca jako nowa, połączona tablica.

    infix fun IntArray.polacz(innaTablica: IntArray): IntArray {
        val nowaTablica = IntArray(this.size + innaTablica.size)
        System.arraycopy(this, 0, nowaTablica, 0, this.size)
        System.arraycopy(innaTablica, 0, nowaTablica, this.size, innaTablica.size)
        return nowaTablica
    }

    val pierwszaTablica = intArrayOf(1, 2, 3)
    val drugaTablica = intArrayOf(4, 5, 6)

    val polaczonaTablica = pierwszaTablica polacz drugaTablica

    println(polaczonaTablica.contentToString())
}