/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cv3;

/**
 *
 * @author maked
 */

abstract class Funkce{
    public abstract double calc_y(double x); 
}

class Funkce_Primka extends Funkce{
    double k;
    double q;
    public Funkce_Primka(double k, double q){
        this.k = k;
        this.q = q;
    }
    public double calc_y(double x){
        return k*x+q;
    }
    @Override
    public String toString(){
        return "y="+k+"x+"+q;
    }
    @Override
    public boolean equals(Object o){

           if (o == this) {
               return true;
           }


           if (!(o instanceof Funkce_Primka)) {
               return false;
           }


           Funkce_Primka c = (Funkce_Primka) o;


           return Double.compare(k, c.k) == 0
                   && Double.compare(q, c.q) == 0;

    }
}
class Funkce_Kvadraticka extends Funkce{
    double a;
    double b;
    double c;
    public Funkce_Kvadraticka(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double calc_y(double x){
        return a*x*x+b*x+c;
    }

    @Override
    public String toString(){
        return "y="+a+"x^2+"+b+"x+"+c;
    }
    @Override
    public boolean equals(Object o){

           if (o == this) {
               return true;
           }


           if (!(o instanceof Funkce_Kvadraticka)) {
               return false;
           }


           Funkce_Kvadraticka kv = (Funkce_Kvadraticka) o;


           return Double.compare(a, kv.a) == 0
                   && Double.compare(b, kv.b) == 0
                   && Double.compare(c, kv.c) == 0;

    }
    double diskriminant(){
        return b*b-(4*a*c);
    }

    int pocet_korenu(){
        if (this.diskriminant()<0){
            return 0;
        }else if(this.diskriminant()==0){
            return 1;
        }else return 2;
    }

}

