package Controller;

import GUI.SalonEkleWindow;


public class SalonEkleWindowController {
    private SalonEkleWindow sew;
    
    public boolean control(SalonEkleWindow sew){
        this.sew=sew;
        if(sew.getNo().getText().length()>0){
            return true;
        }
        
        return false;
        
    }
            
}
