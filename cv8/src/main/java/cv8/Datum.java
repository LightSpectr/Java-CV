/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv8;

/**
 *
 * @author makedo01
 */
public class Datum {
    private int den;
    private int mesic;
    private int rok;
    
    private Datum(int den, int mesic, int rok) throws Exception {
        if (den > 1 || den < 31){
             this.den = den;
        }
        else{
            throw new Exception("Wrong day");
        }
        if (mesic > 1 || mesic <12){
            this.mesic = mesic;
        }
        else{
            throw new Exception("Wrong month");
        }
        if (rok > 1 ){
            this.rok = rok;
        }
        else{
            throw new Exception("Wrong year");
        }
       
    }
    
    public String toString() {
      return Integer.toString(den)+'.'+Integer.toString(mesic)+'.'+
              '.'+Integer.toString(rok);
   }
}
