package br.pucpr;

import br.pucpr.br.pucpr.gui.*;
import br.pucpr.br.pucpr.gui.Checkbox;
import br.pucpr.br.pucpr.gui.Panel;


import javax.swing.*;
import java.awt.*;

public class App extends JComponent {

    private Panel main = new Panel(10, 10, 400, 400);
    private Panel rl = new Panel(0,0, 400, 150);
    private Panel lr = new Panel(0,0, 400, 150);

    public App() {
        addMouseMotionListener(main);
        addMouseListener(main);

        main.setLayout(LayoutStrategy.TOP_DOWN);
        lr.setLayout(LayoutStrategy.LEFT_RIGHT);
        rl.setLayout(LayoutStrategy.RIGHT_LEFT);

        main.add(rl).add(lr);

        rl.add(new Checkbox(10, 10, 10, 10))
                .add(new Checkbox(10, 10, 40, 40))
                .add(new Checkbox(10, 10, 50, 50));

        lr.add(new Checkbox(10, 10, 20, 20))
                .add(new Checkbox(10, 10, 30, 30))
                .add(new Checkbox(10, 10, 60, 60));
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g.create();
        main.paint(g2d);
        g2d.dispose();

        repaint();
    }
}
