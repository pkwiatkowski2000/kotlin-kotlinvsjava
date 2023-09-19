package _11_Klasy_różne_rodzaje.KlasaEnum

fun main() {
    println(PoryRoku.WIOSNA.ordinal)
    println(PoryRoku.ZIMA.ordinal)

    println(PoryRoku.values()[3].name)
    val poryRoku: PoryRoku = PoryRoku.valueOf("ZIMA")

    println(PoryRoku.LATO.nazwaPoAngielsku)

    when(poryRoku) {
        PoryRoku.WIOSNA -> println("roślinność zakwita")
        PoryRoku.LATO -> println("jest gorąco")
        PoryRoku.JESIEN -> println("liście spadają")
        PoryRoku.ZIMA -> println("spadł śnieg")
    }
}