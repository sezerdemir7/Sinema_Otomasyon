/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_Action;

import GUI.SalonEkleWindow;

import GUI.costumPanel;
import GUI.mainWindow;
import java.awt.event.ActionEvent;
import Entity.salonInfo;
import DAO.SalonDAO;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SalonEkleWindowAction implements ActionListener{
     private mainWindow mw;
    private costumPanel panel;
    private SalonEkleWindow sew;
    private salonInfo s1;
    private SalonDAO sd;
    
    public SalonEkleWindowAction(SalonEkleWindow sew) throws IOException {
        mw=new mainWindow();
        s1=new salonInfo();
        sd=new SalonDAO();
        this.sew=sew;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
         try {
             if(e.getSource()==sew.getKaydet()){
                 s1.setNo(sew.getNo().getText());
                 s1.setKat((String) sew.getKat().getModel().getSelectedItem());
                 sd.kaydet(s1);
             }} catch (IOException ex) {
             Logger.getLogger(SalonEkleWindowAction.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
}
