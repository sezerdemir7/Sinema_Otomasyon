package GUI_Action;

import GUI.MüsteriProcessWindow;
import GUI.costumPanel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MüsteriProcessAction implements ActionListener{
    
    private costumPanel panel;
    private MüsteriProcessWindow mpw;

    public MüsteriProcessAction(MüsteriProcessWindow mpw) {
        this.mpw=mpw;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==mpw.getButons()[2]){
            panel=new MüsteriProcessWindow();
            
            
            mpw.getPanel().setVisible(false);
            mpw.getPanel().removeAll();
            mpw.getPanel().add(panel.getPanel());
             
           mpw.getButons()[2].setBackground(Color.red);
           mpw.getButons()[2].setText("sw");
            mpw.getPanel().setVisible(true);
            mpw.getPanel().repaint();
            
            mpw.getButons()[2].setEnabled(true);
            System.out.println("Sezer");
        }
        
    }
    
}
