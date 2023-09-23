package _13_Funkcje_rozszerzające_i_inne.ExtensionFunctions

fun main() {
    val sciana = Sciana()
    sciana.maluj()
    sciana.zniszcz()

    val text = "nasz dowolny tekst"
//    println(removeFirstLetter(text))
    println(text.removeFirstLetter())

    sciana.pokazTekst("ext fun")
}

fun Sciana.pokazTekst(tekst: String) {
    println(tekst)
}

fun Sciana.zniszcz() {
    // .... BOOM
}

//fun removeFirstLetter(text: String): String {
//    return text.substring(1)

fun String.removeFirstLetter(): String {
    return this.substring(1)
}