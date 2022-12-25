package Controller;

import GUI.YoneticiWindow;

public class YöneticiWindowController {

    private YoneticiWindow yw;

    public boolean control(YoneticiWindow yw) {
        this.yw = new YoneticiWindow();

        if (yw.getTad().getText().length() > 0 && yw.getTsoyad().getText().length() > 0 && yw.getTlfon().getText().length() > 0 && yw.getSifre().getText().length() > 0) {
            return true;
        }

        return false;

    }
}
