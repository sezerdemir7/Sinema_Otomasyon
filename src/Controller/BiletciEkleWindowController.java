
package Controller;

import GUI.BiletciEkleWindow;


public class BiletciEkleWindowController {
    private BiletciEkleWindow bew;
    
    
    public boolean control(BiletciEkleWindow bew){
        
        this.bew=bew;
       
        if(bew.getTad().getText().length()>0&&bew.getTsoyad().getText().length()>0&&bew.getTlfon().getText().length()>0&&bew.getSifre().getText().length()>0){
            return true;
        }
        
        return false;
        
        
    }
}
