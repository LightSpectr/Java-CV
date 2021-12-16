/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cv10;
import java.io.File;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;    
import java.util.concurrent.TimeUnit;
/**
 *
 * @author maked
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
        File file2 = new File("myDir");
        Tool_File.getInfo(file);
        Tool_File.getInfo(file2);
        Tool_File.getDirContentInfo(file2);
        Tool_File.getDirsFiles(file2);
        File[] flist = Tool_File.getFiles(file2);
        for(int i =0; i < flist.length;i++){
            System.out.println(flist[i]);
        }
        flist = Tool_File.getDirs(file2);
        for(int i =0; i < flist.length;i++){
            System.out.println(flist[i]);
        }
    }
    
}
