/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cv8;
import java.time.LocalDate;
import java.io.Serializable;
/**
 *
 * @author makedo01
 */
public class Osoba implements Serializable{
    private String jmeno;
    private String prijmeni;
    private int vek;
    private Datum datumnarozeni;
    
    public Osoba(String jmeno, String prijmeni, int den, int mesic, int rok) 
            throws Exception{
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        
        LocalDate time = LocalDate.now();
        
        datumnarozeni= new Datum(den, mesic, rok);
        vek  = time.getYear()- rok;
    
    }
    public String toString() {
        return "Jmeno: " + jmeno + "\nPrijmeni: " + prijmeni + "\nVek: " + 
                vek + "\nDatum narozeni: " +datumnarozeni;
    }
}
