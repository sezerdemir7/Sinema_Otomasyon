package DAO;


import Entity.salonInfo;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;




public class SalonDAO implements DAO_Interface<salonInfo>{

    File f=new File("salon.txt");
 FileWriter fw=new FileWriter(f,true);
        BufferedWriter bw=new BufferedWriter(fw);
    public SalonDAO() throws IOException {
        
       
    }
    
    
    
    
    @Override
    public void ekle(salonInfo entity) {
        try {
            bw.write(entity.toString());
        } catch (IOException ex) {
            Logger.getLogger(SalonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bw.newLine();
        } catch (IOException ex) {
            Logger.getLogger(SalonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(SalonDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void sil(salonInfo entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
