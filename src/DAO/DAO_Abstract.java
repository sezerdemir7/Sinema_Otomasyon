package DAO;

import java.io.*;
import java.util.ArrayList;

public abstract class DAO_Abstract {

    public void kaydet(Object nesne) throws IOException {
        String dosya = String.valueOf(nesne.getClass());
        dosya = dosya + ".txt";
        File f = new File(dosya);
        if (!f.exists()) {
            f.createNewFile();
        }
        FileWriter fw = new FileWriter(f, true);
        try ( BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(nesne.toString());
            bw.newLine();
            bw.close();
        }
    }

    public String[] listele(String dosya) throws IOException {

        File f = new File(dosya);
        if (!f.exists()) {
            f.createNewFile();
        }
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String str, line = "";
        while ((str = br.readLine()) != null) {
            line = line + str;
        }
        String[] liste = line.split("&");

        return liste;
    }

    public String[] sil(String dosya, String str) throws IOException {
        ArrayList list = new ArrayList();
        File file = new File(dosya);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileReader fileR = new FileReader(file);
        BufferedReader bfr = new BufferedReader(fileR);

        FileWriter fwr = new FileWriter(file, true);
        BufferedWriter bfw = new BufferedWriter(fwr);
        str = str + "&";
        String line = "", tempLine = "";

        while ((line = bfr.readLine()) != null) {

            if (!line.equals(str)) {
                tempLine = tempLine + line;
                list.add(line);

            }

        }
        PrintWriter writer = new PrintWriter(file);
        writer.print("");
        writer.close();

        for (int i = 0; i < list.size(); i++) {

            bfw.write((String) list.get(i));
            bfw.newLine();
        }
        bfw.close();

        String[] liste = tempLine.split("&");

        return liste;

    }



}
