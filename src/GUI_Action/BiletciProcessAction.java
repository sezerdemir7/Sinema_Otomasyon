package GUI_Action;

import Controller.BiletciProcessController;
import GUI.BiletciProcesWindow;
import GUI.MüsteriProcessWindow;
import GUI.costumPanel;
import java.awt.Color;
import static java.awt.Color.red;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class BiletciProcessAction implements ActionListener {

    private BiletciProcesWindow bpw;
    private BiletciProcessController bpcontrol;
    private costumPanel panel;

    public BiletciProcessAction(BiletciProcesWindow bpw) {
        bpcontrol = new BiletciProcessController();
        this.bpw = bpw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bpw.getGiris()) {
            System.out.println("Selam");
            try {
                if (bpcontrol.control(bpw) == true) {

                } else {
                    JOptionPane.showMessageDialog(bpw.getPanel(), "Lütfen Ad Soyad Giriniz!");

                }
            } catch (IOException ex) {
                Logger.getLogger(BiletciProcessAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        int sayac=0;
        for(int i = 0; i < bpw.getButons().length; i++){
            if(bpw.getButons()[i].getBackground()==Color.red){
                sayac++;
            }
        }
        
        if(sayac==0){
            
        for (int i = 0; i < bpw.getButons().length; i++) {
            
            
            try {
                if (bpcontrol.control(bpw) == false) {

                    if (e.getSource() == bpw.getButons()[i]) {
                        
                        panel = new BiletciProcesWindow();

                        //mpw.getPanel().remove(mpw.getButons()[2]);
                        bpw.getButons()[i].setBackground(red);
                        bpw.getPanel().setVisible(false);
                        bpw.getPanel().setVisible(true);
                        bpw.getPanel();
                        String s = bpw.getButons()[i].getName();
                        System.err.println(s);
                      

                    }
                } else {

                    break;
                }
            } catch (IOException ex) {
                Logger.getLogger(BiletciProcessAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }
        

    }

}
