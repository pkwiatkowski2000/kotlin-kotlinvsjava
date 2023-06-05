package _8_Funkcje

import kotlin.math.sqrt

fun main() {
    val wynikDodawania = dodawanie(b = 10, a = 5)
    println(wynikDodawania)
    wypiszNaEkran("Tekst z funkcji")
    wypiszNaEkran()

    var predkosc = obliczPredkoscSpadkuSwobodnego(h = 2.0, g = 9.81)
    println("Prędkość: $predkosc")

    narysujTrojkat()
}

fun obliczPredkoscSpadkuSwobodnego(h: Double, g: Double = 10.0): Double {
    return sqrt(2*h*g)
}

fun narysujTrojkat(poziomy: Int = 5) {
    for (i in 1..poziomy) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}
    /*
int dodawanie(int a, int b) {
    return a + b
}

void wypiszNaEkran(String tekst) {
    System.out.println(tekst);
}
*/

fun dodawanie(a: Int, b: Int): Int {
    return a + b
}

fun wypiszNaEkran(tekst: String = "Nie podałeś tekstu!") {
    println(tekst)
}