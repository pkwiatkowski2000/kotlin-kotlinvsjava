package _6_Pętle

fun main() {
    var tablica = intArrayOf(5, 55, 100, -3, -99)

    for (element in tablica) {
        println(element)
    }

    for (i in 0 until tablica.size) {
        println(tablica[i])
    }

    for (i in tablica.indices) {
        println(tablica[i])
    }
}