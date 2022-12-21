
package Entity;




public class seans {
    private String film;
    private String tarih,saat;
    private String ucret;
    private String salon;

    public String getSalon() {
        return salon;
    }

    public void setSalon(String salon) {
        this.salon = salon;
    }

    public String getUcret() {
        return ucret;
    }

    public void setUcret(String ucret) {
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
        return  film + "&" +  saat+ "&" + tarih + "&" + ucret + "TL&" + salon + '&';
    }
    
    
    
   
}
