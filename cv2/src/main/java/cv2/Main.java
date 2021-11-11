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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sachovnice chess = new Sachovnice((byte)10, (byte)10, (byte)1, (byte)1);
        Hra_Sachovnice game_chess = new Hra_Sachovnice(chess);
        Sachovnice chess2 = (Sachovnice)chess.clone();
        chess.move(SMER_POHYBU.DOWN);
        System.out.println(chess);
         System.out.println(chess2);
 
        
    }
    
}
