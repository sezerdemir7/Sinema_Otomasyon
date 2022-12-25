package GUI_Action;

import Controller.RemoveWindowController;
import GUI.costumPanel;
import GUI.mainWindow;
import GUI.RemoveWİndow;
import DAO.filmDAO;
import DAO.SalonDAO;
import DAO.SeansDAO;
import Entity.filmInfo;
import Entity.salonInfo;
import Entity.seans;
import GUI.YöneticiProcessWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RemoveWindowAction implements ActionListener {

    private mainWindow mw;
    private costumPanel panel;
    private RemoveWİndow rw;
    private filmDAO flm;
    private filmInfo fl;
    private SalonDAO sln;
    private salonInfo s1;
    private SeansDAO seansdao;
    private seans seans;
    private RemoveWindowController rwc;

    public RemoveWindowAction(RemoveWİndow rw) {
        rwc = new RemoveWindowController();
        mw = new mainWindow();
        flm = new filmDAO();
        fl = new filmInfo();
        sln = new SalonDAO();
        s1 = new salonInfo();
        seansdao = new SeansDAO();
        seans = new seans();
        this.rw = rw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rw.getFilm()) {
            try {
                if (rwc.controlfilm(rw) == true) {

                    panel = new RemoveWİndow();
                    String dosya = String.valueOf(fl.getClass()) + ".txt";
                    try {
                        flm.sil(dosya, rw.getList().getSelectedValue().toString());

                    } catch (IOException ex) {
                        Logger.getLogger(RemoveWindowAction.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    rw.getPanel().removeAll();
                    rw.getPanel().setVisible(false);
                    rw.getPanel().add(panel.getPanel());
                    rw.getPanel().setVisible(true);
                    rw.getPanel().repaint();

                } else {
                    JOptionPane.showMessageDialog(rw.getPanel(), "Lütfen Silinecek Film'i Seçin");
                }
            } catch (IOException ex) {
                Logger.getLogger(RemoveWindowAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == rw.getSalon()) {
            try {
                if (rwc.controlsalon(rw) == true) {

                    panel = new RemoveWİndow();
                    String dosya2 = String.valueOf(s1.getClass()) + ".txt";
                    try {
                        sln.sil(dosya2, rw.getListSalon().getSelectedValue().toString());
                    } catch (IOException ex) {
                        Logger.getLogger(RemoveWindowAction.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    rw.getPanel().removeAll();
                    rw.getPanel().setVisible(false);
                    rw.getPanel().add(panel.getPanel());
                    rw.getPanel().setVisible(true);
                    rw.getPanel().repaint();
                } else {
                    JOptionPane.showMessageDialog(rw.getPanel(), "Lütfen Silinecek Salonu Seçin");
                }
            } catch (IOException ex) {
                Logger.getLogger(RemoveWindowAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (e.getSource() == rw.getSeans()) {
            try {
                if (rwc.controlseans(rw) == true) {
                    panel = new RemoveWİndow();
                    String dosya3 = String.valueOf(seans.getClass()) + ".txt";
                    try {
                        seansdao.sil(dosya3, rw.getListSeans().getSelectedValue().toString());
                    } catch (IOException ex) {
                        Logger.getLogger(RemoveWindowAction.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    rw.getPanel().removeAll();
                    rw.getPanel().setVisible(false);
                    rw.getPanel().add(panel.getPanel());
                    rw.getPanel().setVisible(true);
                    rw.getPanel().repaint();
                } else {
                    JOptionPane.showMessageDialog(rw.getPanel(), "Lütfen Silinecek Seansı Seçin");
                }
            } catch (IOException ex) {
                Logger.getLogger(RemoveWindowAction.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (e.getSource() == rw.getGeri()) {
            panel = new YöneticiProcessWindow();
            rw.getPanel().removeAll();
            rw.getPanel().setVisible(false);
            rw.getPanel().add(panel.getPanel());
            rw.getPanel().setVisible(true);
            rw.getPanel().repaint();
        }
    }

}
