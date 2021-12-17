package cv3;

import java.util.Random;
  
public class generateRandom{
  
    double rand_dub;
    int rand_int;

    public generateRandom(){
        this.regen();
    }

    Random rand = new Random();
  
    public void ShowValues(){
        System.out.printf("Random Double: %f", this.rand_dub);
        System.out.printf("Random Integers: %d", this.rand_int);
    }

    public void regen(){
        this.rand_dub = rand.nextDouble();
        this.rand_int = rand.nextInt(10);
        
    }
    public int  getGenNum(int i ){
       
        return rand.nextInt(i);
        
    }
}
