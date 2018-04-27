package br.pucpr;

import br.pucpr.br.pucpr.gui.Button;
import br.pucpr.br.pucpr.gui.Checkbox;
import br.pucpr.br.pucpr.gui.LayoutStrategy;
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

        //Chamadas ao JPanel utilizando a techica de invocation chaining.
        main.setLayout(LayoutStrategy.TOP_DOWN)
                .add(rl)
                .add(lr);

        lr.setLayout(LayoutStrategy.LEFT_RIGHT)
                .add(new Button(10, 10, 20, 20))
                .add(new Button(10, 10, 30, 30))
                .add(new Button(10, 10, 60, 60));

        rl.setLayout(LayoutStrategy.RIGHT_LEFT)
                .add(new Checkbox(10, 10, 10, 10))
                .add(new Checkbox(10, 10, 40, 40))
                .add(new Checkbox(10, 10, 50, 50));
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
