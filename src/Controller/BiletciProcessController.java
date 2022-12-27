package Controller;

import GUI.BiletciProcesWindow;
import java.awt.Color;
import java.io.IOException;

public class BiletciProcessController {

    private BiletciProcesWindow bpw;

    public boolean control(BiletciProcesWindow bpw) throws IOException {
        this.bpw = bpw;
        String ad = bpw.getMüsteriisim().getText();
        

        if (ad.length() > 0 && bpw.getList().getSelectedValue() != null ) {
            return true;
        }

        return false;
    }

    public boolean controlkoltuk(BiletciProcesWindow bpw) {

        int sayac = 0;

        for (int i = 0; i < bpw.getButons().length; i++) {
            if (bpw.getButons()[i].getBackground() == Color.red) {
                sayac++;
            }

        }
        if(sayac==0){
            return false;
        }
        return true;

    }

}
