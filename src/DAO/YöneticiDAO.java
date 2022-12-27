package DAO;

import java.io.*;
import Entity.yoneticiInfo;
import java.util.logging.Level;
import java.util.logging.Logger;

public class YöneticiDAO extends DAO_Abstract implements Interface_DAO{

    
    @Override
    public boolean sifreKontrol(String dosya, String str)  {

        FileReader fr = null;
        try {
            File f = new File(dosya);
            if (!f.exists()) {
                try {
                    f.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(YöneticiDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }   fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            str = str + "&";
            String templine = "";
            try {
                while ((templine = br.readLine()) != null) {
                    if (templine.contains(str)) {
                        return true;
                    }
                }
            } catch (IOException ex) {
                Logger.getLogger(YöneticiDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(YöneticiDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(YöneticiDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(YöneticiDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return false;

    }
}
