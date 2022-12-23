package GUI_Action;

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
            System.out.println("ortak");
        }
        
    }
    
}
