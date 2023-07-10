package _11_Klasy_różne_rodzaje.KlasaAbstrakcyjna

import _11_Klasy_różne_rodzaje.KlasaAbstrakcyjna.ZwierzeDomowe

class Kot(nazwa: String) : ZwierzeDomowe(nazwa) {
    override var odglos: String = "miau miau"

    override fun wydajOdglos() {
        println("$nazwa miałknął: $odglos")
    }
}