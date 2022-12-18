package GUI;

import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.*;
import javax.swing.JLabel;
import javax.swing.*;


public class SeansEkleWİndow implements costumPanel{
private JPanel panel;
private JComboBox day,month,year;
private Calendar cl;
private JLabel lSalonNo,lSaat,tarih;





@Override
    public JPanel getPanel() {
        if(this.panel==null){
            panel=new JPanel();
            this.panel.setSize(800, 600);
            
            this.panel.setLayout(null);
            this.panel.setVisible(true);
            
            this.panel.setBackground(Color.gray);
           
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public Calendar getCl() 
    {
        if(this.cl==null){
           
        }
        return cl;
    }

    public void setCl(Calendar cl) {
        this.cl = cl;
    }

    

    public JLabel getlSalonNo() {
        return lSalonNo;
    }

    public void setlSalonNo(JLabel lSalonNo) {
        this.lSalonNo = lSalonNo;
    }

    

    public JLabel getlSaat() {
        if(this.lSaat==null){
            lSaat=new JLabel("Saat:");
        }
        return lSaat;
    }

    public void setlSaat(JLabel lSaat) {
        this.lSaat = lSaat;
    }


    
    
    
    
    
    
}
