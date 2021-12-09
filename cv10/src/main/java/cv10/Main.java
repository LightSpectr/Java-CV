/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv10;
import java.io.File;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import java.util.concurrent.TimeUnit;
/**
 *
 * @author makedo01
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss"); 
       LocalDateTime date_time = LocalDateTime.now();  
       System.out.println(dtf.format(date_time));
       
       
       Faktura f = new Faktura(date_time);
       System.out.println(f);
       
       System.out.println("---------------------------------------");
       
       
       File file = new File("myFile.txt");
       Tool_File.getInfo(file);
    }
    
}
