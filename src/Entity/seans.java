
package Entity;




public class seans {
    private String film;
    private String tarih,saat;
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

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getSaat() {
        return saat;
    }

    public void setSaat(String saat) {
        this.saat = saat;
    }

    @Override
    public String toString() {
        return  film + "&" + tarih + "&" + saat + "&" + ucret + "&" + salonNo + '&';
    }
    
    
    
    public void listele(){
        //seanslar listeleyip arsından bitane seç me
    }
}
