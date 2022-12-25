package Controller;
import GUI.BiletciProcesWindow;
import GUI.BiletciWindow;

public class BiletciWindowController {
    
    private BiletciWindow bw;
    
    
    public boolean control(BiletciWindow bw){
        this.bw=bw;
        
       if(bw.getTad().getText().length()>0&&bw.getTsoyad().getText().length()>0&&bw.getTsoyad().getText().length()>0&&bw.getSifre().getText().length()>0){
           return true;
       }
        
        
        
        
        return false;
        
        
    }
    
    
    
}
