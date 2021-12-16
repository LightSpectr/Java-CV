/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cv2;

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