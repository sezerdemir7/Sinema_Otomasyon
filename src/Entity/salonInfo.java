package Entity;


public class salonInfo {
    private final int koltukSayisi=20;
    private String no;
    private String kat;

    public int getKoltukSayisi() {
        return koltukSayisi;
    }

   

    public String getNo() {
        return no;
    }

   

    public void setNo(String no) {
        this.no = no;
    }

    public String getKat() {
        return kat;
    }

    public void setKat(String kat) {
        this.kat = kat;
    }
     @Override
    public String toString() {
        return  "Salon NO:"+no +" Koltuk Sayisi "+koltukSayisi +" " + kat +".Kat&";
    }
}
