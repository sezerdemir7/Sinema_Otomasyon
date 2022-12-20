package GUI;

import DAO.SalonDAO;
import DAO.filmDAO;
import GUI_Action.SeansEkleWindowAction;
import java.awt.Color;
import java.awt.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.*;


public class SeansEkleWİndow implements costumPanel{
private JPanel panel;
private JComboBox day,month,year,cbsaat;
private Font fn,fn2;
private DefaultListModel model,modelseans;
private JList list,listseans;
private JScrollPane sp;
private JLabel lSaat,tarih,salon,film,baslık,saat;
private JButton filmSec,kaydet,geri;
private filmDAO flmdao;
private SalonDAO slndao;



@Override
    public JPanel getPanel() {
        if(this.panel==null){
            panel=new JPanel();
            this.panel.setSize(800, 600);
            this.panel.add(this.getDay());
            this.panel.add(this.getTarih());
            this.panel.add(this.getMonth());
            this.panel.add(this.getYear());
            this.panel.add(this.getSalon());
            this.panel.add(this.getFilm());
            this.panel.add(this.getBaslık());
            this.panel.add(this.getCbsaat());
            this.panel.add(this.getSaat());
            this.panel.add(this.getKaydet());
            this.panel.add(this.getGeri());
            try {
                this.panel.add(this.getList());
            } catch (IOException ex) {
                Logger.getLogger(SeansEkleWİndow.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                this.getPanel().add(this.getListseans());
            } catch (IOException ex) {
                Logger.getLogger(SeansEkleWİndow.class.getName()).log(Level.SEVERE, null, ex);
            }
            
//            try {
//                this.panel.add(this.getSp());
//            } catch (IOException ex) {
//                Logger.getLogger(SeansEkleWİndow.class.getName()).log(Level.SEVERE, null, ex);
//            }
            this.panel.setLayout(null);
            this.panel.setVisible(true);
            
            this.panel.setBackground(Color.gray);
           
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JScrollPane getSp() throws IOException {
        if(this.sp==null){
            this.sp=new JScrollPane();
            this.sp.setViewportView(this.getList());
            this.sp.setBounds(440, 370, 20, 100);
        }
        return sp;
    }

    public void setSp(JScrollPane sp) {
        this.sp = sp;
    }
    

    public DefaultListModel getModelseans() throws IOException {
        if(this.modelseans==null){
            this.modelseans=new DefaultListModel();
            slndao=new SalonDAO();
             String[] dizi2=slndao.listele("class Entity.salonInfo.txt");
            int i;
            for( i=0;i<dizi2.length;i++){
               
               this.model.addElement(dizi2[i]); 
               
            }
        }
        return modelseans;
    }

    public void setModelseans(DefaultListModel modelseans) {
        this.modelseans = modelseans;
    }

    public JList getListseans() throws IOException {
        if(this.listseans==null){
           this.listseans = new JList(this.getModelseans());
            this.listseans.setBounds(160, 250, 300, 80);
            
            
        }
        return listseans;
    }

    public void setListseans(JList listseans) {
        this.listseans = listseans;
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

    public JList getList() throws IOException {
        if(this.list==null){
            this.list = new JList(this.getModel());
            this.list.setBounds(160, 370, 300, 100);
            this.list.add(this.getSp());
            
        }
        return list;
    }

    public void setList(JList list) {
        this.list = list;
    }
    
    
    
    

    public JLabel getSalon() {
        if(this.salon==null){
            salon=new JLabel("Salon Seç:");
            this.salon.setBounds(35, 280, 150, 35);
            this.salon.setFont(this.getFn());
            this.salon.setForeground(Color.white);
            
        }
        return salon;
    }

    public JLabel getBaslık() {
        if(this.baslık==null){
            this.baslık=new JLabel("Seans Ekleme Ekranı");
            this.baslık.setBounds(150, 50, 400, 50);
            this.baslık.setForeground(Color.white);
            this.baslık.setFont(this.getFn2());
        }
        return baslık;
    }

    public void setBaslık(JLabel baslık) {
        this.baslık = baslık;
    }

    
    
    public void setSalon(JLabel salon) {
        this.salon = salon;
    }

    public JLabel getFilm() {
        if(this.film==null){
            film=new JLabel("Film Seç:");
            this.film.setBounds(35, 395, 150, 35);
            this.film.setFont(this.getFn());
            this.film.setForeground(Color.white);
        }
        return film;
    }

    public void setFilm(JLabel film) {
        this.film = film;
    }

    public JButton getKaydet() {
        if(this.kaydet==null){
            this.kaydet=new JButton("Kaydet");
            this.kaydet.setBounds(400, 500, 120, 40);
            this.kaydet.setFont(this.getFn());
            this.kaydet.setBackground(Color.orange);
            this.kaydet.addActionListener(new SeansEkleWindowAction(this));
        }
        return kaydet;
    }

    public void setKaydet(JButton kaydet) {
        this.kaydet = kaydet;
    }

    public JButton getGeri() {
        if(this.geri==null){
            this.geri=new JButton("Geri");
            this.geri.setBounds(0, 0, 80, 25);
            this.geri.setBackground(Color.MAGENTA);
            this.geri.setFont(this.getFn());
            this.geri.addActionListener(new SeansEkleWindowAction(this));
        }
        return geri;
    }

    public void setGeri(JButton geri) {
        this.geri = geri;
    }

  
    

    

    public JComboBox getDay() {
        if(this.day==null){
            String arr[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
            day=new JComboBox(arr);
            this.day.setBounds(150, 163, 50, 30);
            
        }
        return day;
    }

    public void setDay(JComboBox day) {
        this.day = day;
    }

    public JComboBox getMonth() {
        if(this.month==null){
            String ay[]={"Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"};
            month=new JComboBox(ay);
            this.month.setBounds(210, 163, 100, 30);
        }
        return month;
    }

    public void setMonth(JComboBox month) {
        this.month = month;
    }

    public JComboBox getYear() {
        if(this.year==null){
            String yıl[]={"2022","2023"};
            year=new JComboBox(yıl);
            this.year.setBounds(320, 163, 100, 30);
            
        }
        return year;
    }
        
    public void setYear(JComboBox year) {
        this.year = year;
    }

    public JComboBox getCbsaat() {
        if(this.cbsaat==null){
            String saat1[]={"12:00","13:00","14:00","15:00","16:00","17:00","18:00","19:00","20:00","21:00","22:00"};
            this.cbsaat=new JComboBox(saat1);
            this.cbsaat.setBounds(160, 215, 100, 30);
            
        }
        return cbsaat;
    }

    public void setCbsaat(JComboBox cbsaat) {
        this.cbsaat = cbsaat;
    }

    public JLabel getSaat() {
        if(this.saat==null){
            this.saat=new JLabel("Saat Seç:");
            this.saat.setBounds(35, 210, 150, 35);
            this.saat.setFont(this.getFn());
            this.saat.setForeground(Color.white);
        }
        return saat;
    }

    public void setSaat(JLabel saat) {
        this.saat = saat;
    }
    

    public JLabel getTarih() {
        if(this.tarih==null){
            tarih=new JLabel("Tarih Seç:");
            this.tarih.setBounds(35, 160, 150, 35);
            this.tarih.setFont(this.getFn());
            this.tarih.setForeground(Color.white);
        }
        return tarih;
    }

    public void setTarih(JLabel tarih) {
        this.tarih = tarih;
    }

    

    public JLabel getlSaat() {
        if(this.lSaat==null){
            lSaat=new JLabel("Saat:");
        }
        return lSaat;
    }

    public void setlSaat(JLabel lSaat) {
        this.lSaat = lSaat;
    }

    public Font getFn() {
        if(this.fn==null){
            fn=new Font("",Font.PLAIN,25); 
            
            
        }
        return fn;
    }

    public void setFn(Font fn) {
        this.fn = fn;
    }

    public Font getFn2() {
        if(this.fn2==null){
            fn2 =new Font("",Font.ITALIC,40) ;
            
        }
        return fn2;
    }

    public void setFn2(Font fn2) {
        this.fn2 = fn2;
    }


    
    
    
    
    
    
}
