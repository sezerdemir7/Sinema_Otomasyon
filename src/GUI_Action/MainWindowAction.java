package GUI_Action;

import GUI.BiletciWindow;
import GUI.MüsteriWindow;
import GUI.YoneticiWindow;
import GUI.costumPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import GUI.mainWindow;

public class MainWindowAction implements ActionListener {

    private mainWindow mw;
    private costumPanel panel;

    public MainWindowAction(mainWindow mw) {
        this.mw = mw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mw.getBtnYntc()) {
            panel = new YoneticiWindow();

            mw.getPanel().setVisible(false);
            mw.getPanel().removeAll();
            mw.getPanel().add(panel.getPanel());

            mw.getPanel().setVisible(true);

            mw.getPanel().repaint();
            // mw.getPanel().add(mw.getMb());
            // mw.getTp().setName("Yönetici Giriş");
            // mw.getTp().add("Yönetici Giriş",this.panel.getPanel());

//            mw.getWindow().setContentPane(panel.getPanel());
//            mw.getWindow().repaint();
        }
        if (e.getSource() == mw.getBtnBltci()) {
           
            panel = new BiletciWindow();
            
            mw.getPanel().setVisible(false);
            mw.getPanel().removeAll();
            mw.getPanel().add(panel.getPanel());
            mw.getPanel().setVisible(true);
            mw.getPanel().repaint();

        }
        if (e.getSource() == mw.getBtnMusteri()) {
            panel = new MüsteriWindow();
            mw.getPanel().setVisible(false);
            mw.getPanel().removeAll();
            mw.getPanel().add(panel.getPanel());
            mw.getPanel().setVisible(true);
            mw.getPanel().repaint();

        }

    }

}
