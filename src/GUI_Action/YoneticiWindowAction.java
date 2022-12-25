package GUI_Action;

import Controller.YöneticiWindowController;
import GUI.YoneticiWindow;
import GUI.mainWindow;
import GUI.costumPanel;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import DAO.YöneticiDAO;
import java.io.IOException;
import GUI.YoneticiWindow;
import GUI.YöneticiProcessWindow;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;

public class YoneticiWindowAction implements ActionListener {

    private YoneticiWindow yw;
    private costumPanel panel;
    private YöneticiDAO yd;
    private YöneticiWindowController ywc;
    mainWindow mw;

    public YoneticiWindowAction(YoneticiWindow yntcw) throws IOException {
        ywc = new YöneticiWindowController();
        yd = new YöneticiDAO();
        mw = new mainWindow();
        this.yw = yntcw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == yw.getGiris()) {
//                boolean bl = true;
                //bl = yd.dogrulama(yw.getTad().getText(), yw.getTsoyad().getText(), yw.getSifre().getText(), yw.getTlfon().getText());

                String dosya = "yönetici.txt";

                if (ywc.control(yw)) {
                    String str = yw.getTad().getText() + " " + yw.getTsoyad().getText() + " " + yw.getTlfon().getText() + " " + yw.getSifre().getText();
                    if (yd.sifreKontrol(dosya, str)) {
                        panel = new YöneticiProcessWindow();
                        yw.getPanel().setVisible(false);
                        yw.getPanel().removeAll();
                        yw.getPanel().add(panel.getPanel());
                        yw.getPanel().setVisible(true);
                        yw.getPanel().repaint();
                    }
                    else{
                         JOptionPane.showMessageDialog(yw.getPanel(), "Kullanıcı bilgileri Hatalı");
                    }

                } else {
                    JOptionPane.showMessageDialog(yw.getPanel(), "Kullanıcı bilgileri Hatalı");
                }

            }
        } catch (IOException ex) {
            Logger.getLogger(YoneticiWindowAction.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            if (e.getSource() == yw.getGeri()) {
                panel = new mainWindow();
                yw.getPanel().setVisible(false);
                yw.getPanel().removeAll();
                yw.getPanel().add(panel.getPanel());
                yw.getPanel().setVisible(true);
                yw.getPanel().repaint();
            }
        } catch (IOException ex) {
            Logger.getLogger(YoneticiWindowAction.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
