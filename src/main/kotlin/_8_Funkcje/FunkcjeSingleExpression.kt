package _8_Funkcje

fun main() {


fun dodawanie1(a: Int, b: Int): Int = a + b

fun wypiszNaEkran1(tekst: String = "Nie podałeś tekstu!") = println(tekst)


fun czyOsobaPelnoletnia(wiek: Int): Boolean = if (wiek >= 18) true else false
}