/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import DAO.SeansDAO;
import GUI_Action.BiletciProcessAction;
import GUI_Action.YoneticiWindowAction;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class BiletciProcesWindow implements costumPanel {

    private JPanel panel;
    private JLabel müşteriadi, salonseç, koltukseç, biletsatis;
    private JButton giris,yenile,geri;
    private Font fn;
    private JTextField müsteriisim;
    private JList list;
    private DefaultListModel model;
    private JScrollPane sp;
    private SeansDAO seansdao;
     private JButton[] butons;

    @Override
    public JPanel getPanel() {
        if (this.panel == null) {
            this.panel = new JPanel();
            this.panel.setSize(800, 600);

            this.panel.add(this.getBiletsatis());
            this.panel.add(this.getGiris());
            this.panel.add(this.getMüşteriadi());
            this.panel.add(this.getSalonseç());
            this.panel.add(this.getKoltukseç());
            this.panel.add(this.getMüsteriisim());
            this.panel.add(this.getYenile());
            this.panel.add(this.getGeri());
            try {
                this.panel.add(this.getSp());
            } catch (IOException ex) {
                Logger.getLogger(BiletciProcesWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            for(int j=0;j<this.getButons().length;j++){
                this.panel.add(this.getButons()[j]);
            }

            this.panel.setBackground(Color.gray);
            this.panel.setLayout(null);

        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JButton getYenile() {
        if(this.yenile==null){
            this.yenile=new JButton("Yenile");
            this.yenile.setBounds(0, 0, 100, 35);
            this.yenile.setBackground(Color.ORANGE);
            this.yenile.setFont(this.getFn());
            this.yenile.addActionListener(new BiletciProcessAction(this));
        }
        return yenile;
    }

    public void setYenile(JButton yenile) {
        this.yenile = yenile;
    }
    public JButton getGeri() {
        if(this.geri==null){
            this.geri=new JButton("Geri");
            this.geri.setBounds(700, 0, 85, 35);
            this.geri.setFont(this.getFn());
            this.geri.setBackground(Color.orange);
            this.geri.addActionListener(new BiletciProcessAction(this));
            
            
        }
        return geri;
    }

    public void setGeri(JButton geri) {
        this.geri = geri;
    }
    
    
    public JButton[] getButons() {
        if(this.butons==null){
            int x=50;
          
            butons=new JButton[20];
            for(int i=0;i<10;i++){
                this.butons[i]=new JButton(""+(i+1));
                this.butons[i].setName(""+(i+1));
                
                this.butons[i].setBounds(x, 340, 70, 35);
                this.butons[i].setBackground(Color.cyan);
                this.butons[i].setFont(this.getFn());
                this.butons[i].addActionListener(new BiletciProcessAction(this));
                x=x+70;
            }
            x=50;
            for(int i=10;i<20;i++){
                this.butons[i]=new JButton(""+(i+1));
                 this.butons[i].setName(""+(i+1));
                this.butons[i].setBounds(x, 400, 70, 35);
                this.butons[i].setBackground(Color.cyan);
                this.butons[i].setFont(this.getFn());
                 this.butons[i].addActionListener(new BiletciProcessAction(this));
                x=x+70;
            }
            
        }
        return butons;
    }

    public DefaultListModel getModel() throws IOException {
        if (this.model == null) {
            seansdao = new SeansDAO();
            String[] dizi3 = seansdao.listele("class Entity.seans.txt");

            this.model = new DefaultListModel();
            int i;
            for (i = 0; i < dizi3.length; i++) {

                this.model.addElement(dizi3[i]);

            }

        }

        return model;
    }

    public void setModel(DefaultListModel model) {
        this.model = model;
    }

    public JList getList() throws IOException {
        if (this.list == null) {
            this.list = new JList(this.getModel());

        }
        return list;
    }

    public void setList(JList list) {
        this.list = list;
    }

    public JScrollPane getSp() throws IOException {
        if (this.sp == null) {
            this.sp = new JScrollPane(this.getList());
            this.sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            this.sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            this.sp.setBounds(50, 140, 700, 150);
        }
        return sp;
    }

    public void setSp(JScrollPane sp) {
        this.sp = sp;
    }

    public JTextField getMüsteriisim() {
        if (this.müsteriisim == null) {
            müsteriisim = new JTextField();
            this.müsteriisim.setBounds(150, 75, 150, 35);
        }
        return müsteriisim;
    }

    public void setMüsteriisim(JTextField müsteriisim) {
        this.müsteriisim = müsteriisim;
    }

    public JLabel getMüşteriadi() {
        if (this.müşteriadi == null) {
            müşteriadi = new JLabel("Müşteri Adı:");
            this.müşteriadi.setFont(this.getFn());
            this.müşteriadi.setForeground(Color.WHITE);
            this.müşteriadi.setBounds(30, 70, 180, 40);
        }
        return müşteriadi;
    }

    public void setMüşteriadi(JLabel müşteriadi) {
        this.müşteriadi = müşteriadi;
    }

    public JLabel getSalonseç() {
        if (this.salonseç == null) {
            salonseç = new JLabel("Seans Seç:");
            this.salonseç.setFont(this.getFn());
            this.salonseç.setForeground(Color.white);
            this.salonseç.setBounds(280, 105, 180, 40);
        }
        return salonseç;
    }

    public void setSalonseç(JLabel salonseç) {
        this.salonseç = salonseç;
    }

    public JLabel getKoltukseç() {
        if (this.koltukseç == null) {
            koltukseç = new JLabel("Koltuk Seç:");
            this.koltukseç.setFont(this.getFn());
            this.koltukseç.setForeground(Color.white);
            this.koltukseç.setBounds(280, 290, 180, 40);
        }
        return koltukseç;
    }

    public void setKoltukseç(JLabel koltukseç) {
        this.koltukseç = koltukseç;
    }

    public JLabel getBiletsatis() {
        if (this.biletsatis == null) {
            biletsatis = new JLabel("Bilet Satış Danışman İşlemleri");
            this.biletsatis.setFont(this.getFn());
            this.biletsatis.setForeground(Color.WHITE);
            this.biletsatis.setFont((new Font("", Font.ITALIC, 30)));
            this.biletsatis.setBounds(200, 5, 450, 40);
        }
        return biletsatis;
    }

    public void setBiletsatis(JLabel biletsatis) {
        this.biletsatis = biletsatis;
    }

    public JButton getGiris() {
        if (this.giris == null) {
            giris = new JButton("Bileti Yazdir");
            this.giris.setBounds(250, 470, 150, 40);
            this.giris.setBackground(Color.ORANGE);
            this.giris.setFont(this.getFn());
             this.giris.addActionListener(new BiletciProcessAction(this));
        }
        return giris;
    }

    public void setGiris(JButton giris) {
        this.giris = giris;
    }

    public Font getFn() {
        if (this.fn == null) {
            fn = new Font("", Font.HANGING_BASELINE, 20);

        }
        return fn;
    }

    public void setFn(Font fn) {
        this.fn = fn;
    }

}
