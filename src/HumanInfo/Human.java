
package HumanInfo;


public abstract class Human {
    private String ad;
    private String soyad;
    private String tlfon;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTlfon() {
        return tlfon;
    }

    public void setTlfon(String tlfon) {
        this.tlfon = tlfon;
    }

    @Override
    public String toString() {
        return "Human{" + "ad=" + ad + ", soyad=" + soyad + ", tlfon=" + tlfon + '}';
    }

    
}
