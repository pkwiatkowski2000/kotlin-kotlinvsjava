package _Zadania_domowe

fun main() {
// 1. Zamień poniższe wyrażenie !(x && y) || z na odpowiednik w kotlinie używając "and", "or".

//val x = false
//val y = true
//val z = false
//val wynik = !(x && y) || z
//println(wynik)

//Przed uruchomieniem programu przeanalizuj jaką wartość ujrzymy po wyświetleniu zmiennej wynik?

    val x = false
    val y = true
    val z = false
//    val wynik = !(x && y) || z
//    println(wynik)

    val wynik = !(x and y) or z // !(false and true) or false
    println(wynik)//

// 2. Na podstawie dotychczasowej wiedzy, zapisz krótszym sposobem wyrażenie wiek >= 18 AND wiek <= 70

    var wiek = 30
    var rezultat = (wiek in 18..70)
    println(rezultat)

//3. Wyobraź sobie, że zamierzasz kupić samochód. Chcesz napisać program, który wspomoże Ciebie w tej decyzji. Poniżej założenia:
// - musisz mieć wystarczającą ilość pieniędzy
// - wystarczy, że będzie koloru czerwonego albo nie będzie to Volkswagen

//Napisz odpowiednie wyrażenie. Uzupełnił poniższe zmienne odpowiednimi wartościami, aby wyrażenie było prawdziwe:

//val mamPieniadze = ...
//val czyCzerwony = ...
//val czyVolkswagen = ...
//// napisz wyrażenie ...

    val mamPieniadze: Boolean = true
    val czyCzerwony: Boolean = true
    val czyVolkswagen: Boolean = false
    val czyKupic = mamPieniadze && (czyCzerwony || !czyVolkswagen)
    println(czyKupic)
}
