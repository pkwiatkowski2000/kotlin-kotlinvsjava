package _11_Klasy_różne_rodzaje

class Pies(nazwa: String) : ZwierzeDomowe(nazwa) {

    override var odglos: String = "hau hau"

    override fun wydajOdglos() {
        println("$nazwa szczeknął: $odglos")
    }
}