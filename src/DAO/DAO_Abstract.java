package DAO;

import java.io.*;


public abstract class DAO_Abstract {
    
    public  void kaydet(Object nesne ) throws IOException{
        String dosya=String.valueOf(nesne.getClass());
        dosya=dosya+".txt";
        File f=new File(dosya);
        if(!f.exists()){
            f.createNewFile();
        }
        FileWriter fw=new FileWriter(f,true);
        try (BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(nesne.toString());
            bw.newLine();
        }
    }
    
    
}
