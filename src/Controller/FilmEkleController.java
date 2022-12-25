package Controller;

import GUI.FilmEkleWindow;


public class FilmEkleController {
    
    private FilmEkleWindow few;
    
    public boolean control(FilmEkleWindow few){
        this.few=few;
        if(few.getAd().getText().length()>0&&few.getSüre().getText().length()>0){
            return true;
        }
        
        return false;
        
        
        
    }
    
}
