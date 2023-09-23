package _12_Lateinit_type_check_cast_companion_object_const.TypeCheck_Cast;

public class MainJava {
    public static void main(String[] args) {

    }

    public static void sprawdzZmienna(Object zmienna) {
        if (zmienna instanceof Owoc) {
            ((Owoc) zmienna).zjedz();
        } else if (zmienna instanceof String) {
            System.out.println(((String) zmienna).toUpperCase());
        } else {
            System.out.println("Nie potrafię obsłużyć tej zmiennej");
        }
    }
}
