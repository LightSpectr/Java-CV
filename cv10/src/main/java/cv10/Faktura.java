package cv10;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 
/**
 *
 * @author makedo01
 */
public class Faktura {
    private LocalDateTime dateCreate;
    private LocalDateTime dateDeadline;
    
    public Faktura(){
        dateCreate = LocalDateTime.now();  
        dateDeadline = dateCreate.plusDays(10);  
    }
    
    public Faktura(LocalDateTime dateCreate){
        this.dateCreate = dateCreate;
        dateDeadline = dateCreate.plusDays(10);  
    }
    
    public String toString(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy"); 
        return "Creation date: " + dtf.format(dateCreate) +"\nDeadline: " +
                dtf.format(dateDeadline);
    }
    
    
}
