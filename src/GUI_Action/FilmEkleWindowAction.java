
package GUI_Action;

import DAO.filmDAO;
import Entity.filmInfo;
import GUI.FilmEkleWindow;
import GUI.YöneticiProcessWindow;
import GUI.costumPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FilmEkleWindowAction implements ActionListener{
    private filmDAO film;
    private FilmEkleWindow few;
    private filmInfo f1;
    private costumPanel panel;
   

    public FilmEkleWindowAction(FilmEkleWindow few) {
        film=new filmDAO();
        f1=new filmInfo();
       
        this.few=few;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==few.getEkle()){
            f1.setAd(few.getAd().getText());
            f1.setCategory((String) few.getKatagory().getModel().getSelectedItem());
            f1.setSüre(few.getSüre().getText());
            f1.setType((String) few.getTür().getModel().getSelectedItem());
            try {
                film.kaydet(f1);
            } catch (IOException ex) {
                Logger.getLogger(FilmEkleWindowAction.class.getName()).log(Level.SEVERE, null, ex);
            }
            panel=new FilmEkleWindow();
            
            few.getPanel().setVisible(false);
            few.getPanel().removeAll();
            few.getPanel().add(panel.getPanel());
            few.getPanel().setVisible(true);
            few.getPanel().repaint();
           
        }
        if(e.getSource()==few.getGeri()){
           panel=new YöneticiProcessWindow();
           few.getPanel().setVisible(false);
           few.getPanel().removeAll();
           few.getPanel().add(panel.getPanel());
           few.getPanel().setVisible(true);
           few.getPanel().repaint();
            
        }
    }
    
}
