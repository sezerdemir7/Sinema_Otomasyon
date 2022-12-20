package GUI;

import GUI_Action.FilmEkleWindowAction;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.JTextField;


public class FilmEkleWindow implements costumPanel{
    private JPanel panel;
    private JLabel baslık,Lsüre,Lad,Ltür,Lkatagory;
    private JTextField süre,ad;
    private JComboBox tür,katagory;
    private JButton ekle;
    private Font fn,fn2;
    

    @Override
    public JPanel getPanel() {
        if(this.panel==null){
            panel=new JPanel();
            this.panel.setSize(800,600);
            //this.panel.add(this.getLid());
            this.panel.add(this.getLad());
            this.panel.add(this.getLtür());
            this.panel.add(this.getLkatagory());
            this.panel.add(this.getLsüre());
            this.panel.add(this.getAd());
            this.panel.add(this.getTür());
            this.panel.add(this.getKatagory());
            this.panel.add(this.getSüre());
            this.panel.add(this.getBaslık());
            this.panel.add(this.getEkle());
            this.panel.setLayout(null);
            this.panel.setBackground(Color.gray);
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JButton getEkle() {
        if(this.ekle==null){
            this.ekle=new JButton("Kaydet");
            this.ekle.setBounds(250, 350, 100, 40);
            this.ekle.setBackground(Color.orange);
            this.ekle.setFont(this.getFn());
            this.ekle.addActionListener(new FilmEkleWindowAction(this));
        }
        return ekle;
    }

    public void setEkle(JButton ekle) {
        this.ekle = ekle;
    }
    

    public JLabel getBaslık() {
        if(this.baslık==null){
            this.baslık=new JLabel("Film Ekleme");
            this.baslık.setBounds(250, 20, 300, 40);
            this.baslık.setForeground(Color.white);
            this.baslık.setFont(this.getFn2());
        }
        return baslık;
    }

    public void setBaslık(JLabel baslık) {
        this.baslık = baslık;
    }

    public JLabel getLsüre() {
        if(this.Lsüre==null){
            Lsüre=new JLabel("Süre:");
            this.Lsüre.setBounds(40, 280, 100, 35);
            this.Lsüre.setFont(this.getFn());
            this.Lsüre.setForeground(Color.white);
        }
        return Lsüre;
    }

    public void setLsüre(JLabel Lsüre) {
        this.Lsüre = Lsüre;
    }

    public JTextField getSüre() {
        if(this.süre==null){
            süre=new JTextField();
            this.süre.setBounds(135, 280, 200, 35);
        }
        return süre;
    }

    public void setSüre(JTextField süre) {
        this.süre = süre;
    }


    public JLabel getLad() {
        if(this.Lad==null){
            Lad=new JLabel("AD:");
            this.Lad.setFont(this.getFn());
            this.Lad.setBounds(40, 100, 100, 40);
            this.Lad.setForeground(Color.white);
        }
        return Lad;
    }

    public void setLad(JLabel Lad) {
        this.Lad = Lad;
    }

    public JLabel getLtür() {
        if(this.Ltür==null){
            Ltür=new JLabel("TÜR:");
            this.Ltür.setBounds(40, 160, 100, 40);
            this.Ltür.setFont(this.getFn());
           this.Ltür.setForeground(Color.white);
        }
        return Ltür;
    }

    public void setLtür(JLabel Ltür) {
        this.Ltür = Ltür;
    }

    public JLabel getLkatagory() {
        if(this.Lkatagory==null){
            Lkatagory=new JLabel("Kategori:");
            this.Lkatagory.setBounds(40, 220, 100, 40);
            this.Lkatagory.setForeground(Color.white);
            this.Lkatagory.setFont(this.getFn());
                    
        }
        return Lkatagory;
    }

    public void setLkatagory(JLabel Lkatagory) {
        this.Lkatagory = Lkatagory;
    }



    public JTextField getAd() {
        if(this.ad==null){
            ad=new JTextField();
            this.ad.setBounds(135, 100, 200, 35);
        }
        return ad;
    }

    public void setAd(JTextField ad) {
        this.ad = ad;
    }

    public JComboBox getTür() {
         
        if(this.tür==null){
           String[] arr={"yerli","yabancı"};
            tür=new JComboBox(arr);
            
            this.tür.setVisible(true);
            this.tür.setBounds(135, 160, 200, 35);
            this.tür.setFont(this.getFn());
        }
        return tür;
    }

    public void setTür(JComboBox tür) {
        this.tür = tür;
    }

    public JComboBox getKatagory() {
        if(this.katagory==null){
            String arr2[]={"Macera","Aksiyon","Komedi","Dram"};
            katagory=new JComboBox(arr2);
            this.katagory.setBounds(135, 220, 200, 35);
            this.katagory.setFont(fn);
            
        }
        return katagory;
    }

    public void setKatagory(JComboBox katagory) {
        this.katagory = katagory;
    }

    public Font getFn() {
        if(this.fn==null){
            fn=new Font("",Font.ROMAN_BASELINE,20);
            
        }
        return fn;
    }

    public void setFn(Font fn) {
        this.fn = fn;
    }

    public Font getFn2() {
        if(this.fn2==null){
            this.fn2=new Font("",Font.ITALIC,35); 
            
        }
        return fn2;
    }

    public void setFn2(Font fn2) {
        this.fn2 = fn2;
    }
    
    
    
}
