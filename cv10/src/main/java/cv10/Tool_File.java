/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv10;
import java.io.File;
import java.time.Instant;
import java.time.LocalDateTime; 
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;  
/**
 *
 * @author makedo01
 */
public class Tool_File {
    
    public static void getInfo(File f){
        
        if (f.exists()){
            System.out.println("Executable: " + f.canExecute());
            System.out.println("Readable: " + f.canRead());
            System.out.println("Writable: " + f.canWrite());
            System.out.println("Total space: " + f.getTotalSpace());
            System.out.println("Usable space: " + f.getUsableSpace());
            System.out.println("Directory: " + f.isDirectory());
            System.out.println("File: " + f.isFile());
            System.out.println("Hidden: " + f.isHidden());
            Instant instant = Instant.ofEpochMilli(f.lastModified());
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss"); 
            LocalDateTime t = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
            System.out.println("Last modified: " + dtf.format(t));
            System.out.println("Length: " + f.length());
        }
        
    }
    
    public static void getContent(File f){
        
      
    }
    
}
