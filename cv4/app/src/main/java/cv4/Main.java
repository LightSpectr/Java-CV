package cv4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.util.stream.*;


public class Main {

    public static void main(String[] args) {
        // Zvolte metodu
        //u1();
        //u2();
        //u3();
        //u4();
        
        int[][] pole = new int[10][10];
        minovePole(pole, 4, 6);  
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

        System.out.println("Poradi zadaného jména v seznamu je: " + index);
    }
    
    public static void printPairs(ArrayList<String> names) {
        for (int i = 0; i < names.size(); i++) {
            for (int j = i + 1; j < names.size(); j++) {
                System.out.println(names.get(i) + ", " + names.get(j));
            }
        }
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
            System.out.println("Nespravny pocet jmen. Spust'te aplikaci znovu.");
        } else {
            Scanner myObj3 = new Scanner(System.in);
            System.out.println("Chcete zadat dalsi jmeno (ano/ne)? ");

            String otazkaNaDalsiJmeno = myObj.nextLine();
            if (otazkaNaDalsiJmeno.toLowerCase().equals("ano")) {
                Scanner myObj4 = new Scanner(System.in);
                System.out.println("Dalsi jmeno: ");

                String dalsiJmeno = myObj4.nextLine();
                List<String> list = new ArrayList<>(Arrays.asList(strArray));
                if(list.contains(dalsiJmeno)){
                    System.out.println("Toto jmeno jiz zadano");
                    System.out.println("Dvojice jmen z vaseho seznamu: ");
                    
                    ArrayList<String> pairsList = new ArrayList<String>(list);
                    printPairs(pairsList);
                } else {
                    list.add(dalsiJmeno);

                    System.out.println("Dvojice jmen z vaseho seznamu: ");
                    ArrayList<String> pairsList = new ArrayList<String>(list);
                    printPairs(pairsList);
                }
            } else {
                System.out.println("Dekujeme, nashledanou");
            }
        }
    }

    public static void u2() {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Some");
        names.add("Random");
        names.add("Names");
        names.add("Provided");
        names.add("Here");
        
        // Zvolte metodu
        //tisk_pole_1(names);
        //tisk_pole_2(names);
        //tisk_pole_3(names);
        //sort_pole(names);
        zobrazi_jmeno(names);
    }
    
    public static void u3() {
        String[] cities = {"Prague", "London", "Berlin", "Moscow"};
        String[] cars = {"Skoda", "BMW", "Audi", "Toyota"};
        
        String[] citiesAndCars = Stream.concat(Arrays.stream(cities), Arrays.stream(cars)).toArray(String[]::new);
        for (int i = 0; i < citiesAndCars.length; i++) {
            System.out.print(citiesAndCars[i] + " ");
        }
    }
    
    public static void u4() {
        ArrayList<String> cities = new ArrayList<>(Arrays.asList("Prague", "London", "Berlin", "Moscow"));
        ArrayList<String> cars = new ArrayList<>(Arrays.asList("Skoda", "BMW", "Audi", "Toyota"));
         
        cities.addAll(cars);
        cities.forEach((c) -> System.out.print(c + " "));
    }
    
    public static void minovePole(int[][] arr, int minaX, int minaY) {
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[minaX][minaY] = 1;
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }
}