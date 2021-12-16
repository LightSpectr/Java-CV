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
public class Thread_My extends Thread {

    public Thread_My() {
        ;
    }
    
    public Thread_My(String thread_name) {
        super(thread_name);
    }
    
    // ----

    @Override
    public void run() {
        //super.run();         
        char z = 'a';
        while (z <= 'z') {
            System.out.print("" + z);
            z++;
             try {Thread.sleep(500); }
             catch (InterruptedException e) {
            ;
        }
        }
    }
        
}
