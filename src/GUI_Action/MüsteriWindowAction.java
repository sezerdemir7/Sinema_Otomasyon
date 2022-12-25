package GUI_Action;

import GUI.MüsteriProcessWindow;
import GUI.MüsteriWindow;
import GUI.costumPanel;
import Controller.MüsteriGirisController;
import Entity.musteri;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import DAO.müsteriDAO;
import GUI.mainWindow;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MüsteriWindowAction implements ActionListener {

    private costumPanel panel;
    private MüsteriWindow müw;
    private musteri m1;
    private MüsteriGirisController mgc;
    private müsteriDAO mdao;

    public MüsteriWindowAction(MüsteriWindow müw) {
       mdao=new  müsteriDAO();
        mgc = new MüsteriGirisController();
        m1 = new musteri();
        this.müw = müw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == müw.getGrs()) {

            if (mgc.control(müw) == false) {
                JOptionPane.showMessageDialog(müw.getPanel(), "Ad,Soyad ve Telefon Numaranzı eksiksiz Giriniz");//eger ad soyadve telefon bilgileri girilmemmişse
            } else {
                m1.setAd(müw.getFad().getText());
                m1.setSoyad(müw.getFsoyad().getText());
                m1.setTlfon(müw.getFtlfon().getText());
                try {
                    mdao.kaydet(m1);
                } catch (IOException ex) {
                    Logger.getLogger(MüsteriWindowAction.class.getName()).log(Level.SEVERE, null, ex);
                }
                panel = new MüsteriProcessWindow();

                müw.getPanel().setVisible(false);
                müw.getPanel().removeAll();
                müw.getPanel().add(panel.getPanel());
                müw.getPanel().setVisible(true);
                müw.getPanel().repaint();
            }
        }
        try {
            if(e.getSource()==müw.getGeri()){
                panel = new mainWindow();
                
                müw.getPanel().setVisible(false);
                müw.getPanel().removeAll();
                müw.getPanel().add(panel.getPanel());
                müw.getPanel().setVisible(true);
                müw.getPanel().repaint();
            
            }
        } catch (IOException ex) {
            Logger.getLogger(MüsteriWindowAction.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
