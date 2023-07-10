package _11_Klasy_różne_rodzaje.KlasaAbstrakcyjna

import _11_Klasy_różne_rodzaje.KlasaAbstrakcyjna.ZwierzeDomowe

class Pies(nazwa: String) : ZwierzeDomowe(nazwa) {

    override var odglos: String = "hau hau"

    override fun wydajOdglos() {
        println("$nazwa szczeknął: $odglos")
    }
}