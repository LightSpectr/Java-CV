/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenipet;

import java.util.ArrayList;

/**
 *
 * @author Ondrej
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rozseknuti pokus = new Rozseknuti("toto@je@test@na@split");
        
        System.out.println("1a)");
        System.out.println(pokus.getTest());
        String[] separated = pokus.getTest().split("@", 5);
        for(String b  : separated)
            System.out.println(b);
        
        System.out.println("1b)");
        Rozseknuti pokus1 = new Rozseknuti("123;4567;89;123;456;789;0123;4567789");
        System.out.println(pokus1.getTest());
        String[] separated1 = pokus1.getTest().split(";", 8);
        for(String c  : separated1)
            System.out.println(c);
        
        System.out.println("1c)");
        Rozseknuti pokus2 = new Rozseknuti("-152;-25;8999");
        System.out.println(pokus2.getTest());
        String[] separated2 = pokus2.getTest().split(";", 3);
        for(String d  : separated2)
            System.out.println(d);
        
        System.out.println("1d) Hledani znaku v retezci");
        System.out.println("Zadejte vstupni retezec ");
        String pokus3 = "Toto je testovaci retezec pouze pri pouziti cviceni 1d, hledame znak a";
        System.out.println(pokus3);
        System.out.println("Zadejte hledany znak: ");
        String hledany_znak = "a";
        System.out.println(hledany_znak);
        int index = pokus3.indexOf(hledany_znak);
        while(index >= 0) {
           System.out.println(index);
           index = pokus3.indexOf(hledany_znak, index+1);
        }

        

        //vstup
        //projdeme retezec a porovname ho s hledanym znakem, pro kazdy znak bude v poli hodnota 1,0; kde se nachazi hledany
        //znak bude 1; for cyklus, i++;
        
        System.out.println("1e)");
        /* nacteni vstupu jmeno prijmeni, oddelene mezerami, pocet mezer je jedno.... zapise do promenne jmeno, prijmeni bez mezer
        kazdy udaj v samostatne promenne*/
                System.out.println("2a)");
                primka primka1 = new primka("primka1");
                primka primka2 = new primka("primka2");
                rovnice rovnice1 = new rovnice("rovnice1");
                rovnice rovnice2 = new rovnice("rovnice2");
            ArrayList objekty = new ArrayList();
            objekty.add(primka1.getName());
            objekty.add(primka2.getName());
            objekty.add(rovnice1.getName());
            objekty.add(rovnice2.getName());
            System.out.println(objekty);
            
        }
    }
