package GUI;

import DAO.SeansDAO;
import GUI_Action.MüsteriProcessAction;
import GUI_Action.MüsteriWindowAction;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.*;
import javax.swing.text.Position;

public class MüsteriProcessWindow implements costumPanel {

    private JPanel panel;
    private JLabel Lseans, Lkoltuk, baslık,ara;
    private DefaultListModel model;
    private JList list;
    private JScrollPane sp;
    private Font fn, fn2;
    private SeansDAO seansdao;
    private JButton[] butons;
    private JButton bilet,anasayfa,geri;
    private JTextField searchbox;

    @Override
    public JPanel getPanel() {
        if (this.panel == null) {
            this.panel = new JPanel();
            this.panel.setSize(800, 600);
            this.panel.add(this.getLseans());
            this.panel.add(this.getBaslık());
            this.panel.add(this.getLkoltuk());
            this.panel.add(this.getBilet());
            try {
                this.panel.add(this.getAnasayfa());
            } catch (IOException ex) {
                Logger.getLogger(MüsteriProcessWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                this.panel.add(this.getGeri());
            } catch (IOException ex) {
                Logger.getLogger(MüsteriProcessWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            for(int j=0;j<this.getButons().length;j++){
                this.panel.add(this.getButons()[j]);
            }
            

            try {
                this.panel.add(this.getSp());
            } catch (IOException ex) {
                Logger.getLogger(MüsteriProcessWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.panel.add(this.getAra());
            this.panel.add(this.getSearchbox());
            this.panel.setBackground(Color.gray);
            this.panel.setLayout(null);
        }
        return panel;
    }

    public JTextField getSearchbox() {
        if(this.searchbox==null){
            this.searchbox=new JTextField();
            this.searchbox.setBounds(100, 50, 100, 35);
             this.searchbox.addKeyListener(new KeyAdapter() {
                 @Override
                 public void keyReleased(KeyEvent e) {

                     try {
                         String text = "" + e.getKeyChar();
                         StringBuilder buffer = new StringBuilder();
                         buffer.append(text);
                         String strbuf = buffer.toString();
                         
                         int index = getList().getNextMatch(strbuf, 0, Position.Bias.Forward);
                         //System.out.println(index);
                         
                         getList().setSelectedIndex(index);
                         
                     } catch (IOException ex) {
                         Logger.getLogger(MüsteriProcessWindow.class.getName()).log(Level.SEVERE, null, ex);
                     }
            }
      });
        }
        return searchbox;
    }

    public void setSearchbox(JTextField searchbox) {
        this.searchbox = searchbox;
    }

    public JLabel getAra() {
        if(this.ara==null){
            this.ara=new JLabel("Ara:");
            this.ara.setBounds(45, 50, 50, 45);
            this.ara.setFont(this.getFn());
            this.ara.setForeground(Color.white);
            
        }
        return ara;
    }

    public void setAra(JLabel ara) {
        this.ara = ara;
    }
    
    
    
    
    
    public JButton getAnasayfa() throws IOException {
        if(this.anasayfa==null){
            this.anasayfa=new JButton("AnaSayfa");
            this.anasayfa.setBounds(-15, 0, 150, 25);
            this.anasayfa.setFont(this.getFn());
            this.anasayfa.setBackground(Color.orange);
            this.anasayfa.addActionListener(new MüsteriProcessAction(this));
            
        }
        return anasayfa;
    }
    
    public void setAnasayfa(JButton anasayfa) {
        this.anasayfa = anasayfa;
    }

    public JButton getGeri() throws IOException {
        if(this.geri==null){
            this.geri=new JButton("Geri");
            this.geri.setBounds(715, 0, 85, 25);
            this.geri.setFont(this.getFn());
            this.geri.setBackground(Color.orange);
            this.geri.addActionListener(new MüsteriProcessAction(this));
            
            
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
                
                this.butons[i].setBounds(x, 320, 70, 35);
                this.butons[i].setBackground(Color.cyan);
                this.butons[i].setFont(this.getFn());
                this.butons[i].addActionListener(new MüsteriProcessAction(this));
                x=x+70;
            }
            x=50;
            for(int i=10;i<20;i++){
                this.butons[i]=new JButton(""+(i+1));
                 this.butons[i].setName(""+(i+1));
                 
                this.butons[i].setBounds(x, 380, 70, 35);
                this.butons[i].setBackground(Color.cyan);
                this.butons[i].setFont(this.getFn());
                this.butons[i].addActionListener(new MüsteriProcessAction(this));
                x=x+70;
            }
            
        }
        return butons;
    }

    public void setButons(JButton[] butons) {
        this.butons = butons;
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
            this.sp.setBounds(50, 100, 700, 150);
        }
        return sp;
    }

    public void setSp(JScrollPane sp) {
        this.sp = sp;
    }

    public JLabel getLseans() {
        if (this.Lseans == null) {
            this.Lseans = new JLabel("Seans Seç");
            this.Lseans.setBounds(285, 50, 150, 45);
            this.Lseans.setFont(this.getFn());
            this.Lseans.setForeground(Color.white);

        }
        return Lseans;
    }

    public void setLseans(JLabel Lseans) {
        this.Lseans = Lseans;
    }

    public JLabel getLkoltuk() {
        if(this.Lkoltuk==null){
            this.Lkoltuk=new JLabel("Koltuk No Seç:");
            this.Lkoltuk.setBounds(270, 250, 200, 45);
            this.Lkoltuk.setFont(this.getFn());
            this.Lkoltuk.setForeground(Color.white);
        }
        return Lkoltuk;
    }

    public void setLkoltuk(JLabel Lkoltuk) {
        this.Lkoltuk = Lkoltuk;
    }

    public JButton getBilet() {
        if(this.bilet==null){
            this.bilet=new JButton("Bilet Yazdır");
            this.bilet.setBounds(300, 450, 170, 45);
            this.bilet.setFont(this.getFn());
            this.bilet.setBackground(Color.ORANGE);
            this.bilet.addActionListener(new MüsteriProcessAction(this));
        }
        return bilet;
    }

    public void setBilet(JButton bilet) {
        this.bilet = bilet;
    }
    

    public JLabel getBaslık() {
        if(this.baslık==null){
            this.baslık=new JLabel("Müşteri Bilet İşlemleri");
            this.baslık.setBounds(230, 5, 350, 45);
            this.baslık.setFont(this.getFn2());
            this.baslık.setForeground(Color.white);
        }
        return baslık;
    }

    public void setBaslık(JLabel baslık) {
        this.baslık = baslık;
    }

    public Font getFn() {
        if (this.fn == null) {
            fn = new Font("", Font.HANGING_BASELINE, 25);

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

}
