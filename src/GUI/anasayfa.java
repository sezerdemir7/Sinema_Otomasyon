/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import GUI_Action.anasayfaAction;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;

/**
 *
 * @author muhdm
 */
public class anasayfa implements costumPanel {

    private JPanel panel,panel1,panel2;
    private JLabel baslık, img1, img2, img3, img4;
    private Font fn,fn2;
    private JSlider sld;
    private JButton btn1,btn2,btn3,btn4;

    @Override
    public JPanel getPanel() {
        if (this.panel == null) {
            this.panel = new JPanel();
            this.panel.setSize(800, 600);
            this.panel.add(this.getBaslık());
            //this.panel.add(this.getSld());
            this.panel.add(this.getImg1());
            this.panel.add(this.getBtn1());
            this.panel.setBackground(Color.gray);
            this.panel.setLayout(null);
            this.panel.setVisible(true);

        }
        return panel;
    }


  
    public JLabel getImg1() {
        if (this.img1 == null) {
            Image mg = new ImageIcon(mainWindow.class.getResource("/ikon1.png")).getImage();
            this.img1 = new JLabel(new ImageIcon(mg));
            this.img1.setBounds(200, 150, 300, 250);
        }
        return img1;
    }

    public void setImg1(JLabel img1) {
        this.img1 = img1;
    }

    public JLabel getImg2() {
        if (this.img2 == null) {
           Image mg2 = new ImageIcon(mainWindow.class.getResource("/ikon2.png")).getImage();
            this.img2 = new JLabel(new ImageIcon(mg2));
            this.img2.setBounds(200, 150, 300, 250);
        }
        return img2;
    }

    public void setImg2(JLabel img2) {
        this.img2 = img2;
    }

    public JLabel getImg3() {
        if (this.img3 == null) {
           Image mg3 = new ImageIcon(mainWindow.class.getResource("/ikon3.png")).getImage();
            this.img3 = new JLabel(new ImageIcon(mg3));
            this.img3.setBounds(200, 75, 300, 380);
        }
        return img3;
    }

    public void setImg3(JLabel img3) {
        this.img3 = img3;
    }

    public JLabel getImg4() {
        if (this.img4 == null) {
           Image mg4 = new ImageIcon(mainWindow.class.getResource("/ikon4.png")).getImage();
            this.img4 = new JLabel(new ImageIcon(mg4));
            this.img4.setBounds(200, 75, 280, 360);
        }
        return img4;
    }

    public void setImg4(JLabel img4) {
        this.img4 = img4;
    }

    public JLabel getBaslık() {
        if (this.baslık == null) {
            this.baslık = new JLabel("İNÜ Sinema Salonu ");
            this.baslık.setBounds(200, 15, 400, 50);
            this.baslık.setForeground(Color.white);
            this.baslık.setFont(this.getFn());
        }
        return baslık;
    }

    public void setBaslık(JLabel baslık) {
        this.baslık = baslık;
    }

    public JButton getBtn1() {
        if(this.btn1==null){
            this.btn1=new JButton("Next>");
            this.btn1.setBounds(300, 450, 100, 45);
            this.btn1.setBackground(Color.orange);
            this.btn1.setFont(this.getFn2());
            this.btn1.addActionListener(new anasayfaAction(this));
        }
        return btn1;
    }

    public void setBtn1(JButton btn1) {
        this.btn1 = btn1;
    }

    public JButton getBnt2() {
        if(this.btn2==null){
            this.btn2=new JButton("Next>");
            this.btn2.setBounds(300, 450, 100, 45);
            this.btn2.setBackground(Color.orange);
            this.btn2.setFont(this.getFn2());
            this.btn2.addActionListener(new anasayfaAction(this));
        }
        return btn2;
    }

    public void setBnt2(JButton bnt2) {
        this.btn2 = bnt2;
    }

    public JButton getBtn3() {
        if(this.btn3==null){
            this.btn3=new JButton("Next>");
            this.btn3.setBounds(300, 450, 100, 45);
            this.btn3.setBackground(Color.orange);
            this.btn3.setFont(this.getFn2());
            this.btn3.addActionListener(new anasayfaAction(this));
        }
        return btn3;
    }

    public void setBtn3(JButton btn3) {
        this.btn3 = btn3;
    }

    public JButton getBtn4() {
        if(this.btn4==null){
            this.btn4=new JButton("Next>");
            this.btn4.setBounds(300, 450, 100, 45);
            this.btn4.setBackground(Color.orange);
            this.btn4.setFont(this.getFn2());
            this.btn4.addActionListener(new anasayfaAction(this));
        }
        return btn4;
    }

    public void setBtn4(JButton btn4) {
        this.btn4 = btn4;
    }
    
    
    

    public Font getFn() {
        if (this.fn == null) {
            this.fn = new Font("", Font.ITALIC, 35);

        }
        return fn;
    }

    public void setFn(Font fn) {
        this.fn = fn;
    }

    public Font getFn2() {
        if (this.fn2 == null) {
            this.fn2 = new Font("", Font.ROMAN_BASELINE, 25);

        }
        return fn2;
    }

    public void setFn2(Font fn2) {
        this.fn2 = fn2;
    }

    
    
}
