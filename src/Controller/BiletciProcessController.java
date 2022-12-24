
package Controller;

import GUI.BiletciProcesWindow;
import java.awt.Color;
import java.io.IOException;

public class BiletciProcessController {
    private BiletciProcesWindow bpw;
            
    public boolean control(BiletciProcesWindow bpw) throws IOException{
         this.bpw=bpw;
        String ad=bpw.getMüsteriisim().getText();
        int sayac=0;
        
         for(int i=0;i<bpw.getButons().length;i++){
             if(bpw.getButons()[i].getBackground()==Color.red){
                 sayac++;
             }
             
         }
        if(ad.length()>0&&bpw.getList().getSelectedValue()!=null&&sayac!=0){
            return true;
        } 
          
        
         
         
       
        return false;
    }
    
    
    
}
