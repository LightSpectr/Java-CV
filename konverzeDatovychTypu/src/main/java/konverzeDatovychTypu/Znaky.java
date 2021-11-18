package konverzeDatovychTypu;

public class Znaky {
    public void tisk_ASCII(char ch) {
        int ascii = (int)ch;
        System.out.println("The ASCII value of " + ch + " is: " + ascii);
    }

    public void get_ASCII() {
        for(char i = 33; i <= 126; i++) {
            this.tisk_ASCII(i);
        }
    }
}