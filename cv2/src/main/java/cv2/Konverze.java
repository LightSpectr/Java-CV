/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cv2;


/**
 *
 * @author maked
 */
public class Konverze {
    public static void func()
    {
        byte b = 0;
        b--;
        System.out.println(b);
        b= 127;
        b++;
        System.out.println(b);
        b = 'a';
        System.out.println(b);
        
        Trojuhelnik tr = new Trojuhelnik();
        tr.setAll(4.5, 6.5, 9.3);

        Object obj = (Object)tr;
        tr = (Trojuhelnik)obj;

       

        System.out.println(tr);
        
    }
}
