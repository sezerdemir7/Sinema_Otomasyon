package DAO;

import java.io.*;
import Entity.yoneticiInfo;

public class YöneticiDAO implements DAO_Interface<yoneticiInfo>{

//    private File f;
//    private FileReader fr;
//    private BufferedReader br;
//    private BufferedWriter bw;
//    private FileWriter fw; 
    String dosya = "yönetici.txt";
    File f = new File(dosya);
    FileReader fr = new FileReader(f);
    BufferedReader br = new BufferedReader(fr);
    FileWriter fw = new FileWriter(f);

    saveDAO s1 = new saveDAO();
    yoneticiInfo ynt = new yoneticiInfo();

    public YöneticiDAO() throws IOException {

        s1.save(ynt.toString(), "yönetici.txt");

    }
  @Override
    public void ekle(yoneticiInfo entity) {
        
    }

    @Override
    public void sil(yoneticiInfo entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public boolean dogrulama(String ad, String soyad, String sifre, String tlfon) throws IOException {
        boolean a, b, c, d;
        int syc1 = 0, syc2 = 0, syc3 = 0, syc4 = 0;
        
        
        if(ad!=null&&soyad!=null&&sifre!=null&&tlfon!=null){
            String str1;
            while ((str1 = br.readLine()) != null) {
                a = str1.contains(ad);
                
                if (a == true) {
                    syc1++;
                }
                b = str1.contains(soyad);
                
                if (b == true) {
                    syc2++;
                }
                c = str1.contains(sifre);
                
                if (c == true) {
                    syc3++;
                }
                d = str1.contains(tlfon);
                
                if (d == true) {
                    syc4++;
                }
                
            }

        }
        else{
            
            return false;
        }
        
        

        if (syc1 == 1 && syc2 == 1 && syc3 == 1 && syc4 == 1) {
            return true;
        }
        return false;
    }

//    public void kaydet() throws IOException {
//        String str=yntc.getSoyad();
//        this.getBw().write(str);
//       this.getBw().close();
//            
//     
//    }
//   public String getDosya() {
//        if(this.dosya==null){
//            this.dosya="yönetici.txt";
//        }
//       
//        return dosya;
//    }
//
//    public void setDosya(String dosya) {
//        this.dosya = dosya;
//    }
//
//    public File getF() {
//        if(this.f==null){
//            f=new File(this.getDosya());
//        }
//        return f;
//    }
//
//    public void setF(File f) {
//        this.f = f;
//    }
//
//    public FileReader getFr() throws FileNotFoundException {
//        if(this.fr==null){
//            fr=new FileReader(this.getF());
//        }
//        return fr;
//    }
//
//    public void setFr(FileReader fr) {
//        this.fr = fr;
//    }
//
//    public BufferedReader getBr() throws FileNotFoundException {
//        if(this.br==null){
//            br=new BufferedReader(this.getFr());           
//        }
//        return br;
//    }
//
//    public void setBr(BufferedReader br) {
//        this.br = br;
//    }
//
//    public FileWriter getFw() throws IOException {
//        if(this.fw==null){
//            fw=new FileWriter(this.getF());
//        }
//        return fw;
//    }
//
//    public void setFw(FileWriter fw) {
//        this.fw = fw;
//    }
//
//    public BufferedWriter getBw() throws IOException {
//        if(this.bw==null){
//            this.bw=new BufferedWriter(this.getFw());
//        }
//        return bw;
//    }
//
//    public void setBw(BufferedWriter bw) {
//        this.bw = bw;
//    }

  
}
