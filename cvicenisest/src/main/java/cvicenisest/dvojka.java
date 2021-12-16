/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenisest;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// radio button ? 

/**
 *
 * @author Ondrej
 */
public class dvojka extends Frame{
    private Frame frame;
    private Button button_ahoj;
    private TextField texty;
    private Checkbox klikni;
    private Label napis;
    private Checkbox naklikej;
    public dvojka() {
    super.setTitle("ukazkovy set prikladu v GUI");
    napis = new Label("zde je label");
    button_ahoj = new Button("Mackni me");
    texty = new TextField(20);
    klikni = new Checkbox();

    add(button_ahoj);
    add(napis);
    add(texty);
    add(klikni);
    add(naklikej);
    this.setSize(400, 400);
    addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }            
        });  
    } 
}
