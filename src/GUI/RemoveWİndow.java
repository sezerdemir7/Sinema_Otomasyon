package GUI;

import DAO.SalonDAO;
import DAO.SeansDAO;
import DAO.filmDAO;
import GUI_Action.RemoveWindowAction;
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


public class RemoveWİndow implements costumPanel{
    private JPanel panel;
    private JLabel sec,baslık,salonsec,seanssec;
    private  JList list,listSeans,listSalon;
    private DefaultListModel model,modelSalon,modelSeans;
    private filmDAO flmdao;
    private SalonDAO slndao;
    private SeansDAO seansdao;
    private JScrollPane sp,sp1,sp2;
    private Font fn,fn2;
    private JButton film,salon,seans;
    
    
    @Override
    public JPanel getPanel() {
        if(this.panel==null){
            this.panel=new JPanel();
            this.panel.setSize(800, 600);
            this.panel.add(this.getBaslık());
            this.panel.add(this.getSec());
            this.panel.add(this.getSalonsec());
            this.panel.add(this.getSeanssec());
            this.panel.add(this.getFilm());
            this.panel.add(this.getSalon());
            this.panel.add(this.getSeans());
            
            try {
                this.panel.add(this.getSp());
            } catch (IOException ex) {
                Logger.getLogger(RemoveWİndow.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                this.panel.add(this.getSp1());
            } catch (IOException ex) {
                Logger.getLogger(RemoveWİndow.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                this.panel.add(this.getSp2());
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

    public JButton getFilm() {
        if(this.film==null){
            this.film=new JButton("Film Sil");
            this.film.setBounds(85, 230, 150, 45);
            this.film.setBackground(Color.ORANGE);
            this.film.setFont(this.getFn());
             this.film.addActionListener(new RemoveWindowAction(this));
        }
        return film;
    }

    public void setFilm(JButton film) {
        this.film = film;
    }

    public JButton getSalon() {
        if(this.salon==null){
            this.salon=new JButton("Salon Sil");
            this.salon.setBounds(500, 230, 150, 45);
            this.salon.setBackground(Color.ORANGE);
            this.salon.setFont(this.getFn());
            this.salon.addActionListener(new RemoveWindowAction(this));
        }
        return salon;
    }

    public void setSalon(JButton salon) {
        this.salon = salon;
    }

    public JButton getSeans() {
        if(this.seans==null){
            this.seans=new JButton("Seans Sil");
            this.seans.setBounds(300, 470, 150, 45);
            this.seans.setBackground(Color.ORANGE);
            this.seans.setFont(this.getFn());
            this.seans.addActionListener(new RemoveWindowAction(this));
        }
        return seans;
    }

    public void setSeans(JButton seans) {
        this.seans = seans;
    }
    

    public JLabel getSec() {
        if(this.sec==null){
            this.sec=new JLabel("Film Seç:");
            this.sec.setBounds(85, 70, 150, 45);
            this.sec.setFont(this.getFn());
            this.sec.setForeground(Color.white);
        }
        return sec;
    }

    public void setSec(JLabel sec) {
        this.sec = sec;
    }

    public JLabel getSalonsec() {
        if(this.salonsec==null){
            this.salonsec=new JLabel("Salon Seç:");
            this.salonsec.setBounds(500, 70, 150, 45);
            this.salonsec.setFont(this.getFn());
            this.salonsec.setForeground(Color.white);
        }
        return salonsec;
    }

    public void setSalonsec(JLabel salonsec) {
        this.salonsec = salonsec;
    }

    public JLabel getSeanssec() {
        if(this.seanssec==null){
            this.seanssec=new JLabel("Seans Seç:");
            this.seanssec.setBounds(300, 300, 150, 45);
            this.seanssec.setFont(this.getFn());
            this.seanssec.setForeground(Color.white);
        }
        return seanssec;
    }

    public void setSeanssec(JLabel seanssec) {
        this.seanssec = seanssec;
    }
    
        public JScrollPane getSp() throws IOException {
        if(this.sp==null){
            this.sp=new JScrollPane(this.getList());
            this.sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
             this.sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            this.sp.setBounds(5, 120, 300, 100);
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

    public DefaultListModel getModelSalon() throws IOException {
        if(this.modelSalon==null){
             slndao=new SalonDAO();
             String[] dizi1=slndao.listele("class Entity.salonInfo.txt");
            
             
            this.modelSalon=new DefaultListModel();
            int i;
            for( i=0;i<dizi1.length;i++){
               
               this.modelSalon.addElement(dizi1[i]); 
               
            }
                
            
            
        }
        
        return modelSalon;
    }

    public void setModelSalon(DefaultListModel modelSalon) {
        this.modelSalon = modelSalon;
    }

    public JList getListSeans() throws IOException {
        if(this.listSeans==null){
            this.listSeans = new JList(this.getModelSeans());
            
          
        }
        return listSeans;
    }

    public void setListSeans(JList listSeans) {
        this.listSeans = listSeans;
    }

    public JList getListSalon() throws IOException {
        if(this.listSalon==null){
            this.listSalon = new JList(this.getModelSalon());
            
          
        }
        return listSalon;
    }

    public void setListSalon(JList listSalon) {
        this.listSalon = listSalon;
    }

    public DefaultListModel getModelSeans() throws IOException {
         if(this.modelSeans==null){
             seansdao=new SeansDAO();
             String[] dizi3=seansdao.listele("class Entity.seans.txt");
            
             
            this.modelSeans=new DefaultListModel();
            int i;
            for( i=0;i<dizi3.length;i++){
               
               this.modelSeans.addElement(dizi3[i]); 
               
            }
                
            
            
        }
        return modelSeans;
    }

    public void setModelSeans(DefaultListModel modelSeans) {
        this.modelSeans = modelSeans;
    }

    public JScrollPane getSp1() throws IOException {
        if(this.sp1==null){
            this.sp1=new JScrollPane(this.getListSalon());
            this.sp1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
             this.sp1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            this.sp1.setBounds(400, 120, 300, 100);
        }
        return sp1;
    }

    public void setSp1(JScrollPane sp1) {
        this.sp1 = sp1;
    }

    public JScrollPane getSp2() throws IOException {
         if(this.sp2==null){
            this.sp2=new JScrollPane(this.getListSeans());
            this.sp2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
             this.sp2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            this.sp2.setBounds(100, 350, 600, 100);
        }
        return sp2;
    }

    public void setSp2(JScrollPane sp2) {
        this.sp2 = sp2;
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
