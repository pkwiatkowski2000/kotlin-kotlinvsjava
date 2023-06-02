package _7_String

fun main() {
    var tekstWielolinijkowy = "Pierwsza linijka\nDruga linijka\nTrzecialinijka"
    var tekstSurowy = """
        Pierwsza linijka
        Druga linijka
        Trzecia linijka
    """.trimIndent()

    println(tekstWielolinijkowy)
    println()
    println(tekstSurowy)
}