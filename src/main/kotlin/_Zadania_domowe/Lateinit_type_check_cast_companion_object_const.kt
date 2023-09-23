package _Zadania_domowe

fun main() {
// 1.Jak inaczej możemy zapisać zmienną b, jeżeli nie chcemy, aby była nullowa?
//
// class A {
//     var b: String? = null

    lateinit var b: String

// 2. Uzupełnij funkcję sprawdz, która w zależności od typu przekazanego argumentu wykona odpowiednie akcje:
//
// -dla Int wypisze czy liczba całkowita jest podzielna przez 2
// -dla String wypisze długość ciągu znaków
// -dla DoubleArray wypisz sumę wszystkich elementów w tablicy
// -dla Char wypisze po prostu ten znak na ekran

    fun sprawdz(zmienna: Any) {
        when (zmienna) {
            is Int -> println("Czy liczba $zmienna jest podzielna przez 2: ${zmienna % 2 == 0}")
            is String -> println("Ciąg znaków \"$zmienna\" jest długości ${zmienna.length}")
            is DoubleArray -> println("Suma liczb tablicy ${zmienna.contentToString()} wynosi ${zmienna.sum()}")
            is Char -> println(zmienna)
        }
    }

    sprawdz(5)
    sprawdz("Hello world")
    sprawdz(doubleArrayOf(1.1, 2.2, 5.5))
    sprawdz('A')
    sprawdz(234.55f)
}

// 3. Utwórz klasę Kolo oraz konstruktor primary, który przyjmuje promień koła r: Double.
// Dodaj funkcje, które będą obliczać obwód i pole koła oraz zmienną statyczną PI, do której dostęp będzie możliwy bez konieczności tworzenia obiektu.
// Wykorzystaj PI do powyższych obliczeń.
// PI = 3.141592653589793

class Kolo(var r: Double) {

    fun obwod(): Double = 2 * PI * r

    fun pole(): Double = PI * r * r

    companion object {
        const val PI = 3.141592653589793
    }
}

fun Sprawdzenie() {
    Kolo.PI
}