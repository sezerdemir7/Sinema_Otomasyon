package Entity;


public class yoneticiInfo extends Human{
    private String Ysifre;

    public yoneticiInfo() {
        this.setAd("yazılım");
        this.setSoyad("mühendisi");
        this.setTlfon("999");
        this.setYsifre("12345");
    }
    

    public String getYsifre() {
        if(this.Ysifre==null){
            this.Ysifre="12345";
        }
        return Ysifre;
    }

    public void setYsifre(String Ysifre) {
        
        this.Ysifre = Ysifre;
    }

   

    @Override
    public void setTlfon(String tlfon) {
        
        super.setTlfon(tlfon); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getTlfon() {
        
        return super.getTlfon(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setSoyad(String soyad) {
        
        super.setSoyad(soyad); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getSoyad() {
        return super.getSoyad(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void setAd(String ad) {
        
        super.setAd(ad); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String getAd() {
        return super.getAd(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return this.getAd()+" "+this.getSoyad()+" "+this.getTlfon()+" "+this.getYsifre();
    }

   
    
  
    

    

    
    
    

    
   
   
}
