package GUI_Action;

import Controller.SeansEkleWindowController;
import GUI.costumPanel;
import GUI.SeansEkleWİndow;
import GUI.YöneticiProcessWindow;
import GUI.mainWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import DAO.SeansDAO;
import Entity.seans;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class SeansEkleWindowAction implements ActionListener{
   private mainWindow mw;
    private costumPanel panel;
    private SeansEkleWİndow sew;
    private YöneticiProcessWindow ypw;
    private SeansDAO sd;
    private  seans s1;
    private SeansEkleWindowController seansc;
    

    public SeansEkleWindowAction(SeansEkleWİndow sew) {
       seansc=new SeansEkleWindowController();
        mw=new mainWindow();
        sd=new SeansDAO();
        s1=new seans();
        this.sew=sew;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==sew.getGeri()){
            panel= new YöneticiProcessWindow();
            sew.getPanel().setVisible(false);
            sew.getPanel().removeAll();
            sew.getPanel().add(panel.getPanel());
            sew.getPanel().setVisible(true);
            sew.getPanel().repaint();
            
        }
        if(e.getSource()==sew.getKaydet()){
            
            try {
                if(seansc.controlfilm(sew)){
                    JOptionPane.showMessageDialog(sew.getPanel(), "Lütfen Film seçiniz!");
                }
                else try {
                    if(seansc.controlsalon(sew)){
                        JOptionPane.showMessageDialog(sew.getPanel(), "Lütfen Salon seçiniz!");
                    }
                    else{
                        s1.setSaat((String) sew.getCbsaat().getModel().getSelectedItem());
                        s1.setTarih(sew.getDay().getModel().getSelectedItem()+"/"+sew.getMonth().getModel().getSelectedItem()+"/"+sew.getYear().getModel().getSelectedItem());
                        try {
                            s1.setFilm(sew.getList().getSelectedValue().toString());
                        } catch (IOException ex) {
                            Logger.getLogger(SeansEkleWindowAction.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            s1.setSalon(sew.getListseans().getSelectedValue().toString());
                        } catch (IOException ex) {
                            Logger.getLogger(SeansEkleWindowAction.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        s1.setUcret((String) sew.getUcret().getModel().getSelectedItem());
                        try {
                            
                            sd.kaydet(s1);
                        } catch (IOException ex) {
                            Logger.getLogger(SeansEkleWindowAction.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        JOptionPane.showMessageDialog(sew.getPanel(), "Seans ekleme işlemi başarılı.");
                    }
                } catch (IOException ex) {
                    Logger.getLogger(SeansEkleWindowAction.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (IOException ex) {
                Logger.getLogger(SeansEkleWindowAction.class.getName()).log(Level.SEVERE, null, ex);
            }
            
          
            
        }
    }
    
}
