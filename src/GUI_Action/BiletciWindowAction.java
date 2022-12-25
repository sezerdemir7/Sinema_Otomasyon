/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_Action;

import Controller.BiletciWindowController;
import DAO.BiletciDAO;
import DAO.YöneticiDAO;
import GUI.BiletciProcesWindow;
import GUI.BiletciWindow;
import GUI.YoneticiWindow;
import GUI.YöneticiProcessWindow;
import GUI.costumPanel;
import GUI.mainWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author semih
 */
public class BiletciWindowAction implements ActionListener {

    private BiletciWindow bw;
    private costumPanel panel;
    private BiletciWindowController bwc;
    private BiletciDAO bltcdao;

    mainWindow mw;

    public BiletciWindowAction(BiletciWindow bw) throws IOException {
        // yw=new YoneticiWindow();
        //yd = new YöneticiDAO();
        bltcdao = new BiletciDAO();
        bwc = new BiletciWindowController();
        mw = new mainWindow();
        this.bw = bw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            if (e.getSource() == bw.getGiris()) {

                String dosya = "class Entity.biletciInfo.txt";
                String str = bw.getTad().getText() + " " + bw.getTsoyad().getText() + " " + bw.getTlfon().getText() + " " + bw.getSifre().getText();
                if (bwc.control(bw) == true && bltcdao.sifreKontrol(dosya, str)) {

                    panel = new BiletciProcesWindow();
                    bw.getPanel().setVisible(false);
                    bw.getPanel().removeAll();
                    bw.getPanel().add(panel.getPanel());
                    bw.getPanel().setVisible(true);
                    bw.getPanel().repaint();
                } else {
                    JOptionPane.showMessageDialog(bw.getPanel(), "Kullanıcı Bilgileri Hatalı!");
                }

            }
        } catch (IOException ex) {
            Logger.getLogger(BiletciWindowAction.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (e.getSource() == bw.getGeri()) {
                panel = new mainWindow();
                bw.getPanel().setVisible(false);
                bw.getPanel().removeAll();
                bw.getPanel().add(panel.getPanel());
                bw.getPanel().setVisible(true);
                bw.getPanel().repaint();
            }
        } catch (IOException ex) {
            Logger.getLogger(BiletciWindowAction.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
