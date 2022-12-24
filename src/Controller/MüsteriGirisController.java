
package Controller;


import GUI.MüsteriWindow;


public class MüsteriGirisController {
    private MüsteriWindow müw;
    public boolean control(MüsteriWindow müw){
       this.müw=müw;
     
       String ad=müw.getFad().getText();
        String[]  s=ad.split("&");
       String soyad=müw.getFsoyad().getText();
       String tlfn=müw.getFtlfon().getText();
        
        if(ad.length()>0&&soyad.length()>0&&tlfn.length()>0){
            return true;
        }
        else{
            return false;
        }
       
       
    }
    
}
