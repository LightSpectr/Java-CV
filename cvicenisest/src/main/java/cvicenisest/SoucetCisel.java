/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cvicenisest;
import java.awt.*;
import java.awt.event.*;


/**
 *
 * @author Ondrej
 */
public class SoucetCisel extends Frame implements ActionListener{
    protected Button btn_odesli;
    protected Label lbl_vysledek;
    protected Label lbl_plus;
    protected TextField txtF_1;
    protected TextField txtF_2;
        public SoucetCisel(){
            try{
                setTitle("Souèet dvou èísel");
                setLayout(new FlowLayout());
                setSize(600, 100);
                //
                btn_odesli = new Button("Odešli");
                btn_odesli.addActionListener(this);
                lbl_vysledek = new Label("Výsledek");
                lbl_vysledek.setSize(100, 100);
                txtF_1 = new TextField();
                txtF_1.setColumns(5);
                txtF_2 = new TextField();
                txtF_2.setColumns(5);
                lbl_plus = new Label(" + ");
                //
                add(txtF_1);
                add(lbl_plus);
                add(txtF_2);
                add(btn_odesli);
                add(lbl_vysledek);
                //
                addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent we){
                        System.exit(0);
                    }
                });
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
        @Override
        public void actionPerformed(ActionEvent e){
            double vysledek = Double.parseDouble(txtF_1.getText()) + Double.parseDouble(txtF_2.getText());
            lbl_vysledek.setText(Double.toString(vysledek));
        }
}
