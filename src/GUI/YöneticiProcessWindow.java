package GUI;

import GUI_Action.YoneticiWindowAction;
import GUI_Action.YöneticiProcessAction;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class YöneticiProcessWindow implements costumPanel {

    private JPanel panel;
    private JLabel baslık;
    private JButton filmEkle, remove, salonEkle, seansEkle, biletciEkle, geri;
    private Font fn, fn2,fn3;

    @Override
    public JPanel getPanel() {
        if (this.panel == null) {
            this.panel = new JPanel();

            this.panel.setSize(800, 600);
            this.panel.add(this.getBaslık());
            this.panel.add(this.getFilmEkle());
            this.panel.add(this.getFilmSil());
            this.panel.add(this.getSeansEkle());
           this.panel.add(this.getGeri());
            this.panel.add(this.getSalonEkle());
            this.panel.add(this.getBiletciEkle());
            this.panel.setBackground(Color.GRAY);
            this.panel.setLayout(null);
        }

        return panel;

    }

    public JButton getBiletciEkle() {
        if (this.biletciEkle == null) {
            this.biletciEkle = new JButton("Biletci Ekle");
            this.biletciEkle.setBounds(50, 400, 200, 50);
            this.biletciEkle.setForeground(Color.darkGray);
            this.biletciEkle.setBackground(Color.orange);
            this.biletciEkle.setFont(this.getFn());
            this.biletciEkle.addActionListener(new YöneticiProcessAction(this));
        }
        return biletciEkle;
    }

    public void setBiletciEkle(JButton biletciEkle) {
        this.biletciEkle = biletciEkle;
    }

    public JButton getGeri()  {
        if (this.geri == null) {
            this.geri = new JButton("Geri");
            this.geri.setBounds(700, 0, 100, 35);
            this.geri.setFont(this.getFn3());
            this.geri.setBackground(Color.orange);
            this.geri.addActionListener(new YöneticiProcessAction(this));

        }
        return geri;
    }

    public void setGeri(JButton geri) {
        this.geri = geri;
    }

    public JButton getFilmEkle() {
        if (this.filmEkle == null) {
            filmEkle = new JButton("Film Ekle");
            this.filmEkle.setBounds(50, 100, 200, 50);
            this.filmEkle.setForeground(Color.darkGray);
            this.filmEkle.setBackground(Color.orange);
            this.filmEkle.setFont(this.getFn());
            this.filmEkle.addActionListener(new YöneticiProcessAction(this));
        }
        return filmEkle;
    }

    public void setFilmEkle(JButton filmEkle) {
        this.filmEkle = filmEkle;
    }

    public JButton getFilmSil() {
        if (this.remove == null) {
            remove = new JButton("Silme İşlemeleri");
            this.remove.setBounds(350, 230, 350, 80);
            this.remove.setBackground(Color.orange);
            this.remove.setForeground(Color.darkGray);
            this.remove.setFont(this.getFn());
            this.remove.addActionListener(new YöneticiProcessAction(this));
        }
        return remove;
    }

    public void setFilmSil(JButton remove) {
        this.remove = remove;
    }

    public JButton getSalonEkle() {
        if (this.salonEkle == null) {
            salonEkle = new JButton("Salon Ekle");
            this.salonEkle.setBounds(50, 300, 200, 50);
            this.salonEkle.setBackground(Color.orange);
            this.salonEkle.setForeground(Color.darkGray);
            this.salonEkle.setFont(this.getFn());
            this.salonEkle.addActionListener(new YöneticiProcessAction(this));
        }
        return salonEkle;
    }

    public void setSalonEkle(JButton salonEkle) {
        this.salonEkle = salonEkle;
    }

    public JButton getSeansEkle() {
        if (this.seansEkle == null) {
            seansEkle = new JButton("Seans Ekle");
            this.seansEkle.setBounds(50, 200, 200, 50);
            this.seansEkle.setBackground(Color.orange);
            this.seansEkle.setForeground(Color.darkGray);
            this.seansEkle.setFont(this.getFn());
            this.seansEkle.addActionListener(new YöneticiProcessAction(this));
        }
        return seansEkle;
    }

    public void setSeansEkle(JButton seansEkle) {
        this.seansEkle = seansEkle;
    }

//    public JButton getSeansSil() {
//        if(this.seansSil==null){
//            seansSil=new JButton("Seans Sil");
//            this.seansSil.setBounds(450, 250, 200, 50);
//            this.seansSil.setBackground(Color.GREEN);
//            this.seansSil.setForeground(Color.white);
//            this.seansSil.setFont(this.getFn());
//        }
//        return seansSil;
//    }
//
//    public void setSeansSil(JButton seansSil) {
//        
//        this.seansSil = seansSil;
//    }
    public JLabel getBaslık() {
        if (this.baslık == null) {
            baslık = new JLabel("Yönetici İşlemleri");
            this.baslık.setBounds(240, 10, 300, 50);
            this.baslık.setForeground(Color.WHITE);
            this.baslık.setFont(this.getFn2());

        }
        return baslık;
    }

    public void setBaslık(JLabel baslık) {
        this.baslık = baslık;
    }

    public Font getFn() {
        if (this.fn == null) {
            fn = new Font("", Font.CENTER_BASELINE, 30);

        }
        return fn;
    }

    public void setFn(Font fn) {
        this.fn = fn;
    }

    public Font getFn2() {
        if (this.fn2 == null) {
            this.fn2 = new Font("", Font.ITALIC, 35);

        }
        return fn2;
    }

    public void setFn2(Font fn2) {
        this.fn2 = fn2;
    }

    public Font getFn3() {
        if(this.fn3==null){
            this.fn3=new Font("",Font.ROMAN_BASELINE,25); 
            
        
        }
        return fn3;
    }

    public void setFn3(Font fn3) {
        this.fn3 = fn3;
    }

}
