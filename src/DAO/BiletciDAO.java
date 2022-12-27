/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BiletciDAO extends DAO_Abstract {
    
    
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
