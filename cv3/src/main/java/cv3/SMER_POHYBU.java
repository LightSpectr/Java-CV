/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv3;

/**
 *
 * @author makedo01
 */
public enum SMER_POHYBU {
    UP ((byte)1,(byte)0),
    DOWN ((byte)-1, (byte)0),
    LEFT ((byte)0, (byte)-1),
    RIGHT ((byte)0, (byte)1);
    

    
    
    
   private final byte dirv;
   private final byte dirh;
   SMER_POHYBU(byte vert, byte horz) { 
       this.dirv = vert;
       this.dirh = horz;
       
   }

   public byte[] value() {
       
       
       return new byte[] {this.dirv, this.dirh};
       
       
   } 
   public byte value_x() {
       
       return  this.dirh;
   } 
   
   public byte value_y() {
       
       return  this.dirv;
   } 
    
}
