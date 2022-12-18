
package DAO;


import java.io.*;
import java.io.IOException;


public class saveDAO {
    
    public  void save(String str ,String dosya) throws IOException{
    File f = new File(dosya);
    if(!f.exists()){
        f.createNewFile();
    }
    FileWriter fw = new FileWriter(f);
        try (BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(str);
        }
    };
    
    
}
