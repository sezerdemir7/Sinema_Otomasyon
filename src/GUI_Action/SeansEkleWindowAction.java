package GUI_Action;

import GUI.costumPanel;
import GUI.SeansEkleWİndow;
import GUI.YöneticiProcessWindow;
import GUI.mainWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class SeansEkleWindowAction implements ActionListener{
   private mainWindow mw;
    private costumPanel panel;
    private SeansEkleWİndow sew;
    private YöneticiProcessWindow ypw;

    public SeansEkleWindowAction(SeansEkleWİndow sew) {
        ypw=new YöneticiProcessWindow();
        mw=new mainWindow();
        this.sew=sew;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==sew.getGeri()){
            
            mw.getWindow().setContentPane(ypw.getPanel());
            mw.getWindow().repaint();
            
        }
    }
    
}
