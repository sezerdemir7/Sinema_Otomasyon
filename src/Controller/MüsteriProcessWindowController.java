package Controller;
import GUI.MüsteriProcessWindow;
import java.awt.Color;
import java.io.IOException;

public class MüsteriProcessWindowController {
    private MüsteriProcessWindow mpw;
    
  
    public boolean control(MüsteriProcessWindow mpw) throws IOException{
         this.mpw= mpw;
         int sayac=0;
         if(mpw.getList().getSelectedValue()==null){
             return false;
         }
         for(int i=0;i<mpw.getButons().length;i++){
             if(mpw.getButons()[i].getBackground()==Color.red){
                 sayac++;
             }
             
         }
         if(sayac==0){
             return false;
         }
         
        
        return true;
    }

    
    
    
}
