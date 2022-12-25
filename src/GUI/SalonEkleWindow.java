package GUI;

import GUI_Action.SalonEkleWindowAction;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.*;

public class SalonEkleWindow implements costumPanel {

    private JPanel panel;
    private JLabel Lno, Lkat, baslık;
    private JTextField no;
    private JComboBox kat;
    private Font fn, fn2;
    private JButton kaydet, anasayfa, geri;

    @Override
    public JPanel getPanel() {
        if (this.panel == null) {
            this.panel = new JPanel();
            this.panel.setSize(800, 600);
            this.panel.add(this.getBaslık());
            this.panel.add(this.getLno());
            this.panel.add(this.getLkat());
            this.panel.add(this.getNo());
            this.panel.add(this.getKat());

            try {
                this.panel.add(this.getGeri());
            } catch (IOException ex) {
                Logger.getLogger(SalonEkleWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                this.panel.add(this.getKaydet());
            } catch (IOException ex) {
                Logger.getLogger(SalonEkleWindow.class.getName()).log(Level.SEVERE, null, ex);
            }

            this.panel.setBackground(Color.gray);
            this.panel.setLayout(null);
            this.panel.setVisible(true);
        }

        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
//    public JButton getAnasayfa() throws IOException {
//        if(this.anasayfa==null){
//            this.anasayfa=new JButton("AnaSayfa");
//            this.anasayfa.setBounds(-15, 0, 140, 25);
//            this.anasayfa.setFont(this.getFn());
//            this.anasayfa.setBackground(Color.orange);
//            this.anasayfa.addActionListener(new SalonEkleWindowAction(this));
//            
//        }
//        return anasayfa;
//    }
//
//    public void setAnasayfa(JButton anasayfa) {
//        this.anasayfa = anasayfa;
//    }

    public JButton getGeri() throws IOException {
        if (this.geri == null) {
            this.geri = new JButton("Geri");
            this.geri.setBounds(700, 0, 85, 35);
            this.geri.setFont(this.getFn());
            this.geri.setBackground(Color.orange);
            this.geri.addActionListener(new SalonEkleWindowAction(this));

        }
        return geri;
    }

    public void setGeri(JButton geri) {
        this.geri = geri;
    }

    public JLabel getBaslık() {
        if (this.baslık == null) {
            this.baslık = new JLabel("Salon Ekleme Ekranı");
            this.baslık.setBounds(200, 50, 400, 40);
            this.baslık.setForeground(Color.white);
            this.baslık.setFont(this.getFn2());
        }
        return baslık;
    }

    public void setBaslık(JLabel baslık) {
        this.baslık = baslık;
    }

    public JLabel getLno() {
        if (this.Lno == null) {
            this.Lno = new JLabel("Salon No:");
            this.Lno.setBounds(35, 150, 130, 40);
            this.Lno.setFont(this.getFn());
            this.Lno.setForeground(Color.white);

        }
        return Lno;
    }

    public void setLno(JLabel Lno) {
        this.Lno = Lno;
    }

    public JLabel getLkat() {
        if (this.Lkat == null) {
            this.Lkat = new JLabel("Kat No:");
            this.Lkat.setBounds(35, 210, 130, 40);
            this.Lkat.setFont(this.getFn());
            this.Lkat.setForeground(Color.white);
        }
        return Lkat;
    }

    public void setLkat(JLabel Lkat) {
        this.Lkat = Lkat;
    }

    public JTextField getNo() {
        if (this.no == null) {
            this.no = new JTextField();
            this.no.setBounds(175, 150, 65, 40);
            this.no.setFont(this.getFn());
        }
        return no;
    }

    public void setNo(JTextField no) {
        this.no = no;
    }

    public JComboBox getKat() {
        if (this.kat == null) {
            String arr[] = {"1", "2", "3"};
            this.kat = new JComboBox(arr);
            this.kat.setBounds(175, 215, 50, 35);
            this.kat.setFont(this.getFn());
        }
        return kat;
    }

    public void setKat(JComboBox kat) {
        this.kat = kat;
    }

    public JButton getKaydet() throws IOException {
        if (this.kaydet == null) {
            this.kaydet = new JButton("Kaydet");
            this.kaydet.setBounds(260, 280, 130, 40);
            this.kaydet.setFont(this.getFn());
            this.kaydet.setBackground(Color.ORANGE);
            this.kaydet.addActionListener(new SalonEkleWindowAction(this));
        }
        return kaydet;
    }

    public void setKaydet(JButton kaydet) {
        this.kaydet = kaydet;
    }

    public Font getFn() {
        if (this.fn == null) {
            fn = new Font("", Font.PLAIN, 25);

        }
        return fn;
    }

    public void setFn(Font fn) {
        this.fn = fn;
    }

    public Font getFn2() {
        if (this.fn2 == null) {
            fn2 = new Font("", Font.ITALIC, 40);

        }
        return fn2;
    }

    public void setFn2(Font fn2) {
        this.fn2 = fn2;
    }

}
