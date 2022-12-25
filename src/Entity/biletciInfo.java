
package Entity;


public class biletciInfo extends Human{
    
private String Ysifre;

    @Override
    public String toString() {
        return getAd()+" "+getSoyad()+" "+getTlfon()+" "+getYsifre()+"&";
    }

    public String getYsifre() {
        return Ysifre;
    }

    public void setYsifre(String Ysifre) {
        this.Ysifre = Ysifre;
    }
    
    
    
    
}
