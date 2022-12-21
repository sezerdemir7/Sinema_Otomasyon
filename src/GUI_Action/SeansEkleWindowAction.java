package GUI_Action;

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


public class SeansEkleWindowAction implements ActionListener{
   private mainWindow mw;
    private costumPanel panel;
    private SeansEkleWİndow sew;
    private YöneticiProcessWindow ypw;
    private SeansDAO sd;
    private  seans s1;
    

    public SeansEkleWindowAction(SeansEkleWİndow sew) {
        ypw=new YöneticiProcessWindow();
        mw=new mainWindow();
        sd=new SeansDAO();
        s1=new seans();
        this.sew=sew;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==sew.getGeri()){
            
            mw.getWindow().setContentPane(ypw.getPanel());
            mw.getWindow().repaint();
            
        }
        if(e.getSource()==sew.getKaydet()){
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
            
        }
    }
    
}
