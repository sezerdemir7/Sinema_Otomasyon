/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_Action;

import GUI.BiletciEkleWindow;
import GUI.YöneticiProcessWindow;
import GUI.costumPanel;
import GUI.mainWindow;
import GUI.FilmEkleWindow;
import GUI.RemoveWİndow;
import GUI.SalonEkleWindow;
import GUI.SeansEkleWİndow;
import GUI.YoneticiWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author muhdm
 */
public class YöneticiProcessAction implements ActionListener {

    private mainWindow mw;
    private costumPanel panel;
    private YöneticiProcessWindow ypw;

    public YöneticiProcessAction(YöneticiProcessWindow ypw) {
        mw = new mainWindow();
        this.ypw = ypw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ypw.getFilmEkle()) {

            panel = new FilmEkleWindow();//plmr
            ypw.getPanel().setVisible(false);
            ypw.getPanel().removeAll();
            ypw.getPanel().add(panel.getPanel());
            ypw.getPanel().setVisible(true);
            ypw.getPanel().repaint();
//            mw.getWindow().setContentPane(panel.getPanel());
//            mw.getWindow().repaint();

        }

        if (e.getSource() == ypw.getSeansEkle()) {
            panel = new SeansEkleWİndow();
            ypw.getPanel().setVisible(false);
            ypw.getPanel().removeAll();
            ypw.getPanel().add(panel.getPanel());
            ypw.getPanel().setVisible(true);
            ypw.getPanel().repaint();

//            mw.getWindow().setContentPane(panel.getPanel());
//            mw.getWindow().repaint();
        }
        if (e.getSource() == ypw.getSalonEkle()) {
            panel = new SalonEkleWindow();
            // ypw.getPanel().setVisible(false);
            ypw.getPanel().removeAll();
            ypw.getPanel().add(panel.getPanel());
            // ypw.getPanel().setVisible(true);
            ypw.getPanel().repaint();
//            mw.getWindow().setContentPane(panel.getPanel());
//            mw.getWindow().repaint();

        }
        if (e.getSource() == ypw.getFilmSil()) {
            panel = new RemoveWİndow();
            ypw.getPanel().setVisible(false);
            ypw.getPanel().removeAll();
            ypw.getPanel().add(panel.getPanel());
            ypw.getPanel().setVisible(true);
            ypw.getPanel().repaint();

        }
        if (e.getSource() == ypw.getBiletciEkle()) {
            panel = new BiletciEkleWindow();
            ypw.getPanel().setVisible(false);
            ypw.getPanel().removeAll();
            ypw.getPanel().add(panel.getPanel());
            ypw.getPanel().setVisible(true);
            ypw.getPanel().repaint();
        }
        if (e.getSource() == ypw.getGeri()) {
            panel = new YoneticiWindow();
            ypw.getPanel().setVisible(false);
            ypw.getPanel().removeAll();
            ypw.getPanel().add(panel.getPanel());
            ypw.getPanel().setVisible(true);
            ypw.getPanel().repaint();
        }

    }

}
