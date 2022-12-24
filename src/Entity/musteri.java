package Entity;

public class musteri extends Human{

    @Override
    public String getTlfon() {
        return super.getTlfon(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getSoyad() {
        return super.getSoyad(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getAd() {
        return super.getAd(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
    @Override
    public String toString() {
        return getAd()+" "+getSoyad()+" "+getTlfon()+"&";
    }
    
}
