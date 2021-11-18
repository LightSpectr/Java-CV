package typovysystem;

public class Main {
    public static void main(String[] args) {
        Main.TiskCislo(5);
    }

    public static void deklarace_promennych() {
        boolean result = true;
        char capitalC = 'C';
        byte b = 100;
        short s = 10000;
        int i = 100000;
        double d1 = 123.4;
        float f1 = 15.3f;
        String str = "string";
    }

    public static void TiskCislo(int cislo) {
        System.out.println(cislo);
    }
}