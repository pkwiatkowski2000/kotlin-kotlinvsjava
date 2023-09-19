package _Zadania_domowe

// 1. Zaimplementuj hierarchie zgodnie z poniższym diagramem.
// Niech:
// - Alkohol będzie interfejsem,
// - Piwo, Wino, Wódka będą klasami abstrakcyjnymi,
// - Dębowe Mocne, Żywiec, Chianti, Prosecco, Żubrówka, Żołądkowa Gorzka będą zwykłymi klasami.
// Całość możesz umieścić w jednym pliku.

    interface Alkohol

    abstract class Piwo : Alkohol
    abstract class Wino : Alkohol
    abstract class Wodka : Alkohol

    class DeboweMocne : Piwo()
    class Zywiec: Piwo()

    class Chianti : Wino()
    class Prosecco : Wino()

    class Zubrowka : Wodka()
    class ZoladkowaGorzka : Wodka()

fun main() {

// 2. Utwórz klasę data Komputer, która będzie składać się z parametrów:
// procesor: Double, pamiec: Int, dysk: Int.
// Następnie utwórz 3 obiekty, takie jak poniżej.
// Wypisz dane komputer1 na ekran oraz sprawdź, czy parametry komputer1 są równe z parametrami komputer2 albo komputer3.
// Wypisz wynik jako true, albo false.
//
// val komputer1 = Komputer(3.2, 8, 256)
// val komputer2 = Komputer(4.0, 16, 512)
// val komputer3 = Komputer(3.2, 8, 256)

    data class Komputer(var procesor: Double, var pamiec: Int, var dysk: Int)

    val komputer1 = Komputer(3.2, 8, 256)
    val komputer2 = Komputer(4.0, 16, 512)
    val komputer3 = Komputer(3.2, 8, 256)

    println(komputer1)
    println(komputer1 == komputer2)
    println(komputer1 == komputer3)

}
// 3. Utwórz klasę object Matematyka, która będzie posiadać funkcje dodawanie, odejmowanie, mnozenie, dzielenie.
// Każda funkcja przyjmuje dwa argumenty i zwraca wynik typu Double.
// Dodatkowo w funkcji dzielenie, jeżeli dzielnik będzie równy zero, to funkcja wypisze na ekran "Nie wolno dzielić przez zero!" oraz zwróci Double.MIN_VALUE.

    object Matematyka {

        fun dodawanie(a: Double, b: Double): Double = a + b

        fun odejmowanie(a: Double, b: Double): Double = a - b

        fun mnozenie(a: Double, b: Double): Double = a * b

        fun dzielenie(a: Double, b: Double): Double {
            if (b == 0.0) {
                println("Nie wolno dzielić przez zero!")
                return Double.MIN_VALUE
            }
            return a / b
        }
    }

fun Matematyka() {
    var a = 9.0
    var b = 3.0
    var wynik: Double

    wynik = Matematyka.dodawanie(a, b)
    println("$a + $b = $wynik")

    wynik = Matematyka.odejmowanie(a, b)
    println("$a - $b = $wynik")

    wynik = Matematyka.mnozenie(a, b)
    println("$a * $b = $wynik")

    wynik = Matematyka.dzielenie(a, b)
    println("$a / $b = $wynik")

}