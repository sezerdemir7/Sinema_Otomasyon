
package main;

import GUI.mainWindow;
import DAO.YöneticiDAO;
import java.io.IOException;
public class main {

   
    public static void main(String[] args) throws IOException {
        YöneticiDAO YT=new YöneticiDAO();
       
        mainWindow mw=new mainWindow();
        mw.build();
        
        
    }
    
}
