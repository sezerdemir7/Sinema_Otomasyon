/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_Action;

import DAO.YöneticiDAO;
import GUI.BiletciProcesWindow;
import GUI.BiletciWindow;
import GUI.YoneticiWindow;
import GUI.YöneticiProcessWindow;
import GUI.costumPanel;
import GUI.mainWindow;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author semih
 */
public class BiletciWindowAction implements ActionListener {
    private BiletciWindow bw;
    private costumPanel panel;
  //  private YöneticiDAO yd;

    mainWindow mw;

    public BiletciWindowAction(BiletciWindow bw) throws IOException {
        // yw=new YoneticiWindow();
        //yd = new YöneticiDAO();
        mw = new mainWindow();
        this.bw = bw;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
             
                

                    panel = new BiletciProcesWindow();
                    bw.getPanel().setVisible(false);
                    bw.getPanel().removeAll();
                    bw.getPanel().add(panel.getPanel());
                    bw.getPanel().setVisible(true);
                    bw.getPanel().repaint();
//                  mw.getWindow().setContentPane(panel.getPanel());
//                  mw.getWindow().repaint();

      
    }

    
    
    
    
    
}
