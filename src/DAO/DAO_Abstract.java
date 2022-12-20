package DAO;

import java.io.*;
import java.util.ArrayList;


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
    
    public String[] listele(String dosya) throws IOException{
        ArrayList list=new ArrayList();
       // ArrayList liste2=new ArrayList();
        File f=new File(dosya);
        if(!f.exists()){
            f.createNewFile();
        }
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        String str,line="";
        while((str=br.readLine())!=null){
            line=line+str;
        }
        String[] liste=line.split("&");
        for(String a: liste){
            System.out.println(a);
        }
        
        
        
        return liste;
    }
    
    
}
