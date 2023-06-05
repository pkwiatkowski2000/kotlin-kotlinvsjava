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

// var wierszCharArray = wiersz.toCharArray()
// for (i in wierszCharArray.indices) {
//     if (wierszCharArray[i] == '0') {
//         wierszCharArray[i] = 'o'
//        }
//
//     if (wierszCharArray[i] == '@') {
//         wierszCharArray[i] = 'a'
//        }

// println(wierszCharArray)

    wiersz = wiersz.replace('0', 'o').replace('@', 'a')

    println(wiersz)

    println()

// 3. Poniższy tekst musi zostać ocenzurowany. Zamień wszystkie słowa "kurcze" na "******".
// Po przeprowadzeniu cenzury, wyświetl tekst, na końcu dodaj trzy znaki nowej linii i doklej zmienną informację.

// Tekst do ocenzurowania:
//
// Kupił dziadek jajko w sklepie
// I po brzuchu już się klepie
// Naszykował szklankę z cukrem
// Kogel mogel sobie utrę
//
// Naglę co to, awantura
// Dziura w jajku w jajku dziura
// A w tej dziurze kurcze blade
// Kurcze blade wrzasnął dziadek
//
// Kurcze blade kurcze blade
// I ze ściany porwał szpadę
// Leci kurcze blade z trwogi
// Za kurczęciem dziadek srogi
//
// Złapał dziadek kurcze blade
// Zrobię z ciebie marmoladę
// Marmolada lepsza z jabłka
// Powiedziała trzeźwo babka
//
// Lepiej upiec kurcze blade
// W piekarniku na obiadek
// Jak wsadzili je do pieca
// To dopiero była heca
//
// Bo uciekło z pieca dziurką
// I zostało tylko piórko
// Piórko blade piórko blade
// Które zjadł na obiad dziadek

    val informacja = "Informacja! Tekst został ocenzurowany."

    var tekstDoOcenzurowania = """
    Kupił dziadek jajko w sklepie
    I po brzuchu już się klepie
    Naszykował szklankę z cukrem
    Kogel mogel sobie utrę
     
    Naglę co to, awantura
    Dziura w jajku w jajku dziura
    A w tej dziurze kurcze blade
    Kurcze blade wrzasnął dziadek
     
    Kurcze blade kurcze blade
    I ze ściany porwał szpadę
    Leci kurcze blade z trwogi
    Za kurczęciem dziadek srogi
     
    Złapał dziadek kurcze blade
    Zrobię z ciebie marmoladę
    Marmolada lepsza z jabłka
    Powiedziała trzeźwo babka
     
    Lepiej upiec kurcze blade
    W piekarniku na obiadek
    Jak wsadzili je do pieca
    To dopiero była heca
     
    Bo uciekło z pieca dziurką
    I zostało tylko piórko
    Piórko blade piórko blade
    Które zjadł na obiad dziadek""".trimIndent()

    val tekstOcenzurowany = tekstDoOcenzurowania.replace("kurcze", "******")

    println("$tekstOcenzurowany \n\n\n$informacja")
}