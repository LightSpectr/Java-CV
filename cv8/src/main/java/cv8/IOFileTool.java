/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv8;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
/**
 *
 * @author makedo01
 */
public class IOFileTool {
    
    int pocetznaku_file(String filename) throws FileNotFoundException{
       
      File f = new File(filename);
      Scanner myReader = new Scanner(f);
      int i = 0;
       while (myReader.hasNext()) {
        i++;
      }
      return i;
    }
    
    
    
}
