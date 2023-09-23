package _12_Lateinit_type_check_cast_companion_object_const.TypeCheck_Cast

fun main() {
    var owoc: Owoc
    owoc = Banan()
    wez(owoc)

    var zmienna: Any
    zmienna = 123
    sprawdzZmienna(zmienna)

    rzutowanie("Tekst")
}

fun rzutowanie(any: Any?) {
    var liczba: Int? = any as? Int
    println("rzutowanie: $liczba")
}



fun wez(owoc: Owoc) {
    if (owoc is Jabłko) {
        owoc.zjedz()
    } else {
        println("Nie lubię innych owoców!")
    }
}

fun sprawdzZmienna(zmienna: Any) {
    if (zmienna is Owoc) {
        zmienna.zjedz()
    } else if (zmienna is String) {
        println(zmienna.uppercase())
    } else {
        println("Nie potrafię obsłużyć tej zmiennej")
    }


    when (zmienna) {
        is Owoc -> zmienna.zjedz()
        is String -> println(zmienna.uppercase())
        else -> println("Nie potrafię obsłuzyć tej zmiennej")
    }
}