package GUI;

import GUI_Action.MainWindowAction;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.*;

public class mainWindow {

    private JFrame window;
    private JPanel panel;
    private JLabel lYntc, lBiletci, lmusteri;
    private JButton btnYntc, btnBltci, btnMusteri;
    private JLabel baslık;
    private JMenuBar mb;
    private JMenu item3;
    private JMenu item2, item1;
    Image mg = new ImageIcon(mainWindow.class.getResource("/admin2.png")).getImage();
    Image mg2 = new ImageIcon(mainWindow.class.getResource("/biletci.png")).getImage();
    Image mg3 = new ImageIcon(mainWindow.class.getResource("/musteri4.png")).getImage();

    public void build() {

        this.getWindow();

        

    }

    public JFrame getWindow() {
        if (this.window == null) {
            this.window = new JFrame("Sinema Salonu Otomasyonu");
            this.window.setContentPane(this.getPanel());
            this.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.window.setLayout(null);
            this.window.add(this.getMb());
            this.window.setVisible(true);

            this.window.setSize(800, 600);
        }
        return window;
    }

    public JMenuBar getMb() {
        if (this.mb == null) {
            this.mb = new JMenuBar();
            this.mb.setBounds(0, 0, 800, 25);
            this.mb.setVisible(true);
            this.mb.add(this.getItem2());
            this.mb.add(this.getItem1());

        }
        return mb;
    }

    public void setMb(JMenuBar mb) {
        this.mb = mb;
    }

    public JMenu getItem1() {
        if (this.item1 == null) {
            item1 = new JMenu("EXİT");
            this.item1.setBounds(0, 0, 150, 20);
            this.item1.addActionListener(new MainWindowAction(this));

        }
        return item1;
    }

    public void setItem1(JMenu item1) {
        this.item1 = item1;
    }

    public JMenu getItem2() {
        if (this.item2 == null) {
            this.item2 = new JMenu("Anasayfa");
            this.item2.setBounds(0, 0, 100, 20);

        }
        return item2;
    }

    public void setItem2(JMenu item2) {
        this.item2 = item2;
    }

    public JMenu getItem3() {
        return item3;
    }

    public void setItem3(JMenu item3) {
        this.item3 = item3;
    }

    public void setWindow(JFrame window) {
        this.window = window;
    }

    public JPanel getPanel() {
        if (this.panel == null) {
            this.panel = new JPanel();
            this.getPanel().add(this.getBaslık());
        this.getPanel().add(this.getBtnYntc());//yönetici giriş butonu
        this.getPanel().add(this.getlYntc());//yonetici icon
        this.getPanel().add(this.getlBiletci());//Biletci icon      
        this.getPanel().add(this.getBtnBltci());//biletci girş butonu
        this.getPanel().add(this.getLmusteri());//musteri icon
        this.getPanel().add(this.getBtnMusteri());//musteri giriş butonu
            this.getPanel().setSize(800, 600);
            this.panel.setLayout(null);
            this.panel.setBackground(Color.GRAY);
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getlYntc() {
        if (this.lYntc == null) {
            this.lYntc = new JLabel(new ImageIcon(mg));
            this.lYntc.setBounds(80, 150, 150, 150);

            this.lYntc.setBackground(Color.cyan);

        }
        return lYntc;
    }

    public void setlYntc(JLabel lYntc) {
        this.lYntc = lYntc;
    }

    public JLabel getlBiletci() {
        if (this.lBiletci == null) {
            this.lBiletci = new JLabel(new ImageIcon(mg2));
            this.lBiletci.setBounds(300, 145, 150, 150);
        }

        return lBiletci;
    }

    public void setlBiletci(JLabel lBiletci) {
        this.lBiletci = lBiletci;
    }

    public JLabel getLmusteri() {
        if (this.lmusteri == null) {
            this.lmusteri = new JLabel(new ImageIcon(mg3));
            this.lmusteri.setBounds(520, 145, 150, 150);
        }
        return lmusteri;
    }

    public void setLmusteri(JLabel lmusteri) {
        this.lmusteri = lmusteri;
    }

    public JButton getBtnYntc() {
        if (this.btnYntc == null) {

            this.btnYntc = new JButton("Yönetici Girişi");

            this.btnYntc.setBounds(93, 320, 120, 40);
            this.btnYntc.setBackground(Color.orange);
            this.btnYntc.addActionListener(new MainWindowAction(this));

        }
        return btnYntc;
    }

    public void setBtnYntc(JButton btnYntc) {
        this.btnYntc = btnYntc;
    }

    public JButton getBtnBltci() {
        if (this.btnBltci == null) {
            this.btnBltci = new JButton("Biletci Girişi");
            this.btnBltci.setBackground(Color.orange);
            this.btnBltci.setBounds(320, 320, 120, 40);
            // this.btnBltci.addActionListener((new mainWindow()));
        }
        return btnBltci;
    }

    public void setBtnBltci(JButton btnBltci) {
        this.btnBltci = btnBltci;
    }

    public JButton getBtnMusteri() {
        if (this.btnMusteri == null) {
            this.btnMusteri = new JButton("Müsteri Girişi");
            this.btnMusteri.setBounds(540, 320, 120, 40);
            this.btnMusteri.setBackground(Color.orange);
            // this.btnMusteri.addActionListener((new mainWindow()));
        }
        return btnMusteri;
    }

    public void setBtnMusteri(JButton btnMusteri) {
        this.btnMusteri = btnMusteri;
    }

    public JLabel getBaslık() {
        if (this.baslık == null) {
            Font f1 = new Font("", Font.PLAIN, 45);

            this.baslık = new JLabel("İNÜ Sinema Solunu");
            this.baslık.setBounds(200, 50, 400, 50);
            this.baslık.setFont(f1);
            this.baslık.setForeground(Color.WHITE);
        }
        return baslık;
    }

    public void setBaslık(JLabel baslık) {
        this.baslık = baslık;
    }

    @Override
    public String toString() {
        return "mainWindow{" + "window=" + window + ", panel=" + panel
                + ", lYntc=" + lYntc + ", lBiletci=" + lBiletci
                + ", lmusteri=" + lmusteri + ", btnYntc=" + btnYntc
                + ", btnBltci=" + btnBltci + ", btnMusteri=" + btnMusteri;

    }

}
