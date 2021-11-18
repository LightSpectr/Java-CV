package konverzeDatovychTypu;

public class Main {
    public static void main(String[] args) {
        byte b = 0;
        System.out.println(b);
        b--;
        System.out.println(b);
        b = 127;
        b--;
        System.out.println(b);

        Trojuhelnik tr = new Trojuhelnik();
        tr.setAll(4.5, 6.5, 9.3);

        Object obj = (Object)tr;
        tr = (Trojuhelnik)obj;

        tr.readValue();

        System.out.println(tr);
        System.out.println(tr.toString());

        // tisk_ASCII
        Znaky ascii = new Znaky();
        ascii.tisk_ASCII('b');
        // get_ASCII
        ascii.get_ASCII();
    } 
}