package _12_Lateinit_type_check_cast_companion_object_const

fun main() {
    val anonimowy = object {

    }

    val anonimowyDziedziczy = object : Runnable {
        override fun run() {
            TODO("Not yet implemented")
        }
    }
}

object Singleton {

}

class KlasazeStaticem {
    // ...

    companion object {
        val POLE_STATYCZNE = 123
    }
}