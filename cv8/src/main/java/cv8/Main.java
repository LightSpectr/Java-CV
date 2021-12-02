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
       
        //firstTask();
        try{
            System.out.println(IOFileTool.pocetznaku_file("TextFile.txt"));
        }
        catch(FileNotFoundException e){
             System.out.println("no file");
        
        }
        catch(IOException e){
            System.out.println("IO error");
        }
        
        try{
            IOFileTool.copy_file("TextFile1.txt","TextFile2.txt");
        }
        catch(FileNotFoundException e){
             System.out.println("no file");
        
        }
        catch(IOException e){
            System.out.println("IO error");
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
        buffer.flip();//need flip 
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
        buffer.flip();//need flip 
        return buffer.getInt();
    }
    
    
    public static void firstTask(){
        int a  = 65;
        long b = 66;
        try{File f = new File("filename.txt");
            Scanner myReader = new Scanner(f);
            int i = 0;
            while (myReader.hasNext()) {
                i++;
            }
            System.out.println(i);
        }
        catch(FileNotFoundException e){
            System.out.println("no file");
        }
        
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
