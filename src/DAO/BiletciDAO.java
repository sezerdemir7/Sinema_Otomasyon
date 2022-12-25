/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.io.IOException;


public class BiletciDAO extends DAO_Abstract{

    @Override
    public void kaydet(Object nesne) throws IOException {
        super.kaydet(nesne); 
    }

    @Override
    public String[] listele(String dosya) throws IOException {
        return super.listele(dosya); 
    }

    @Override
    public String[] sil(String dosya, String str) throws IOException {
        return super.sil(dosya, str); 
    }
    
    
}
