package _Zadania_domowe

fun main() {
// 1. Utwórz klasę Obuwie, która w konstruktorze przyjmuje argumenty rozmiar i cena.
// Posiada również funkcję wyswietlDane(), która wyświetla argumenty z konstruktora na ekran.
// Następnie utwórz klasy Klapki, Sztyblety, które będą dziedziczyć po klasie Obuwie.

    open class Obuwie(val rozmiar: Int, var cena: Double) {
        fun wyswietlDane() {
            println("rozmiar: $rozmiar, cena: $cena")
        }
    }

    class Klapki(rozmiar: Int, cena: Double) : Obuwie(rozmiar, cena)

    class Sztyblety(rozmiar: Int, cena: Double) : Obuwie(rozmiar, cena)

    val klapki = Klapki(44, 59.99)
    val sztyblety = Sztyblety(41, 399.00)

    print("klapki - ")
    klapki.wyswietlDane()

    print("sztyblety - ")
    sztyblety.wyswietlDane()

// 2.Utwórz klasę Produkt, która w konstruktorze przyjmuje argument vat oraz funkcję wyswietlInformacje(), która wyświetla "Podatek VAT wynosi x%.".
// Następnie utwórz klasy Zywnosc, PaliwoSilnikowe, Wegiel, które dziedziczą po klasie Produkt.
// Ustaw domyślne wartości dla podatku VAT :
// -Zywnosc - 5 %;
// -PaliwoSilnikowe - 23 %;
// -Wegiel - 23 %;
//
// Dodatkowo do klasy Wegiel dopisz drugi konstruktor, do którego dodasz argument limit, określający maksymalną ilość ton możliwą do zakupu.
// Przesłoń funkcję wyswietlInformacje(), do której, oprócz informacji o podatku, zostaną wyświetlone także restrykcje dotyczące limitu np.
// "Podatek VAT wynosi x%.
// Limit zakupu to y (ton) ".
// Przetestuj rozwiązanie, sprawdzając, czy prawidłowo zostaną wyświetlone zmienione stawki VAT
// np. 0% dla żywności, 8% dla paliw silnikowych oraz czy zostanie wyświetlony limit na zakup węgla, jeżeli zostanie podany.

    open class Produkt(var vat: Int) {
        open fun wyswietlInformacje() {
            println("Podatek VAT wynosi $vat%.")
        }
    }

    class Zywnosc(vat: Int = 5) : Produkt(vat)

    class PaliwoSilnikowe(vat: Int = 23) : Produkt(vat)

    class Wegiel(vat: Int = 23) : Produkt(vat) {
        var limit: Int? = null

        constructor(vat: Int = 23, limit: Int) : this(vat) {
            this.limit = limit
        }

        override fun wyswietlInformacje() {
            super.wyswietlInformacje()
            if (limit!= null) {
                println("Limit zakupu to $limit (ton)")
            }
        }
    }

    var zywnosc = Zywnosc(0)
    var paliwo = PaliwoSilnikowe(8)
    var wegiel = Wegiel(limit = 2)

    zywnosc.wyswietlInformacje()
    paliwo.wyswietlInformacje()
    wegiel.wyswietlInformacje()

}