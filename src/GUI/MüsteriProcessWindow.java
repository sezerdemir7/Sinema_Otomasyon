package GUI;

import DAO.SeansDAO;
import GUI_Action.MüsteriProcessAction;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.*;

public class MüsteriProcessWindow implements costumPanel {

    private JPanel panel;
    private JLabel Lseans, Lkoltuk, baslık;
    private DefaultListModel model;
    private JList list;
    private JScrollPane sp;
    private Font fn, fn2;
    private SeansDAO seansdao;
    private JButton[] butons;

    @Override
    public JPanel getPanel() {
        if (this.panel == null) {
            this.panel = new JPanel();
            this.panel.setSize(800, 600);
            this.panel.add(this.getLseans());
            this.panel.add(this.getBaslık());
            this.panel.add(this.getLkoltuk());
            for(int j=0;j<this.getButons().length;j++){
                this.panel.add(this.getButons()[j]);
            }
            

            try {
                this.panel.add(this.getSp());
            } catch (IOException ex) {
                Logger.getLogger(MüsteriProcessWindow.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            this.panel.setBackground(Color.gray);
            this.panel.setLayout(null);
        }
        return panel;
    }

    public JButton[] getButons() {
        if(this.butons==null){
            int x=70;
          
            butons=new JButton[20];
            for(int i=0;i<10;i++){
                this.butons[i]=new JButton(""+(i+1));
                
                this.butons[i].setBounds(x, 320, 70, 35);
                this.butons[i].setBackground(Color.cyan);
                this.butons[i].setFont(this.getFn());
                this.butons[i].addActionListener(new MüsteriProcessAction(this));
                x=x+70;
            }
            x=70;
            for(int i=10;i<20;i++){
                this.butons[i]=new JButton(""+(i+1));
                
                this.butons[i].setBounds(x, 380, 70, 35);
                this.butons[i].setBackground(Color.cyan);
                this.butons[i].setFont(this.getFn());
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
