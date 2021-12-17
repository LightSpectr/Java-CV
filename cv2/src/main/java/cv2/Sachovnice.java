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
public class Sachovnice {
    private byte size_x;
    private byte size_y;
    private byte actual_x;
    private byte actual_y;
    
    public Sachovnice(byte size_x, byte size_y, byte actual_x,
            byte actual_y){
       
        this.size_x = size_x;
        this.size_y = size_y;
        this.actual_x = actual_x;
        this.actual_y = actual_y;
    }
    
    @Override
    public String toString() {
      return "[" + this.actual_x + "," + this.actual_y + "]";
    }
    
    public boolean test(){
        if (this.size_x <0 || this.size_y < 0 || this.actual_x < 0 
                || this.actual_y < 0){
            return false;
        }
        if (this.actual_x>this.size_x || this.actual_y>this.size_y){
            return false;
        }
        return true;
    }
    
    private boolean can_left(){
        
        return actual_x>0;      
              
    }
    private boolean can_right(){
        
        return actual_x<size_x;  
    }
    private boolean can_down(){
        
        return actual_y>0;   
    }
    private boolean can_up(){
        
        return actual_y<size_y;  
    }
    
    public boolean can_move(SMER_POHYBU direction){
        
        boolean val;
        switch(direction) {
            case UP:
              val = this.can_up();
              break;
            case DOWN:
              val = this.can_down();
              break;
            case LEFT:
              val = this.can_left();
              break;
            case RIGHT:
              val = this.can_right();
              break;
            default:
                val = false;
                    break;
           
        }
        return val;
        
    }
    /*
    public byte[] get_pos(){
        
        byte[] pos = new byte[2];
        pos[0] = this.actual_x;
        pos[1] = this.actual_y;
        return pos;
        
    }
    */
    public void move(SMER_POHYBU direction){
        
        if (this.can_move(direction)){
            this.actual_x = (byte)(this.actual_x + direction.value_x());
            this.actual_y = (byte)(this.actual_y + direction.value_y());
            
            
        }
    }
    
    @Override
    public Object clone() {
        try {
            return (Sachovnice) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Sachovnice(this.size_x, this.size_y, this.actual_x, this.actual_y);
        }
    }
}
