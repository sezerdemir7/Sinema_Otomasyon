package GUI_Action;

import GUI.MüsteriProcessWindow;
import GUI.costumPanel;
import static java.awt.Color.red;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Controller.MüsteriProcessWindowController;
import java.awt.Color;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import DAO.müsteriDAO;
import Entity.musteri;
import GUI.MüsteriWindow;

public class MüsteriProcessAction implements ActionListener {

    private MüsteriProcessWindowController mwc;//müşteri window controller
    private costumPanel panel;
    private müsteriDAO mdao;
    private MüsteriProcessWindow mpw;
    private musteri m1;

    public MüsteriProcessAction(MüsteriProcessWindow mpw) {
        mdao = new müsteriDAO();
        mwc = new MüsteriProcessWindowController();

        this.mpw = mpw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int sayac = 0;

        if (e.getSource() == mpw.getBilet()) {

            try {
                if (mwc.control(mpw) == false) {//müsteri window controller
                    JOptionPane.showMessageDialog(mpw.getPanel(), "Lütfen Bir Seans Ve Koltuk No Seçiniz");

                } else {
                    for (int j = 0; j < mpw.getButons().length; j++) {
                        if (mpw.getButons()[j].getBackground() == Color.red) {
                            String[] a = mdao.listele("class Entity.musteri.txt");
                            JOptionPane.showMessageDialog(mpw.getPanel(), ("                                                                      Bilet Bilgileri       \n" + "İzleyici Bilgileri:" + a[a.length - 1] + "\n" + "Seçilen Seans:" + mpw.getList().getSelectedValue().toString() + " \nKoltuk No: " + mpw.getButons()[j].getText()));

                        }
                    }
//                      String[] a=mdao.listele("class Entity.musteri.txt");
//                          JOptionPane.showMessageDialog(mpw.getPanel(),(a[a.length-1]+"\n"+mpw.getList().getSelectedValue().toString()+" \nKoltuk No:"+mpw.getButons()[3].getText()));
                }

            } catch (IOException ex) {
                Logger.getLogger(MüsteriProcessAction.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        for (int i = 0; i < mpw.getButons().length; i++) {

            try {
                if (mwc.control(mpw) == false) {

                    if (e.getSource() == mpw.getButons()[i]) {
                        panel = new MüsteriProcessWindow();
                        mpw.getButons()[i].setBackground(red);
                        mpw.getPanel().setVisible(false);
                        mpw.getPanel().setVisible(true);
                        mpw.getPanel();
                        String s = mpw.getButons()[i].getName();
                        System.err.println(s);
                        sayac++;

                    }
                } else {

                    break;
                }
            } catch (IOException ex) {
                Logger.getLogger(MüsteriProcessAction.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        try {
            if (e.getSource() == mpw.getGeri()) {
                panel = new MüsteriWindow();

                mpw.getPanel().setVisible(false);
                mpw.getPanel().removeAll();
                mpw.getPanel().add(panel.getPanel());
                mpw.getPanel().setVisible(true);
                mpw.getPanel().repaint();

            }
        } catch (IOException ex) {
            Logger.getLogger(MüsteriProcessAction.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
