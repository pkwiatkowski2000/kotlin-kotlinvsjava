package _11_Klasy_różne_rodzaje

class Kot(nazwa: String) : ZwierzeDomowe(nazwa) {
    override var odglos: String = "miau miau"

    override fun wydajOdglos() {
        println("$nazwa miałknął: $odglos")
    }
}