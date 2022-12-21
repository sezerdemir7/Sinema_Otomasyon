package DAO;

import Entity.filmInfo;
import java.io.IOException;

public class filmDAO extends DAO_Abstract{

    public void kaydet(filmInfo film) throws IOException {
        super.kaydet(film); 
    }

    @Override
    public String[] listele(String dosya) throws IOException {
        return super.listele(dosya); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String[] sil(String dosya, String str) throws IOException {
        return super.sil(dosya, str); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
}
