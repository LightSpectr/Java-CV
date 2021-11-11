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
public class Trojuhelnik {
    private double a;
    private double b;
    private double c;
    
    public Trojuhelnik()
    {
        this(0.0, 0.0, 0.0);
    }

    public Trojuhelnik(double a)
    {
        this(a, a, a);
    }

    public Trojuhelnik(double a, double b, double c)
    {
        setA(a);
        setB(b);
        setC(c);
    }

    public Trojuhelnik(Trojuhelnik t)
    {
        this(t.a, t.b, t.c);
    }
    
    public void readValues(){
        System.out.println("" + a + " " + b +  " " + c);
    }
    
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
}
