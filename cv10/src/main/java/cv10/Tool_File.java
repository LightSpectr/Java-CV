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
            System.out.println("Directory: " + f.isDirectory());
            System.out.println("File: " + f.isFile());
            System.out.println("Hidden: " + f.isHidden());
            Instant instant = Instant.ofEpochMilli(f.lastModified());
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss"); 
            LocalDateTime t = LocalDateTime.ofInstant(instant, ZoneOffset.UTC);
            System.out.println("Last modified: " + dtf.format(t));
        }
        
    }
    
    public static void getDirContentInfo(File f){
        if(f.isDirectory() == true){
            File[] listOfFiles = f.listFiles();
            for (int i = 0; i < listOfFiles.length; i++){
                if (listOfFiles[i].isFile()) {
                    System.out.println(listOfFiles[i].getName() + " - File");
                } else if (listOfFiles[i].isDirectory()) {
                    System.out.println(listOfFiles[i].getName() + " - Dir");
                }
            }
        }
        else{
            System.out.println("Is not a directory.");
        }
      
    }
    
    public static void getDirsFiles(File f){
        if(f.isDirectory() == true){
            File[] listOfDirFiles = f.listFiles();
            System.out.println("Directories:");
            for (int i = 0; i < listOfDirFiles.length; i++){
               if (listOfDirFiles[i].isDirectory()) {
                    System.out.println("\t"+listOfDirFiles[i].getName());
                }
            }
            System.out.println("Files:");
            for (int i = 0; i < listOfDirFiles.length; i++){
               if (listOfDirFiles[i].isFile()) {
                    System.out.println("\t"+listOfDirFiles[i].getName());
                }
            }
        }
        else{
            System.out.println("Is not a directory.");
        }
    }
    
    public static File[] getFiles(File f){
         if(f.isDirectory() == true){
            File[] listOfDirFiles = f.listFiles();
            int filecount = 0;
            for (int i = 0; i < listOfDirFiles.length; i++){
               if (listOfDirFiles[i].isFile()) {
                    filecount++;
                }
               
            }
            File[] listOfFiles = new File[filecount];
            int index = 0 ;
            for (int i = 0; i < listOfDirFiles.length; i++){
               if (listOfDirFiles[i].isFile()) {
                   listOfFiles[index] = listOfDirFiles[i];
                   index++;
                }
               
            }
            return listOfFiles;
            
        }
        else{
            System.out.println("Is not a directory.");
            return null;
        }
        
    }
    
    public static File[] getDirs(File f){
         if(f.isDirectory() == true){
            File[] listOfDirFiles = f.listFiles();
            int filecount = 0;
            for (int i = 0; i < listOfDirFiles.length; i++){
               if (listOfDirFiles[i].isDirectory()) {
                    filecount++;
                }
               
            }
            File[] listOfFiles = new File[filecount];
            int index = 0 ;
            for (int i = 0; i < listOfDirFiles.length; i++){
               if (listOfDirFiles[i].isDirectory()) {
                   listOfFiles[index] = listOfDirFiles[i];
                   index++;
                }
               
            }
            return listOfFiles;
            
        }
        else{
            System.out.println("Is not a directory.");
            return null;
        }
        
    }
    
}
