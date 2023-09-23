package _14_Kotlin_vs_Java.JavaFromKotlin;

import _14_Kotlin_vs_Java.KotlinFromJava.PlikKotlin;
import org.jetbrains.annotations.Nullable;

public class PlikJava {

    public static final String ZMIENNA_STATIC_FINAL = "STATIC_FINAL";

    private int liczba;
    private String tekst;

    public void metodaNicNieZwraca() {
        PlikKotlin plikKotlin = new PlikKotlin();
        plikKotlin.funkcjaNicNieZwraca();

        PlikKotlin.funkcjaCompanionObject();

    }

    @Nullable
    public String metodaCosZwraca() {
        return "";
    }

    public int getLiczba() {
        return liczba;
    }

    public void setLiczba(int liczba) {
        this.liczba = liczba;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }
}
