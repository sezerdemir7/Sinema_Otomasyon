
package GUI;

import GUI_Action.MüsteriWindowAction;
import java.awt.Color;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicComboBoxRenderer;


public class MüsteriWindow implements costumPanel{
    private JPanel panel;
    private JLabel ad,soyad,tlfon,baslık;
    private JTextField fad,fsoyad,ftlfon;
    private Font fn,fn2;
    
    private JButton grs;

    @Override
    public JPanel getPanel() {
        if(this.panel==null){
            this.panel=new JPanel();
            this.panel.setSize(800, 600);
            this.panel.setBackground(Color.gray);
            this.panel.add(this.getAd());
            this.panel.add(this.getSoyad());
            this.panel.add(this.getTlfon());
            this.panel.add(this.getFad());
            this.panel.add(this.getFsoyad());
            this.panel.add(this.getFtlfon());
            this.panel.add(this.getBaslık());
            this.panel.add(this.getGrs());
            
            
            
            this.panel.setLayout(null);
                    
        }
        return  panel;
    }

    public JLabel getBaslık() {
        if(this.baslık==null){
            this.baslık=new JLabel("Müşteri Giriş Ekranı");
            this.baslık.setBounds(200, 50, 400, 45);
            this.baslık.setFont(this.getFn2());
            this.baslık.setForeground(Color.WHITE);
        }
        return baslık;
    }

    public void setBaslık(JLabel baslık) {
        this.baslık = baslık;
    }
    

    public JLabel getAd() {
        if(this.ad==null){
            this.ad=new JLabel("AD:");
            this.ad.setBounds(45, 140, 75, 45);
            this.ad.setFont(this.getFn());
            this.ad.setForeground(Color.white);
            
        }
        return ad;
    }

    public void setAd(JLabel ad) {
        this.ad = ad;
    }

    public JLabel getSoyad() {
        if(this.soyad==null){
            this.soyad=new JLabel("SOYAD:");
            this.soyad.setBounds(45, 200, 75, 45);
            this.soyad.setFont(this.getFn());
            this.soyad.setForeground(Color.white);
            
        }
        return soyad;
    }

    public void setSoyad(JLabel soyad) {
        this.soyad = soyad;
    }

    public JLabel getTlfon() {
        if(this.tlfon==null){
            this.tlfon=new JLabel("TELEFON:");
            this.tlfon.setBounds(45, 255, 105, 45);
            this.tlfon.setFont(this.getFn());
            this.tlfon.setForeground(Color.white);
            
        }
        return tlfon;
    }

    public void setTlfon(JLabel tlfon) {
        this.tlfon = tlfon;
    }

    public JTextField getFad() {
        if(this.fad==null){
            this.fad=new JTextField();
            this.fad.setBounds(150, 143, 140, 35);
            this.fad.setFont(this.getFn());
            
            
        }
        return fad;
    }

    public void setFad(JTextField fad) {
        this.fad = fad;
    }

    public JTextField getFsoyad() {
         if(this.fsoyad==null){
            this.fsoyad=new JTextField();
            this.fsoyad.setBounds(150, 198, 140, 35);
            this.fsoyad.setFont(this.getFn());
            
            
        }
        return fsoyad;
    }

    public void setFsoyad(JTextField fsoyad) {
        this.fsoyad = fsoyad;
    }
    

    public JTextField getFtlfon() {
         if(this.ftlfon==null){
            this.ftlfon=new JTextField();
            this.ftlfon.setBounds(150, 253, 140, 35);
            this.ftlfon.setFont(this.getFn());
            
            
        }
        return ftlfon;
    }

    public void setFtlfon(JTextField ftlfon) {
        this.ftlfon = ftlfon;
    }

    public JButton getGrs() {
        if(this.grs==null){
            this.grs=new JButton("Giriş Yap");
            this.grs.setBounds(200, 350, 120, 45);
            this.grs.setFont(this.getFn());
           
            this.grs.setBackground(Color.orange);
            this.grs.addActionListener(new MüsteriWindowAction(this));
        }
        return grs;
    }

    public void setGrs(JButton grs) {
        this.grs = grs;
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
