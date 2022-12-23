package GUI_Action;

import GUI.MüsteriProcessWindow;
import GUI.MüsteriWindow;
import GUI.costumPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MüsteriWindowAction implements ActionListener{
    
    private costumPanel panel;
    private MüsteriWindow müw;
    public MüsteriWindowAction(MüsteriWindow müw) {
        
        this.müw=müw;
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==müw.getGrs()){
           panel=new MüsteriProcessWindow();
           
           müw.getPanel().setVisible(false);
           müw.getPanel().removeAll();
           müw.getPanel().add(panel.getPanel());
           müw.getPanel().setVisible(true);
           müw.getPanel().repaint();
        }
        
    }
    
}
