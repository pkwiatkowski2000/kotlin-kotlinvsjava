package _11_Klasy_różne_rodzaje.KlasaAbstrakcyjna

abstract class ZwierzeDomowe(var nazwa: String) {

    abstract var odglos: String
    abstract fun wydajOdglos()

    fun zawolaj() {
        println("chodź $nazwa")
    }
}