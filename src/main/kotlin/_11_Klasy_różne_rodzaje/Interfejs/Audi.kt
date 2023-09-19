package _11_Klasy_różne_rodzaje.Interfejs

class Audi : Samochod, Spalinowy {

    var uruchomiony: Boolean = false

    override fun start() {
        uruchomiony = true
        // załączenie systemów
    }

    override fun stop() {
        uruchomiony = false
        // wyłączanie systemów
    }

    override fun zatankuj(ilosc: Double) {
        TODO("Not yet implemented")
    }
}