package _11_Klasy_różne_rodzaje.Interfejs

class Audi : Samochod {

    var uruchomiony: Boolean = false

    override fun start() {
        uruchomiony = true
        // załączenie systemów
    }

    override fun stop() {
        uruchomiony = false
        // wyłączanie systemów
    }
}