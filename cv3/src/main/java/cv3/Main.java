/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cv3;

/**
 *
 * @author maked
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Funkce_Primka f1= new Funkce_Primka(0.5, -2);
        Funkce_Kvadraticka f2= new Funkce_Kvadraticka(1, -8, 12);
        System.out.println(f1);
        System.out.println(f1.calc_y(16));
        System.out.println(f2);
        System.out.println(f2.calc_y(4));
        System.out.println(f2.diskriminant());
        System.out.println(f2.pocet_korenu());
    }
    
}
