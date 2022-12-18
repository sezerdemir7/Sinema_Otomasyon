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


private JLabel lSalonNo,lSaat,tarih;





@Override
    public JPanel getPanel() {
        if(this.panel==null){
            panel=new JPanel();
            this.panel.setSize(800, 600);
            this.panel.add(this.getDay());
            this.panel.setLayout(null);
            this.panel.setVisible(true);
            
            this.panel.setBackground(Color.gray);
           
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

  
    

    public JLabel getlSalonNo() {
        return lSalonNo;
    }

    public void setlSalonNo(JLabel lSalonNo) {
        this.lSalonNo = lSalonNo;
    }

    public JComboBox getDay() {
        if(this.day==null){
            String arr[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
            day=new JComboBox(arr);
            this.day.setBounds(100, 50, 50, 35);
        }
        return day;
    }

    public void setDay(JComboBox day) {
        this.day = day;
    }

    public JComboBox getMonth() {
        return month;
    }

    public void setMonth(JComboBox month) {
        this.month = month;
    }

    public JComboBox getYear() {
        return year;
    }

    public void setYear(JComboBox year) {
        this.year = year;
    }

    public JLabel getTarih() {
        return tarih;
    }

    public void setTarih(JLabel tarih) {
        this.tarih = tarih;
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
