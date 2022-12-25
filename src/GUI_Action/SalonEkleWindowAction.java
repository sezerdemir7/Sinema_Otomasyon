/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_Action;

import Controller.SalonEkleWindowController;
import GUI.SalonEkleWindow;

import GUI.costumPanel;
import GUI.mainWindow;
import java.awt.event.ActionEvent;
import Entity.salonInfo;
import DAO.SalonDAO;
import GUI.YöneticiProcessWindow;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SalonEkleWindowAction implements ActionListener {

    private mainWindow mw;
    private costumPanel panel;
    private SalonEkleWindow sew;
    private salonInfo s1;
    private SalonDAO sd;
    private SalonEkleWindowController sewc;

    public SalonEkleWindowAction(SalonEkleWindow sew) throws IOException {
        mw = new mainWindow();
        sewc = new SalonEkleWindowController();
        s1 = new salonInfo();
        sd = new SalonDAO();
        this.sew = sew;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == sew.getKaydet()) {
                if (sewc.control(sew) == true) {
                    s1.setNo(sew.getNo().getText());
                    s1.setKat((String) sew.getKat().getModel().getSelectedItem());
                    sd.kaydet(s1);
                    panel = new SalonEkleWindow();
                    sew.getPanel().setVisible(false);
                    sew.getPanel().removeAll();
                    sew.getPanel().add(panel.getPanel());
                    sew.getPanel().setVisible(true);
                    sew.getPanel().repaint();
                    JOptionPane.showMessageDialog(sew.getPanel(), "Salon Eklendi.");
                } else {
                    JOptionPane.showMessageDialog(sew.getPanel(), "Lütfen Salon No Giriniz");
                }

            }
        } catch (IOException ex) {
            Logger.getLogger(SalonEkleWindowAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (e.getSource() == sew.getGeri()) {
                try {
                    if (e.getSource() == sew.getGeri()) {
                        panel = new YöneticiProcessWindow();
                        sew.getPanel().setVisible(false);
                        sew.getPanel().removeAll();
                        sew.getPanel().add(panel.getPanel());
                        sew.getPanel().setVisible(true);
                        sew.getPanel().repaint();

                    }
                } catch (IOException ex) {
                    Logger.getLogger(SalonEkleWindowAction.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(SalonEkleWindowAction.class.getName()).log(Level.SEVERE, null, ex);
        }
//        try {
//            if (e.getSource() == sew.getAnasayfa()) {
//                panel = new mainWindow();
//                sew.getPanel().setVisible(false);
//                sew.getPanel().removeAll();
//                sew.getPanel().add(panel.getPanel());
//                sew.getPanel().setVisible(true);
//                sew.getPanel().repaint();
//            }
//        } catch (IOException ex) {
//            Logger.getLogger(SalonEkleWindowAction.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

}
