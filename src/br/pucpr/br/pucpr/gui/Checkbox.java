package br.pucpr.br.pucpr.gui;

import java.awt.*;
import java.awt.event.MouseEvent;

public class Checkbox extends AbstractComponent {
    private boolean checked = false;

    public Checkbox(int x, int y, int w, int h) {
        super(x, y, w, h);
    }

    @Override
    public void paint(Graphics2D g) {
        if (checked) {
            g.setColor(Color.GREEN.darker());
            g.drawLine(x, y, x+w, y+h);
            g.drawLine(x+w, y, x, y+h);
        }

        g.setColor(Color.BLACK);
        g.drawRect(x, y, w, h);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (isHovered) checked = !checked;
    }

    public boolean isChecked() {
        return checked;
    }
}
