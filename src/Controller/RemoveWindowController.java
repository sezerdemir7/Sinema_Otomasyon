package Controller;

import GUI.RemoveWİndow;
import java.io.IOException;

public class RemoveWindowController {

    private RemoveWİndow rw;

    public boolean control(RemoveWİndow rw) throws IOException {
        this.rw = rw;
        if (rw.getList().getSelectedValue() != null||rw.getListSalon().getSelectedValue()!=null||rw.getListSeans().getSelectedValue()!=null) {
            return true;
        }

        return false;

    }

}
