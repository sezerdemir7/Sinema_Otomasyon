package GUI;

import java.awt.Color;
import java.awt.*;
import javax.swing.JLabel;
import javax.swing.*;


public class SeansEkleWİndow implements costumPanel{
private JPanel panel;
private JComboBox day,month,year;
private Font fn,fn2;

private JLabel lSaat,tarih,salon,film,baslık;
private JButton filmSec,kaydet,geri;




@Override
    public JPanel getPanel() {
        if(this.panel==null){
            panel=new JPanel();
            this.panel.setSize(800, 600);
            this.panel.add(this.getDay());
            this.panel.add(this.getTarih());
            this.panel.add(this.getMonth());
            this.panel.add(this.getYear());
            this.panel.add(this.getSalon());
            this.panel.add(this.getFilm());
            this.panel.add(this.getBaslık());
            
            
            this.panel.setLayout(null);
            this.panel.setVisible(true);
            
            this.panel.setBackground(Color.gray);
           
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getSalon() {
        if(this.salon==null){
            salon=new JLabel("Salon Seç:");
            this.salon.setBounds(35, 210, 150, 35);
            this.salon.setFont(this.getFn());
            this.salon.setForeground(Color.white);
            
        }
        return salon;
    }

    public JLabel getBaslık() {
        if(this.baslık==null){
            this.baslık=new JLabel("Seans Ekleme Ekranı");
            this.baslık.setBounds(150, 50, 400, 50);
            this.baslık.setForeground(Color.white);
            this.baslık.setFont(this.getFn2());
        }
        return baslık;
    }

    public void setBaslık(JLabel baslık) {
        this.baslık = baslık;
    }

    
    
    public void setSalon(JLabel salon) {
        this.salon = salon;
    }

    public JLabel getFilm() {
        if(this.film==null){
            film=new JLabel("Film Seç:");
            this.film.setBounds(35, 265, 150, 35);
            this.film.setFont(this.getFn());
            this.film.setForeground(Color.white);
        }
        return film;
    }

    public void setFilm(JLabel film) {
        this.film = film;
    }

  
    

    

    public JComboBox getDay() {
        if(this.day==null){
            String arr[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
            day=new JComboBox(arr);
            this.day.setBounds(150, 163, 50, 30);
            
        }
        return day;
    }

    public void setDay(JComboBox day) {
        this.day = day;
    }

    public JComboBox getMonth() {
        if(this.month==null){
            String ay[]={"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"};
            month=new JComboBox(ay);
            this.month.setBounds(210, 163, 100, 30);
        }
        return month;
    }

    public void setMonth(JComboBox month) {
        this.month = month;
    }

    public JComboBox getYear() {
        if(this.year==null){
            String yıl[]={"2022","2023"};
            year=new JComboBox(yıl);
            this.year.setBounds(320, 163, 100, 30);
            
        }
        return year;
    }

    public void setYear(JComboBox year) {
        this.year = year;
    }

    public JLabel getTarih() {
        if(this.tarih==null){
            tarih=new JLabel("Tarih Seç:");
            this.tarih.setBounds(35, 160, 150, 35);
            this.tarih.setFont(this.getFn());
            this.tarih.setForeground(Color.white);
        }
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

    public Font getFn() {
        if(this.fn==null){
            fn=new Font("",Font.PLAIN,25); 
            
            
        }
        return fn;
    }

    public void setFn(Font fn) {
        this.fn = fn;
    }

    public Font getFn2() {
        if(this.fn2==null){
            fn2 =new Font("",Font.ITALIC,40) ;
            
        }
        return fn2;
    }

    public void setFn2(Font fn2) {
        this.fn2 = fn2;
    }


    
    
    
    
    
    
}
