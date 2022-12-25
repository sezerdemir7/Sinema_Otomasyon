package GUI;

import GUI_Action.YoneticiWindowAction;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.*;

public class YoneticiWindow implements costumPanel{
    
    private JPanel panel;
    private JButton giris,geri;
    private JLabel ad,soyad,tlf,lsifre,baslık;
    private JTextField tad,tsoyad,tlfon;
    private JPasswordField sifre;
    private Font fn;
    private JTabbedPane tp;
  
    
    @Override
    public JPanel getPanel() {
        if(this.panel==null){
           this.panel=new JPanel();
           this.panel.setSize(800, 600);
           
           this.panel.add(getBaslık());
           this.panel.add(this.getAd());
           this.panel.add(this.getTad());
           this.panel.add(this.getSoyad());
           this.panel.add(this.getTsoyad());
           this.panel.add(this.getTlf());
           this.panel.add(this.getTlfon());
           this.panel.add(this.getLsifre());
           
           this.panel.add(this.getSifre());
            try {
                this.panel.add(this.getGiris());
            } catch (IOException ex) {
                Logger.getLogger(YoneticiWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                this.panel.add(this.getGeri());
            } catch (IOException ex) {
                Logger.getLogger(YoneticiWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
           this.panel.setBackground(Color.gray);
           this.panel.setLayout(null);
           
        }
        return panel;
    }
    

    public JButton getGiris() throws IOException {
        if(this.giris==null){
            giris=new JButton("Giriş Yap");
            this.giris.setBounds(250, 450, 150, 40);
            this.giris.setBackground(Color.ORANGE);
            this.giris.setFont(this.getFn());
            this.giris.addActionListener(new YoneticiWindowAction(this));
        }
        return giris;
    }

    public void setGiris(JButton giris) {
        this.giris = giris;
    }
    public JButton getGeri() throws IOException  {
        if (this.geri == null) {
            this.geri = new JButton("Geri");
            this.geri.setBounds(700, 0, 100, 35);
            this.geri.setFont(this.getFn());
            this.geri.setBackground(Color.orange);
            this.geri.addActionListener(new YoneticiWindowAction(this));

        }
        return geri;
    }

    public void setGeri(JButton geri) {
        this.geri = geri;
    }

    public JLabel getAd() {
        if(this.ad==null){
            this.ad=new JLabel("Ad:");
            this.ad.setFont(this.getFn());
            this.ad.setForeground(Color.WHITE);
            this.ad.setBounds(50, 150, 100, 40);
            
        }
        return ad;
    }

    public JLabel getBaslık() {
        if(this.baslık==null){
            baslık=new JLabel("Yönetici Girişi");
            Font f2=new Font("",Font.ITALIC,40);
            
            this.baslık.setBounds(250, 50, 300, 50);
            this.baslık.setFont(f2);
            this.baslık.setForeground(Color.white);
        }
        return baslık;
    }

    public void setBaslık(JLabel baslık) {
        this.baslık = baslık;
    }

    public void setAd(JLabel ad) {
        this.ad = ad;
    }

    public JLabel getSoyad() {
        if(this.soyad==null){
            soyad=new JLabel("Soyad:");
            this.soyad.setFont(this.getFn());
            this.soyad.setBounds(50, 220, 100, 40);
            this.soyad.setForeground(Color.WHITE);
        }
        return soyad;
    }

    public void setSoyad(JLabel soyad) {
        this.soyad = soyad;
    }

    public JLabel getTlf() {
        if(this.tlf==null){
            tlf=new JLabel("Telefon:");
            this.tlf.setFont(this.getFn());
            this.tlf.setBounds(50, 290, 100, 40);
            this.tlf.setForeground(Color.WHITE);
        }
        return tlf;
    }

    public void setTlf(JLabel tlf) {
        this.tlf = tlf;
    }

    public JLabel getLsifre() {
        if(this.lsifre==null){
            lsifre=new JLabel("Sifre:");
            this.lsifre.setFont(this.getFn());
            this.lsifre.setBounds(50, 360, 100, 40);
            this.lsifre.setForeground(Color.WHITE);
        }
        return lsifre;
    }

    public void setLsifre(JLabel lsifre) {
        this.lsifre = lsifre;
    }

    public JTextField getTad() {
        if(this.tad==null){
            tad=new JTextField();
            this.tad.setBounds(130, 155, 150, 35);
        }
        return tad;
    }

    public void setTad(JTextField tad) {
        this.tad = tad;
    }

    public JTextField getTsoyad() {
        if(tsoyad==null){
            tsoyad=new JTextField();
            this.tsoyad.setBounds(130, 222, 150, 35);
        }
        return tsoyad;
    }

    public void setTsoyad(JTextField tsoyad) {
        this.tsoyad = tsoyad;
    }

    public JTextField getTlfon() {
        if(this.tlfon==null){
            tlfon=new JTextField();
            this.tlfon.setBounds(130, 296, 150, 35);
        }
        return tlfon;
    }

    public void setTlfon(JTextField tlfon) {
        this.tlfon = tlfon;
    }

    

    public JPasswordField getSifre() {
        if(this.sifre==null){
            sifre=new JPasswordField();
           
            this.sifre.setBounds(130, 365, 150, 35);
        }
        return sifre;
    }

    public void setSifre(JPasswordField sifre) {
        this.sifre = sifre;
    }

    public Font getFn() {
        if(this.fn==null){
            fn=new Font("",Font.BOLD,20); 
            
        }
        return fn;
    }

    public void setFn(Font fn) {
        this.fn = fn;
    }
    
    
}
