package _6_Pętle

fun main() {
    for (i in 0..10) {
        if (i == 8) {
            continue
        }
        println(i)
    }

    println()

    for (i in 0..10) {
        if (i == 5) {
            break
        }
        println(i)
    }
}