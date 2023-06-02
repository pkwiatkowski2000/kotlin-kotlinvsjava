package _7_String

fun main() {
    var tekst: String = "Dowolny tekst"
    var tekstDługi = "Jakiś dłuższy tekst"
    var tekstWspólny = tekst + ". " + tekstDługi
    var liczba = 100

    println("Wyświetl: " + tekstWspólny + " " + liczba)
    var długość = tekst.length
    println(długość)

//    tekst.substring()
//    tekst.trim()
//    tekst.startsWith()
//    tekst.startsWith()

    println(tekst[2])

    for (znak in tekst) {
        println(znak)
    }
}