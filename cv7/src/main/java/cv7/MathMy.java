/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv7;
/**
 *
 * @author musil19
 */
import javax.swing.JOptionPane;
public class MathMy {
    
    public static long faktorial(int c) throws Exception
    {
        if (c < 0)
            throw new Exception("Nelze pocitat faktorial ze zaporne hodnoty cisla."); //return -1;
        
        long f = 1;
        for (int i = 2; i <= c; i++)
            f *= i;
        return f;
    }
    
    public static long faktorial2(int c) throws InvalidNumberFaktorialException
    {
        if (c < 0)
            throw new InvalidNumberFaktorialException();
        
        long f = 1;
        for (int i = 2; i <= c; i++)
            f *= i;
        return f;
    }
    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.ERROR_MESSAGE);
    }
    
}
