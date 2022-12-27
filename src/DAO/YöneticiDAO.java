package DAO;

import java.io.*;
import Entity.yoneticiInfo;

public class YöneticiDAO extends DAO_Abstract {

    public boolean sifreKontrol(String dosya, String str) throws IOException {

        File f = new File(dosya);
        if (!f.exists()) {
            f.createNewFile();
        }
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        str = str + "&";
        String templine = "";

        while ((templine = br.readLine()) != null) {
            if (templine.contains(str)) {
                return true;
            }
        }
        br.close();
        return false;

    }
}
