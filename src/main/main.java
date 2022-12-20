
package main;

import GUI.mainWindow;
import DAO.YöneticiDAO;
import DAO.filmDAO;
import java.io.IOException;
public class main {

   
    public static void main(String[] args) throws IOException {
        YöneticiDAO YT=new YöneticiDAO();
       
        mainWindow mw=new mainWindow();
        mw.build();
        filmDAO f=new filmDAO();
        f.listele("class Entity.filmInfo.txt");
        
    }
    
}
