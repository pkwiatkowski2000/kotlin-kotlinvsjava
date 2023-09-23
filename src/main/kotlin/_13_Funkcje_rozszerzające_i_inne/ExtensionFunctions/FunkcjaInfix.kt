package _13_Funkcje_rozszerzające_i_inne.ExtensionFunctions

fun main() {
    5 + 6
    5.plus(6)
    5 dodaj 6

    val punkt1 = Punkt(1, 5)
    val punkt2 = Punkt(1, 7)
    val punkt3 = punkt1 + punkt2
    println("x: ${punkt3.x}, y: ${punkt3.y}")

    val punkt4 = punkt1.dodaj(punkt2)
    val punkt5 = punkt1 dodaj punkt2

}

class Punkt (var x: Int, var y: Int) {

    operator fun plus(inny: Punkt): Punkt {
        return Punkt(this.x + inny.x, this.y + inny.y)
    }

    infix fun dodaj(inny: Punkt): Punkt {
        return Punkt(this.x + inny.x, this.y + inny.y)
    }
}

infix fun Int.dodaj(liczba: Int): Int = this + liczba