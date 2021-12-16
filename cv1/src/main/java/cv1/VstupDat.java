/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv1;
import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author makedo01
 */
public class VstupDat {
    
    //TODO
    public static int ReadInteger(Scanner scan) throws InputMismatchException {
        
        
        System.out.print("Enter Integer: ");
        int in = scan.nextInt();
        
        return in;
    }
    public static char ReadChar(Scanner scan) throws InputMismatchException{
        
        
        System.out.print("Enter char: ");
        String str = scan.next();
        char in = str.charAt(0);  
       
        return in;
    }
    
    public static float ReadFloat(Scanner scan) throws InputMismatchException{
        
        
        System.out.print("Enter Float: ");
        float in = scan.nextFloat();
       
        return in;
    }
    
    public static double ReadDouble(Scanner scan) throws InputMismatchException{
        
        
        System.out.print("Enter Double: ");
        double in = scan.nextDouble();
       
        return in;
    }
    
    public static byte ReadByte(Scanner scan) throws InputMismatchException{
        
        
        System.out.print("Enter Byte: ");
        byte in = scan.nextByte();
       
        return in;
    }
    public static long ReadLong(Scanner scan) throws InputMismatchException{
        
        
        System.out.print("Enter Long: ");
        long in = scan.nextLong();
       
        return in;
    }
    public static boolean ReadBool (Scanner scan) throws InputMismatchException{
        
        
        System.out.print("Enter bool: ");
        boolean in = scan.nextBoolean();
       
        return in;
    }
    public static short ReadShort (Scanner scan) throws InputMismatchException{
        
        
        System.out.print("Enter short: ");
        short in = scan.nextShort();
       
        return in;
    }
    
    
}
