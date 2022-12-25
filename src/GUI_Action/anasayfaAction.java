/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_Action;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import GUI.anasayfa;
import GUI.costumPanel;
/**
 *
 * @author muhdm
 */
public class anasayfaAction implements ActionListener{
    private costumPanel panel;
    private anasayfa ana;

    public anasayfaAction(anasayfa ana) {
        this.ana=ana;
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==ana.getBtn1()){

            ana.getPanel().setVisible(false);
            ana.getPanel().remove(ana.getBtn1());
            ana.getPanel().remove(ana.getImg1());
            ana.getPanel().add(ana.getImg2());
            ana.getPanel().add(ana.getBnt2());
            ana.getPanel().setVisible(true);
            ana.getPanel().repaint();
            
        }
        if(e.getSource()==ana.getBnt2()){
           
            ana.getPanel().setVisible(false);
            ana.getPanel().remove(ana.getBnt2());
            ana.getPanel().remove(ana.getImg2());
            ana.getPanel().add(ana.getImg3());
            ana.getPanel().add(ana.getBtn3());
            ana.getPanel().setVisible(true);
            ana.getPanel().repaint();
            
        }
        if(e.getSource()==ana.getBtn3()){
            ana.getPanel().setVisible(false);
            ana.getPanel().remove(ana.getBtn3());
            ana.getPanel().remove(ana.getImg3());
            ana.getPanel().add(ana.getImg4());
            ana.getPanel().add(ana.getBtn4());
            ana.getPanel().setVisible(true);
            ana.getPanel().repaint();
        }
        if(e.getSource()==ana.getBtn4()){
            ana.getPanel().setVisible(false);
            ana.getPanel().remove(ana.getBtn4());
            ana.getPanel().remove(ana.getImg4());
            ana.getPanel().add(ana.getImg1());
            ana.getPanel().add(ana.getBtn1());
            ana.getPanel().setVisible(true);
            ana.getPanel().repaint();
        }
    }
    
}
