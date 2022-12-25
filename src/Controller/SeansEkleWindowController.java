package Controller;
import GUI.SeansEkleWİndow;
import java.io.IOException;


public class SeansEkleWindowController {
    private SeansEkleWİndow seansw;
    
    public boolean controlfilm(SeansEkleWİndow seansw) throws IOException{
        this.seansw=seansw;
        
        if(seansw.getList().getSelectedValue()==null){
            return true;
        }
        
        return  false;
    }
    
    public boolean  controlsalon(SeansEkleWİndow seansw) throws IOException{
        this.seansw=seansw;
        if(seansw.getListseans().getSelectedValue()==null){
            return true;
            
        }
        return false;
    }
    
    
}
