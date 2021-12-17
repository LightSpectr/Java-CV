/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cv3;
import java.lang.Thread;
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
        
        generateRandom random = new generateRandom();
        random.ShowValues();
        
        Sachovnice chess_board = new Sachovnice((byte)10, (byte)10, (byte)1, (byte)1);
        Hra_Sachovnice game_chess = new Hra_Sachovnice(chess_board);
        int count =  0;
        if(game_chess.hra.test()){
            game_chess.tisk();
            while(count < 20){
                switch(random.getGenNum(4)){
                    case 0:
                        if(game_chess.hra.can_move(SMER_POHYBU.UP)){
                            game_chess.hra.move(SMER_POHYBU.UP);
                        }
                        break;
                    case 1:
                        if(game_chess.hra.can_move(SMER_POHYBU.DOWN)){
                            game_chess.hra.move(SMER_POHYBU.DOWN);
                        }
                        break;
                    case 2:
                        if(game_chess.hra.can_move(SMER_POHYBU.LEFT)){
                            game_chess.hra.move(SMER_POHYBU.LEFT);
                        }
                        break;
                    case 3:
                        if(game_chess.hra.can_move(SMER_POHYBU.RIGHT)){
                            game_chess.hra.move(SMER_POHYBU.RIGHT);
                        }
                        break;
                
                }
                game_chess.tisk();
                count++;
                try        
                {
                    Thread.sleep(1000);
                } 
                catch(InterruptedException ex) 
                {
                    Thread.currentThread().interrupt();
                }
            }
        }else{
            System.out.println("test failed");
       
        }
        
    }
    
}
