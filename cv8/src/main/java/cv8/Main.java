/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv8;
import java.io.*;
import java.nio.ByteBuffer;
import java.util.Scanner;
import java.io.File;
/**
 *
 * @author makedo01
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        firstTask();
        try{
            System.out.println("----------------------------------");
            System.out.println(IOFileTool.pocetznaku_file("TextFile.txt"));
            IOFileTool.copy_file("TextFile1.txt","TextFile2.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("no file");
        
        }
        catch(IOException e){
            System.out.println("IO error");
        }
           
        try{
            System.out.println("----------------------------------");
            Osoba osoba = new Osoba("Sample", "Name", 22, 8, 1996);
        
            IOFileTool.osoba_serializace(osoba, "osoba.bin");
            Osoba osoba2 = IOFileTool.osoba_deserializace("osoba.bin");
            System.out.println(osoba2);
            Datum d = new Datum(10, 6, 2007);
            IOFileTool.write_datum_filebin(d, "datum.bin");
            Datum d2 = IOFileTool.read_datum_filebin("datum.bin");
            System.out.println("----------------------------------");
            System.out.println(d2);
        }catch(IOException e){
            System.out.println("IO error");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        
        
        
    }
    
    
    public static byte[] longToBytes(long x) {
        ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
        buffer.putLong(x);
        return buffer.array();
    }

    public static long bytesToLong(byte[] bytes) {
        ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
        buffer.put(bytes);
        buffer.flip();
        return buffer.getLong();
    }
    
    public static byte[] intToBytes(int x) {
        ByteBuffer buffer = ByteBuffer.allocate(Integer.BYTES);
        buffer.putInt(x);
        return buffer.array();
    }

    public static int bytesToInt(byte[] bytes) {
        ByteBuffer buffer = ByteBuffer.allocate(Integer.BYTES);
        buffer.put(bytes);
        buffer.flip();
        return buffer.getInt();
    }
    
    
    public static void firstTask(){
        int a  = 65;
        long b = 66;
       
        try(FileOutputStream output = new FileOutputStream("myFile.txt")){
            output.write(intToBytes(a));
            output.write(longToBytes(b));
            
            
        }catch(FileNotFoundException e){
            System.out.println("no file");
        }
        catch(IOException e){
            System.out.println("IO error");
        }
        
        
        try(FileInputStream input = new FileInputStream("myFile.txt")){
            byte[] in;
            int io = 0;
            long lo = 0;
            
            in = input.readNBytes(4);
            io = bytesToInt(in);
            System.out.println(io);
            in = input.readNBytes(8);
            lo = bytesToLong(in);
            System.out.println(lo);
            
            
        }catch(FileNotFoundException e){
            System.out.println("no file");
        }
        catch(IOException e){
            System.out.println("IO error");
        }
        
        try(FileInputStream input = new FileInputStream("myFile.txt")){
            byte[] in;
            int io = 0;
            long lo = 0;
            
            in = input.readNBytes(8);
            lo = bytesToLong(in);
            System.out.println(lo);
            in = input.readNBytes(4);
            io = bytesToInt(in);
            System.out.println(io);
            
            
        }catch(FileNotFoundException e){
            System.out.println("no file");
        }
        catch(IOException e){
            System.out.println("IO error");
        }
    }
}
