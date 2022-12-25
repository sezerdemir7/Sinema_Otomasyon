/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

/**
 *
 * @author muhdm
 */
public class ansayfa implements costumPanel {

    private JPanel panel;
    private JLabel baslık;
    private Font fn;
    private JSlider sld;

    @Override
    public JPanel getPanel() {
        if (this.panel == null) {
            this.panel = new JPanel();
            this.panel.setSize(800, 600);
            this.panel.add(this.getBaslık());
            this.panel.add(this.getSld());

            this.panel.setBackground(Color.gray);
            this.panel.setVisible(true);

        }
        return panel;
    }

    public JSlider getSld() {
        if (this.sld == null) {
            this.sld = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
            this.sld.setBounds(300, 200, 50, 25);
            this.sld.setMinorTickSpacing(2);
            this.sld.setMajorTickSpacing(10);
            this.sld.setPaintTicks(true);
            this.sld.setPaintLabels(true);
        }
        return sld;
    }

    public void setSld(JSlider sld) {
        this.sld = sld;
    }

    public JLabel getBaslık() {
        if (this.baslık == null) {
            this.baslık = new JLabel("İNÜ Sinema Salonu ");
            this.baslık.setBounds(200, 45, 400, 50);
            this.baslık.setForeground(Color.white);
            this.baslık.setFont(this.getFn());
        }
        return baslık;
    }

    public void setBaslık(JLabel baslık) {
        this.baslık = baslık;
    }

    public Font getFn() {
        if (this.fn == null) {
            this.fn = new Font("", Font.ITALIC, 35);

        }
        return fn;
    }

    public void setFn(Font fn) {
        this.fn = fn;
    }

}
