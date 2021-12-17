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
public class InvalidNumberFaktorialException extends Exception {
    
    public InvalidNumberFaktorialException()
    {
        super("Hodnota čísla je záporná.");
    }
    
    public InvalidNumberFaktorialException(String msg)
    {
        super(msg);
    }
    
}
