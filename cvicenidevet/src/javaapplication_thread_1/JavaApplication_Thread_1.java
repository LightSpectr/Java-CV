/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication_thread_1;

/**
 *
 * @author Ondrej
 */

public class JavaApplication_Thread_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread_My th1 = new Thread_My();
        druhyThread th2 = new druhyThread();
        th1.start();
        
        try {
            th1.join();
        }
        catch (InterruptedException e) {
        }
        th2.start();
    }
    
}

