package GUI_Action;

import Controller.FilmEkleController;
import DAO.DAO_Abstract;
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
import javax.swing.JOptionPane;

public class FilmEkleWindowAction implements ActionListener {

    private DAO_Abstract film;
    private FilmEkleWindow few;
    private filmInfo f1;
    private costumPanel panel;
    private FilmEkleController fec;

    public FilmEkleWindowAction(FilmEkleWindow few) {
        fec = new FilmEkleController();
        film = new filmDAO();//plmrp
        f1 = new filmInfo();

        this.few = few;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == few.getEkle()) {

            if (fec.control(few) == true) {
                f1.setAd(few.getAd().getText());
                f1.setCategory((String) few.getKatagory().getModel().getSelectedItem());
                f1.setSüre(few.getSüre().getText());
                f1.setType((String) few.getTür().getModel().getSelectedItem());
                try {
                    film.kaydet(f1);
                } catch (IOException ex) {
                    Logger.getLogger(FilmEkleWindowAction.class.getName()).log(Level.SEVERE, null, ex);
                }
                panel = new FilmEkleWindow();

                few.getPanel().setVisible(false);
                few.getPanel().removeAll();
                few.getPanel().add(panel.getPanel());
                few.getPanel().setVisible(true);
                few.getPanel().repaint();
                JOptionPane.showMessageDialog(few.getPanel(), "Film Eklendi.");
            }
            else{
                 JOptionPane.showMessageDialog(few.getPanel(), "Film bilgileri eksik!");
            }

        }
        if (e.getSource() == few.getGeri()) {
            panel = new YöneticiProcessWindow();
            few.getPanel().setVisible(false);
            few.getPanel().removeAll();
            few.getPanel().add(panel.getPanel());
            few.getPanel().setVisible(true);
            few.getPanel().repaint();

        }
    }

}
