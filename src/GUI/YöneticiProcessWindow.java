
package GUI;

import GUI_Action.YoneticiWindowAction;
import GUI_Action.YöneticiProcessAction;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class YöneticiProcessWindow implements costumPanel{
    
    private JPanel panel;
    private JLabel baslık;
    private JButton filmEkle,filmSil,salonEkle,salonSil,seansEkle,seansSil;
    private Font fn;
    
    @Override
    public JPanel getPanel() {
        if(this.panel==null){
            this.panel=new JPanel();
            
            this.panel.setSize(800, 600);
            this.panel.add(this.getBaslık());
            this.panel.add(this.getFilmEkle());
            this.panel.add(this.getFilmSil());
            this.panel.add(this.getSeansEkle());
            this.panel.add(this.getSeansSil());
            this.panel.add(this.getSalonEkle());
            this.panel.add(this.getSalonSil());
            this.panel.setBackground(Color.GRAY);
            this.panel.setLayout(null);
        }
        
        
        
        return panel;
        
        

    }

    public JButton getFilmEkle() {
        if(this.filmEkle==null){
           filmEkle=new JButton("Film Ekle");
            this.filmEkle.setBounds(50, 150, 200, 50);
            this.filmEkle.setForeground(Color.white);
            this.filmEkle.setBackground(Color.GREEN);
            this.filmEkle.setFont(this.getFn());
            this.filmEkle.addActionListener(new YöneticiProcessAction(this));
        }
        return filmEkle;
    }

    public void setFilmEkle(JButton filmEkle) {
        this.filmEkle = filmEkle;
    }

    public JButton getFilmSil() {
        if(this.filmSil==null){
            filmSil=new JButton("Film Sil");
            this.filmSil.setBounds(450, 150, 200, 50);
            this.filmSil.setBackground(Color.GREEN);
            this.filmSil.setForeground(Color.white);
            this.filmSil.setFont(this.getFn());
        }
        return filmSil;
    }

    public void setFilmSil(JButton filmSil) {
        this.filmSil = filmSil;
    }

    public JButton getSalonEkle() {
        if(this.salonEkle==null){
            salonEkle=new JButton("Salon Ekle");
            this.salonEkle.setBounds(50, 350, 200, 50);
            this.salonEkle.setBackground(Color.yellow);
            this.salonEkle.setForeground(Color.darkGray);
            this.salonEkle.setFont(this.getFn());
            this.salonEkle.addActionListener(new YöneticiProcessAction(this));
        }
        return salonEkle;
    }

    public void setSalonEkle(JButton salonEkle) {
        this.salonEkle = salonEkle;
    }

    public JButton getSalonSil() {
        if(this.salonSil==null){
            salonSil=new JButton("Salon Sil");
            this.salonSil.setBounds(450, 350, 200, 50);
            this.salonSil.setBackground(Color.GREEN);
            this.salonSil.setForeground(Color.white);
            this.salonSil.setFont(this.getFn());
        }
        return salonSil;
    }

    public void setSalonSil(JButton salonSil) {
        this.salonSil = salonSil;
    }

    public JButton getSeansEkle() {
        if(this.seansEkle==null){
            seansEkle=new JButton("Seans Ekle");
            this.seansEkle.setBounds(50, 250, 200, 50);
            this.seansEkle.setBackground(Color.GREEN);
            this.seansEkle.setForeground(Color.white);
            this.seansEkle.setFont(this.getFn());
            this.seansEkle.addActionListener(new YöneticiProcessAction(this));
        }
        return seansEkle;
    }

    public void setSeansEkle(JButton seansEkle) {
        this.seansEkle = seansEkle;
    }

    public JButton getSeansSil() {
        if(this.seansSil==null){
            seansSil=new JButton("Seans Sil");
            this.seansSil.setBounds(450, 250, 200, 50);
            this.seansSil.setBackground(Color.GREEN);
            this.seansSil.setForeground(Color.white);
            this.seansSil.setFont(this.getFn());
        }
        return seansSil;
    }

    public void setSeansSil(JButton seansSil) {
        
        this.seansSil = seansSil;
    }

    public JLabel getBaslık() {
        if(this.baslık==null){
            baslık=new JLabel("Yönetici İşlemleri");
            this.baslık.setBounds(240, 50, 300, 50);
            this.baslık.setForeground(Color.WHITE);
            this.baslık.setFont(this.getFn());
            
        }
        return baslık;
    }

    public void setBaslık(JLabel baslık) {
        this.baslık = baslık;
    }
    

    public Font getFn() {
        if(this.fn==null){
            fn=new Font("",Font.CENTER_BASELINE,30); 
            
        }
        return fn;
    }

    public void setFn(Font fn) {
        this.fn = fn;
    }
    
}
