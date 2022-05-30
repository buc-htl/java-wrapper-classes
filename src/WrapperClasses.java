import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {


    public static void main(String[] args) {
        explainWrapperClasses();
    }

    private static void explainWrapperClasses() {

        /*
             Jeder primitiver Datentyp besitzt in Java eine dazugehörige Klasse.
             boolean    ->  Boolean
             byte       ->  Byte
             short      ->  Short
             int        ->  Integer
             long       ->  Long
             float      ->  Float
             double     ->  Double
             char       ->  Character

            Wie üblich beginnen die Klassen mit Großbuchstaben. Diese Klassen werden "Wrapper"-Klassen ("Ummantelungsklassen") genannt, weil sie
            einen primitiven Typ "ummanteln".
         */

        //Wrapper-Objekte lassen sich mit der statischen valueOf() Methode erzeugen oder mit Konstruktoren.

        Integer int1 = Integer.valueOf("30");  // valueOf()
        Integer int2 = Integer.valueOf(30);  // valueOf()
        Long lng1 = Long.valueOf(0xC0B0L);  // valueOf()
        Double dobl = new Double(12.3);       // Konstruktor
        Integer int3 = new Integer(29);        // Konstruktor

        //Mit Autoboxing wandelt der Java-Compiler aber auch automatisch primitive Datentypen in Objekte (Boxing) und Objekte in primitive Datentypen (Unboxing) um.

        Double f1 = 3.5;
        System.out.println(f1.toString());

        //In Collections können nur Objekte und keine primitiven Datentypen gespeichert werden. Wegen Autoboxing haben wir uns bis jetzt aber nicht wirklich damit
        //beschäftigen müssen
        List<Float> zahlen = new ArrayList<>();
        zahlen.add(3.4f);           //Boxing float -> Float
        float f = zahlen.get(0);    //Unboxing Float -> float


        //Besondere Vorsicht ist geboten bei Identitätsvergleich (==) !!
        Integer i1 = 3423;
        Integer i2 = 3423;

        System.out.println(i1 >= i2);    // true
        System.out.println(i1 <= i2);    // true
        System.out.println(i1 == i2);    // false -> Die Objekte werden verglichen! Es passiert kein Unboxing!
        System.out.println(i1 == i2 - 0);  // true  -> durch das -0 passiert ein Unboxing und die primitiven Werte werden verglichen
    }
}
