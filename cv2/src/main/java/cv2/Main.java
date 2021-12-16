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
        Konverze.func();
        Znaky ascii = new Znaky();
        System.out.println("---------------------------");
        ascii.tisk_ASCII('b');
        System.out.println("---------------------------");
        ascii.get_ASCII();
        System.out.println("---------------------------");
        Sachovnice chess_board = new Sachovnice((byte)10, (byte)10, (byte)1, (byte)1);
        Hra_Sachovnice game_chess = new Hra_Sachovnice(chess_board);
        Sachovnice chess_board2 = (Sachovnice)chess_board.clone();
        while(true){
            switch(game_chess.nacti_direction()){
                case 'w':
                
                
            }
        }
 
        
    }
    
}
