package Controller;

import GUI.RemoveWİndow;
import java.io.IOException;

public class RemoveWindowController {

    private RemoveWİndow rw;

    public boolean controlfilm(RemoveWİndow rw) throws IOException {
        this.rw = rw;
        if (rw.getList().getSelectedValue() != null) {
            return true;
        }
        return false;

    }

    public boolean controlsalon(RemoveWİndow rw) throws IOException {
        this.rw = rw;
        if (rw.getListSalon().getSelectedValue() != null) {
            return true;
        }
        return false;

    }

    public boolean controlseans(RemoveWİndow rw) throws IOException {
        this.rw = rw;
        if (rw.getListSeans().getSelectedValue() != null) {
            return true;
        }
        return false;

    }

}
