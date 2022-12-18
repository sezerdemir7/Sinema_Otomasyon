
package Entity;

import java.util.Date;


public class seans {
    private String film;
    private Date tarih;
    private int ucret;
    private int salonNo;

    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }
    
    public void listele(){
        //seanslar listeleyip arsından bitane seç me
    }
}
