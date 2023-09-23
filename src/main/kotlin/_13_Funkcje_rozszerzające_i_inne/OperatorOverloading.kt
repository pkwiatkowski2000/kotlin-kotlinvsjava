package _13_Funkcje_rozszerzające_i_inne

fun main() {
    5 + 6
    5.plus(6)

    val punkt1 = Punkt(1, 5)
    val punkt2 = Punkt(1, 7)
    val punkt3 = punkt1 + punkt2
    println("x: ${punkt3.x}, y: ${punkt3.y}")

    println(punkt1 > punkt2)
}

class Punkt (var x: Int, var y: Int) {

    operator fun plus (inny: Punkt): Punkt {
        return Punkt(this.x + inny.x, this.y + inny.y)
    }

    operator fun compareTo(inny: Punkt): Int {
        if (this.x != inny.x) {
            return this.x - inny.x
        } else {
            return this.y - inny.y
        }
    }
}