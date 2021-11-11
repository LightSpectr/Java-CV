/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv2;

/**
 *
 * @author makedo01
 */
public class Hra_Sachovnice {
    public Sachovnice hra = null;
    
    public Hra_Sachovnice(Sachovnice hra){
        if(hra.test() == true){
            this.hra = hra;
        }
        else{
            this.hra = null;
        }
    }
    
    public char nacti_direction(){
         
        
        
    return 'd';     
    }
    
    public void tisk(){
        
        System.out.println(this.hra);
    }
}
