package GUI_Action;

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

    mainWindow mw;

    public YoneticiWindowAction(YoneticiWindow yntcw) throws IOException {
        // yw=new YoneticiWindow();
        yd = new YöneticiDAO();

        mw = new mainWindow();
        this.yw = yntcw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == yw.getGiris()) {
                boolean bl = true;
                //bl = yd.dogrulama(yw.getTad().getText(), yw.getTsoyad().getText(), yw.getSifre().getText(), yw.getTlfon().getText());

                if (bl == true) {

                    panel = new YöneticiProcessWindow();
                    System.exit(0);
                    mw.getWindow().setContentPane(panel.getPanel());

                    mw.getWindow().repaint();

                } else {
                    JOptionPane.showMessageDialog(yw.getPanel(), "Kullanıcı bilgileri Hatalı");
                }

            }
        } catch (IOException ex) {
            Logger.getLogger(YoneticiWindowAction.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
