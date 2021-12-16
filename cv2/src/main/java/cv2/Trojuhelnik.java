/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv2;
import java.math.*;
/**
 *
 * @author makedo01
 */
public class Trojuhelnik {
    private double a;
    private double b;
    private double c;

    public Trojuhelnik()
    {
            a = 0.0; 
            b = 0.0;
            c = 0.0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Trojuhelnik t = new Trojuhelnik();
        t.setAll(this.a, this.b, this.c);
        return t;
    }

    @Override
    public String toString() {
        return "" + "a:" + a + ";b:" + b + ";c:" + c + ""; //super.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(a);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(c);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (getClass() != obj.getClass())
            return false;
        Trojuhelnik other = (Trojuhelnik) obj;
        if (Double.doubleToLongBits(a) != Double.doubleToLongBits(other.a))
            return false;
        if (Double.doubleToLongBits(b) != Double.doubleToLongBits(other.b))
            return false;
        if (Double.doubleToLongBits(c) != Double.doubleToLongBits(other.c))
            return false;
        return true;
    }    
        
    // ----
    
    public void setA(double a)
    {
            this.a = (a > 0) ? a : 0.0;
    }

    public double getA()
    {
            return a;
    }

    public void setB(double b)
    {
            this.b = (b > 0) ? b : 0.0;
    }

    public double getB()
    {
            return b;
    }

    public void setC(double c)
    {
            this.c = (c > 0) ? c : 0.0;
    }

    public double getC()
    {
            return c;
    }

    public void setAll(double a, double b, double c)
    {
            setA(a);
            setB(b);
            setC(c);
    }

    public boolean isValid()
    {
            return a > 0 && b > 0 && c > 0;
    }

    public double getObvod()
    {
            return a + b + c;
    }

    public boolean IsRovnostranny()
    {
            return a == b && b == c;	// priority operatoru
    }

    public boolean IsRovnoramenny()
    {
            return a == b || b == c || c == a;	// priority operatoru
    }

    public boolean IsPravouhly()
    {
            return Math.pow(a, 2.0) + Math.pow(b, 2.0) == Math.pow(c, 2.0)
                            || Math.pow(a, 2.0) + Math.pow(c, 2.0) == Math.pow(b, 2.0)
                        || Math.pow(b, 2.0) + Math.pow(c, 2.0) == Math.pow(a, 2.0);
    }        
}
