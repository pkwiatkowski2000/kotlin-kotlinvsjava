package _11_Klasy_różne_rodzaje

fun main() {
    val mecz = object {
        var punkty: Int = 0
        fun zliczPunkty() {
            // ...
        }
    }

    mecz.punkty
    mecz.zliczPunkty()

    val mojListener = object : Listener {
        override fun onClick() {
            println("Kliknąłem")
        }
    }
    mojListener.onClick()
}

interface Listener {
    fun onClick()
}