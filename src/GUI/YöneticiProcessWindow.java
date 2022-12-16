
package GUI;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;


public class YöneticiProcessWindow implements costumPanel{
    
    private JPanel panel;
    private JButton filmEkle,filmSil,salonEkle,salonSil,seansEkle,seansSil;
    
    @Override
    public JPanel getPanel() {
        if(this.panel==null){
            this.panel=new JPanel();
            
            this.panel.setSize(800, 600);
            this.panel.add(this.getFilmEkle());
            
            this.panel.setBackground(Color.gray);
            this.panel.setLayout(null);
        }
        
        
        
        return panel;
        
        

    }

    public JButton getFilmEkle() {
        if(this.filmEkle==null){
           filmEkle=new JButton("Flim Ekle");
            this.filmEkle.setBounds(50, 200, 100, 50);
            this.filmEkle.setBackground(Color.orange);
        }
        return filmEkle;
    }

    public void setFilmEkle(JButton filmEkle) {
        this.filmEkle = filmEkle;
    }

    public JButton getFilmSil() {
        return filmSil;
    }

    public void setFilmSil(JButton filmSil) {
        this.filmSil = filmSil;
    }

    public JButton getSalonEkle() {
        return salonEkle;
    }

    public void setSalonEkle(JButton salonEkle) {
        this.salonEkle = salonEkle;
    }

    public JButton getSalonSil() {
        return salonSil;
    }

    public void setSalonSil(JButton salonSil) {
        this.salonSil = salonSil;
    }

    public JButton getSeansEkle() {
        return seansEkle;
    }

    public void setSeansEkle(JButton seansEkle) {
        this.seansEkle = seansEkle;
    }

    public JButton getSeansSil() {
        return seansSil;
    }

    public void setSeansSil(JButton seansSil) {
        this.seansSil = seansSil;
    }
    
}
