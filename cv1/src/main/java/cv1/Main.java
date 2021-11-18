/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv1;

/**
 *
 * @author makedo01
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        deklarace_promennych();
        TiskCislo(2048);
        MinMax();
        
       
    }
    
    

    
    
    static void deklarace_promennych(){
        int i = 0;
        char c = 'c';
        float f = 1.2f;
        double d = 2.1;
        byte b = 1;
        long l = 123;
        boolean bl = true;
        short s = 123;
        
        Object o = (Object)i;
        System.out.println(o.toString());
        
    }
    static void TiskCislo(int cislo){
        System.out.println(cislo);
        System.out.println(Integer.toHexString(cislo));
        System.out.println(Integer.toOctalString(cislo));
        System.out.println(Integer.toBinaryString(cislo));
        
    }
    static void MinMax(){
        
        //TODO
        System.out.println("int - Min:" + Integer.MIN_VALUE + "; Max:" +
                Integer.MAX_VALUE + "; Size:" + Integer.SIZE);
        
        System.out.println("char - Min:" + Character.MIN_VALUE + "; Max:" +
                Character.MAX_VALUE + "; Size:" + Character.SIZE);
        
        System.out.println("float - Min:" + Float.MIN_VALUE + "; Max:" +
                Float.MAX_VALUE + "; Size:" + Float.SIZE);
        
        System.out.println("double - Min:" + Double.MIN_VALUE + "; Max:" +
                Double.MAX_VALUE + "; Size:" + Double.SIZE);
        
        System.out.println("byte - Min:" + Byte.MIN_VALUE + "; Max:" +
                Byte.MAX_VALUE + "; Size:" + Byte.SIZE);
         
        System.out.println("long - Min:" + Long.MIN_VALUE + "; Max:" +
                Long.MAX_VALUE + "; Size:" + Long.SIZE);
          
        System.out.println("short - Min:" + Short.MIN_VALUE + "; Max:" +
                Short.MAX_VALUE + "; Size:" + Short.SIZE);
        
    }
}
