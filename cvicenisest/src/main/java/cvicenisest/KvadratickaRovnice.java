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
public class KvadratickaRovnice  extends Frame {
        private Label nadpis,rovnice_a, rovnice_b, rovnice_c, rovnice_x, x1, x2, vysledek_y, text_y, Koren1, Koren2;
        private TextField A, B, C, X;
        private Button pocitej;

                public KvadratickaRovnice() { 
                          setTitle("Øešení kvadratické rovnice");
                          setSize(600,600); 
                          nadpis = new Label("Spoèítání y pro zadané x, urèení koøenù rovnice");
                          nadpis.setBounds(150,50,850,20);
                          add(nadpis);
                          rovnice_a = new Label("a = ");
                          rovnice_a.setBounds(65,100,85,20);
                          add(rovnice_a);
                          rovnice_b = new Label("b =");
                          rovnice_b.setBounds(65,130,85,20);
                          add(rovnice_b);
                          rovnice_c = new Label("c =");
                          rovnice_c.setBounds(65,160,85,20);
                          add(rovnice_c);
                          rovnice_x = new Label("x =");
                          rovnice_x.setBounds(65,190,85,20);
                          add(rovnice_x);
                          x1 = new Label("x1 =");
                          x1.setBounds(65,220,85,20);
                          add(x1);
                          x2 = new Label("x2 =");
                          x2.setBounds(65,250,85,20);
                          add(x2);
                          text_y = new Label("y =");
                          text_y.setBounds(65,280,85,20);
                          add(text_y);
                          A = new TextField("");
                          A.setBounds(150,100,75,20);
                          add(A);
                          B = new TextField("");
                          B.setBounds(150,130,75,20);
                          add(B);
                          C = new TextField("");
                          C.setBounds(150,160,75,20);
                          add(C);
                          X = new TextField("");
                          X.setBounds(150,190,75,20);
                          add(X);
                          Koren1 = new Label("");
                          add(Koren1);
                          Koren2 = new Label("");
                          add(Koren2);
                          vysledek_y= new Label("");
                          add(vysledek_y);
                          pocitej = new Button("Vypoèítej"); 
                          pocitej.setBounds(150,270,60,40);
                          add(pocitej);
                          setVisible(true); 
               pocitej.addActionListener(new ActionListener(){
               public void actionPerformed(ActionEvent e) { 
                    double a = Double.parseDouble(A.getText());
                    double b = Double.parseDouble(B.getText());
                    double c = Double.parseDouble(C.getText());
                    double x = Double.parseDouble(X.getText());
                    double y = (a*Math.pow(2,x))+(b*x)+c;
                    double koren1,koren2;
                    double diskriminant = b*b-4*a*c;
             if(diskriminant < 0){
             diskriminant = -diskriminant; 
             }
             if(diskriminant == 0){
                    koren1 = (-b+Math.sqrt(diskriminant))/(2*a);
                    koren2 = (-b-Math.sqrt(diskriminant))/(2*a);
                 }
             else{
                 koren1 = (-b+Math.sqrt(diskriminant))/(2*a);
                 koren2 = (-b-Math.sqrt(diskriminant))/(2*a);           
                 }
                    Koren1.setBounds(150,220,200,20);
                    Koren1.setText(Double.toString(koren1));
                    Koren2.setBounds(150,250,200,20);
                    Koren2.setText(Double.toString(koren2));
                    vysledek_y.setBounds(150,280,200,20);
                    vysledek_y.setText(Double.toString(y));
                    }
                }); 
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }            
        });
    }       
}
       


