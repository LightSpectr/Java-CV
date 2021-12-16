package datovyTypPole;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        u1();
        //u2();
    }

    public static void tisk(String str) {
        System.out.println("" + str);
    } 
    public static void tisk(int v) {
        System.out.print("" + v + ';');
    }

    public static void tisk_pole_1(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        System.out.println("// ==============================================");
    }

    public static void tisk_pole_2(ArrayList<String> arr) {
        for (String i : arr) {
            System.out.println(i);
        }

        System.out.println("// ==============================================");
    }

    public static void tisk_pole_3(ArrayList<String> arr) {
        arr.forEach((n) -> System.out.println(n));

        System.out.println("// ==============================================");
    }

    public static void sort_pole(ArrayList<String> arr) {
        Collections.sort(arr);
        for (String i : arr) {
            System.out.println(i);
        }

        System.out.println("// ==============================================");
    }

    public static void zobrazi_jmeno(ArrayList<String> names) {        
        Scanner myObj = new Scanner(System.in);
        System.out.println("Zadejte jmeno ze seznamu: ");
        String name = myObj.nextLine();

        int index = names.indexOf(name);

        System.out.println("Poøadí zadaného jména v seznamu je: " + index);
    }

    public static void u1() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Zadejte velikost pole: ");

        String delka = myObj.nextLine();
        int delkaToNumber = Integer.parseInt(delka);
        String[] strArray = new String[delkaToNumber];
        System.out.println("Velikost pole je stanovena na: " + delkaToNumber);

        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Zadejte jmena oddelene carkou: ");

        String jmena = myObj.nextLine();
        strArray = jmena.split(", ");
        if (strArray.length != delkaToNumber) {
            System.out.println("Zadejte spravny pocet jmen");
        } else {
            for (String a : strArray)
                System.out.println(a);
        }

        Scanner myObj3 = new Scanner(System.in);
        System.out.println("Chcete zadat dalsi jmeno (ano/ne)? ");

        String otazkaNaDalsiJmeno = myObj.nextLine();
        if (otazkaNaDalsiJmeno.toLowerCase().equals("ano")) {
            Scanner myObj4 = new Scanner(System.in);
            System.out.println("Dalsi jmeno: ");

            String dalsiJmeno = myObj4.nextLine();
            List<String> list = Arrays.asList(strArray);
            if(list.contains(dalsiJmeno)){
                System.out.println("Toto jmeno jiz zadano");
            } else {
                list.add(dalsiJmeno);
                System.out.println("Jmena z vaseho seznamu: " + list);
            }
        } else {
            System.out.println("Dekujeme, nashledanou");
        }
    }

    public static void u2() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Some");
        names.add("Random");
        names.add("Names");
        names.add("Provided");
        names.add("Here");
        
        //tisk_pole_1(names);
        //tisk_pole_2(names);
        //tisk_pole_3(names);
        //sort_pole(names);
        zobrazi_jmeno(names);
    }
}