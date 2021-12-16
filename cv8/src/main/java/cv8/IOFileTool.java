/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv8;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
/**
 *
 * @author makedo01
 */
public class IOFileTool {
    
    public static int pocetznaku_file(String filename) 
            throws FileNotFoundException, IOException {
        File file = new File(filename);
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

        int charCount = 0;
        String data;        
        while((data = reader.readLine()) != null) {
           charCount += data.length();                        
        }
        reader.close();
        input.close();
        fileStream.close();
        return charCount;
    }
    
    public static void copy_file(String filename1, String filename2) 
            throws FileNotFoundException, IOException{
        File file1 = new File(filename1);
        File file2 = new File(filename2);
        FileInputStream fileInStream = new FileInputStream(file1);
        InputStreamReader input = new InputStreamReader(fileInStream);
  
        BufferedReader reader = new BufferedReader(input);
        
        FileOutputStream fileOutStream = new FileOutputStream(file2);
        OutputStreamWriter output = new OutputStreamWriter(fileOutStream);
        BufferedWriter writer = new BufferedWriter(output);
        
        
        String data;       
        while((data = reader.readLine()) != null){
           
            if(! ((data.isBlank() || data.isEmpty()) )){
                data = data.trim();
                output.write(data+'\n');
              
            }
        
        }
        writer.close();
        output.close();
        fileOutStream.close();
        reader.close();
        input.close();
        fileInStream.close();
        
    }
    
    public static void osoba_serializace(Osoba osoba, String filename) 
            throws IOException{
        FileOutputStream fileOut = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(osoba);
        out.close();
        fileOut.close();
        
    }
    
     public static void write_datum_filebin(Datum datum, String filename) 
            throws IOException{
        FileOutputStream fileOut = new FileOutputStream(filename);
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(datum);
        out.close();
        fileOut.close();
        
    }
     
    public static Osoba osoba_deserializace(String filename) 
            throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream fileIn = new FileInputStream(filename);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        
        Osoba o = (Osoba)in.readObject();
        in.close();
        fileIn.close();
        return o;
    }
    
    public static Datum read_datum_filebin(String filename) 
            throws FileNotFoundException, IOException, ClassNotFoundException{
        FileInputStream fileIn = new FileInputStream(filename);
        ObjectInputStream in = new ObjectInputStream(fileIn);
        
        Datum d = (Datum)in.readObject();
        in.close();
        fileIn.close();
        return d;
    }
}
