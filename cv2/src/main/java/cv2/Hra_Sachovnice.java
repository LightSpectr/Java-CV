/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv2;
import java.util.Scanner;
/**
 *
 * @author makedo01
 */
public class Hra_Sachovnice {
    public Sachovnice hra = null;
    private Scanner scr;
    
    
    public Hra_Sachovnice(Sachovnice hra){
        if(hra.test() == true){
            this.hra = hra;
        }
        else{
            this.hra = null;
        }
        scr = new Scanner(System.in);
    }
    
    public char nacti_direction(){
         
    
        
        return this.scr.next(".").charAt(0);   
    }
    
    public void tisk(){
        
        System.out.println(this.hra);
    }
}
