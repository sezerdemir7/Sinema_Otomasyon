/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_Action;

import GUI.YöneticiProcessWindow;
import GUI.costumPanel;
import GUI.mainWindow;
import GUI.FilmEkleWindow;
import GUI.SeansEkleWİndow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author muhdm
 */
public class YöneticiProcessAction implements ActionListener {

    private mainWindow mw;
    private costumPanel panel, panel2;
    private YöneticiProcessWindow ypw;

    public YöneticiProcessAction(YöneticiProcessWindow ypw) {
        mw = new mainWindow();
        this.ypw = ypw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ypw.getFilmEkle()) {

            panel = new FilmEkleWindow();
            mw.getWindow().setContentPane(panel.getPanel());
            mw.getWindow().repaint();

        }

        if (e.getSource() == ypw.getSeansEkle()) {
            panel2 = new SeansEkleWİndow();
            mw.getWindow().setContentPane(panel2.getPanel());
            mw.getWindow().repaint();

        }

    }

}
