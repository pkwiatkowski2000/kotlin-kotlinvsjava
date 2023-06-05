package _Zadania_domowe

fun main() {
// 1. Utwórz zmienną imie, która może być nullowalna.
// Jeżeli zmienna imie będzie nullem to wypisz na ekran:
//
// Ja mam jedno ciastko, Ty masz drugie
// Jeżeli zmienna będzie uzupełniona danymi to wypisz:
//
// Ja mam jedno ciastko, <imie> ma drugie
// Zweryfikuj swoje rozwiązanie podając różne wartości. Pomyśl nad różnymi sposobami napisania tego rozwiązania.

    var imie: String? = "Paweł"

    if (imie == null) {
        println("Ja mam jedno ciastko, Ty masz drugie")
    } else {
        println("Ja mam jedno ciastko, $imie ma drugie")
    }

    var tekst = imie ?: "Ty"
    println("Ja mam jedno ciastko, $tekst ma drugie")

    println()

// 2. Ups... komuś pozamieniały się znaki "o" z "0" (zero) oraz "a" z "@" w poniższym tekście. Popraw go :)
//
// M@t0łek r@z zwiedz@ł z00
// I w0ł@ł c0 chwil@: "0-0!"
// "J@k@ brzydk@ p@pug@!"
// "Żyr@f@ jest z@ dług@!"
// "Sł0ń z@ wys0ki!"
// "A p0 c0 k0mu te f0ki?"
// "Zebr@ m@ f@rb0w@ne żebr@!"
// "Tygrys
// Chętnie by mnie stąd wygryzł!"
// "N@, @ z@jrzyjmy p0d d@szek:
// Żółw - tuś, br@tku, tuś!"
// "A t0? Pt@szek.
// Niezły pt@szek -
// Struś!"
// Wreszcie zbliż@ się d0 wielbłąd@,
// Uw@żnie mu się przygląd@
// I p0wi@d@ wsk@zując n@ nieg0 przez kr@ty:
// "0wszem, niezły. Niczeg0! Szk0d@ tylk0, że g@rb@ty!"

    var wiersz = """
        M@t0łek r@z zwiedz@ł z00
        I w0ł@ł c0 chwil@: "0-0!"
        "J@k@ brzydk@ p@pug@!"
        "Żyr@f@ jest z@ dług@!"
        "Sł0ń z@ wys0ki!"
        "A p0 c0 k0mu te f0ki?"
        "Zebr@ m@ f@rb0w@ne żebr@!"
        "Tygrys
        Chętnie by mnie stąd wygryzł!"
        "N@, @ z@jrzyjmy p0d d@szek:
        Żółw - tuś, br@tku, tuś!"
        "A t0? Pt@szek.
        Niezły pt@szek -
        Struś!"
        Wreszcie zbliż@ się d0 wielbłąd@,
        Uw@żnie mu się przygląd@
        I p0wi@d@ wsk@zując n@ nieg0 przez kr@ty:
        "0wszem, niezły. Niczeg0! Szk0d@ tylk0, że g@rb@ty!"""".trimIndent()

    var wierszCharArray = wiersz.toCharArray()
    for (i in wierszCharArray.indices) {
        if (wierszCharArray[i] == '0') {
            wierszCharArray[i] = 'o'
        }

        if (wierszCharArray[i] == '@') {
            wierszCharArray[i] = 'a'
        }
    }

    println(wierszCharArray)


}