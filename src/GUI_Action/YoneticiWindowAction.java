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
import java.util.logging.Level;
import java.util.logging.Logger;


public class YoneticiWindowAction implements ActionListener{
     private YoneticiWindow yntcw;
    private costumPanel panel;
   
    
    mainWindow mw;
    
    
    public YoneticiWindowAction(YoneticiWindow yntcw) throws IOException {
       // yw=new YoneticiWindow();
       
        mw=new  mainWindow();
        this.yntcw=yntcw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         try {
             if(e.getSource()==yntcw.getGiris()){
                 boolean bl = true ;
                
                
                 
                 if(bl==true){
                     panel= new YöneticiProcessWindow();
                     mw.getWindow().setContentPane(panel.getPanel());                  
                     mw.getWindow().repaint();
                     
                 }
                 else{
                     JOptionPane.showMessageDialog(yntcw.getPanel(), "Kullanıcı bilgileri Hatalı");
                 }
                 
             } } catch (IOException ex) {
             Logger.getLogger(YoneticiWindowAction.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }
    
}
