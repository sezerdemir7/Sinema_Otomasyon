package GUI;

import DAO.filmDAO;
import java.awt.Color;
import java.awt.Font;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class RemoveWİndow implements costumPanel{
    private JPanel panel;
    private JLabel sec,baslık;
    private  JList list;
    private DefaultListModel model;
    private filmDAO flmdao;
    private JScrollPane sp;
    private Font fn,fn2;
    @Override
    public JPanel getPanel() {
        if(this.panel==null){
            this.panel=new JPanel();
            this.panel.setSize(800, 600);
            this.panel.add(this.getBaslık());
            this.panel.add(this.getSec());
            try {
                this.panel.add(this.getSp());
            } catch (IOException ex) {
                Logger.getLogger(RemoveWİndow.class.getName()).log(Level.SEVERE, null, ex);
            }
                    
            
            
            
            
            
            
            this.panel.setLayout(null);
            this.panel.setBackground(Color.gray);
            
        }
        
        
        
        return panel;

    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }
    

    public JLabel getSec() {
        if(this.sec==null){
            this.sec=new JLabel("Film Seç:");
            this.sec.setBounds(85, 150, 150, 45);
            this.sec.setFont(this.getFn());
            this.sec.setForeground(Color.white);
        }
        return sec;
    }

    public void setSec(JLabel sec) {
        this.sec = sec;
    }
        public JScrollPane getSp() throws IOException {
        if(this.sp==null){
            this.sp=new JScrollPane(this.getList());
            this.sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
             this.sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            this.sp.setBounds(0, 200, 300, 100);
        }
        return sp;
    }

    public void setSp(JScrollPane sp) {
        this.sp = sp;
    }

    public JList getList() throws IOException {
        if(this.list==null){
            this.list = new JList(this.getModel());
            this.list.setBounds(160, 370, 300, 100);
          
        }
        return list;
    }

    public void setList(JList list) {
        this.list = list;
    }

    public DefaultListModel getModel() throws IOException {
        if(this.model==null){
             flmdao=new filmDAO();
             String[] dizi1=flmdao.listele("class Entity.filmInfo.txt");
            
             
            this.model=new DefaultListModel();
            int i;
            for( i=0;i<dizi1.length;i++){
               
               this.model.addElement(dizi1[i]); 
               
            }
                
            
            
        }
        return model;
    }

    public void setModel(DefaultListModel model) {
        this.model = model;
    }

    public JLabel getBaslık() {
        if(this.baslık==null){
            this.baslık=new JLabel("Silme İşlemleri");
            this.baslık.setBounds(210, 20, 300, 45);
            this.baslık.setFont(this.getFn2());
            this.baslık.setForeground(Color.WHITE);
        }
        return baslık;
    }

    public void setBaslık(JLabel baslık) {
        this.baslık = baslık;
    }
    
    

    public Font getFn() {
        if(this.fn==null){
            this.fn=new Font("",Font.PLAIN,25); 
            
        
        }
        return fn;
    }

    public void setFn(Font fn) {
        this.fn = fn;
    }

    public Font getFn2() {
        if(this.fn2==null){
            this.fn2=new Font("",Font.ITALIC,45);
            
        }
        return fn2;
    }

    public void setFn2(Font fn2) {
        this.fn2 = fn2;
    }
    
    
}
