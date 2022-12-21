package GUI_Action;

import GUI.costumPanel;
import GUI.mainWindow;
import GUI.RemoveWİndow;
import DAO.filmDAO;
import Entity.filmInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RemoveWindowAction implements ActionListener{
    private mainWindow mw;
    private costumPanel panel;
    private RemoveWİndow rw;
    private filmDAO flm;
    private filmInfo fl;

    public RemoveWindowAction(RemoveWİndow rw) {
        mw=new mainWindow();  
        flm=new filmDAO();
        fl=new filmInfo();
        this.rw=rw;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==rw.getFilm()){
            String dosya=String.valueOf(fl.getClass())+".txt";
            try {
                flm.sil(dosya, rw.getList().getSelectedValue().toString());
                        
                        } catch (IOException ex) {
                Logger.getLogger(RemoveWindowAction.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
}
