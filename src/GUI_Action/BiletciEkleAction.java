
package GUI_Action;

import Controller.BiletciEkleWindowController;
import DAO.BiletciDAO;
import DAO.DAO_Abstract;
import Entity.biletciInfo;
import GUI.BiletciEkleWindow;
import GUI.YöneticiProcessWindow;
import GUI.costumPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class BiletciEkleAction implements ActionListener{
    
    private costumPanel panel;
    private BiletciEkleWindow bew;
    private BiletciEkleWindowController bewc;
    private DAO_Abstract bltdao;
    private biletciInfo bltc;

    public BiletciEkleAction(BiletciEkleWindow bew) {
        bewc=new BiletciEkleWindowController();
        bltdao=new BiletciDAO();
        bltc=new biletciInfo();
        
        this.bew=bew;
    }
    
     
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        try {
            if(e.getSource()==bew.getGeri()){
                panel=new YöneticiProcessWindow();
                
                bew.getPanel().setVisible(false);
                bew.getPanel().removeAll();
                bew.getPanel().add(panel.getPanel());
                bew.getPanel().setVisible(true);
                bew.getPanel().repaint();
            }
        } catch (IOException ex) {
            Logger.getLogger(BiletciEkleAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            if(e.getSource()==bew.getGiris()){//kaydet butonuna tıklanırsa
                if(bewc.control(bew)==true){
                    bltc.setAd(bew.getTad().getText());
                    bltc.setSoyad(bew.getTsoyad().getText());
                    bltc.setTlfon(bew.getTlfon().getText());
                    bltc.setYsifre(bew.getSifre().getText());
                    bltdao.kaydet(bltc);
                    
                    
                    
                     JOptionPane.showMessageDialog(bew.getPanel(), "Kayıt İşlemi Başarılı");
                }
                else{
                    JOptionPane.showMessageDialog(bew.getPanel(), "Lütfen Bilgileri Tam giriniz");
                }
                
            }
        } catch (IOException ex) {
            Logger.getLogger(BiletciEkleAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
