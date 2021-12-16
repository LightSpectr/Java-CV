/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenisest;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 *
 * @author Ondrej
 */
public class SoucetCisel2  extends SoucetCisel implements ActionListener{
    public SoucetCisel2(){
        super();
        btn_odesli.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent a){
                odesliVysledek(a);
            }
        });
    }
    public void odesliVysledek(ActionEvent a){
        double vysledek = Double.parseDouble(txtF_1.getText()) + Double.parseDouble(txtF_2.getText());
            lbl_vysledek.setText(Double.toString(vysledek));
    }
}
