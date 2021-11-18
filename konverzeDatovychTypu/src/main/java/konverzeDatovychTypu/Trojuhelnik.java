package konverzeDatovychTypu;

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

    public void readValue() {
        System.out.println("" + a + " " + b + " " + c);
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
            return a == b && b == c;
    }

    public boolean IsRovnoramenny()
    {
            return a == b || b == c || c == a;
    }  
}
