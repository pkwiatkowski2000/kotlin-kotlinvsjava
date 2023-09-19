package _11_Klasy_różne_rodzaje.KlasaData;

public class OsobaJava {
    private String imie;
    private String nazwisko;

    public OsobaJava(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "OsobaJava(" + imie + ", " + nazwisko + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof OsobaJava) {
            if (imie.equals(((OsobaJava) obj).imie) && nazwisko.equals(((OsobaJava) obj).nazwisko)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        OsobaJava osoba1 = new OsobaJava("Jan", "Kowalski");
        OsobaJava osoba2 = new OsobaJava("Jan", "Kowalski");

        System.out.println(osoba1);
        System.out.println(osoba1.equals(osoba2));
    }
}
