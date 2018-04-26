package br.pucpr.br.pucpr.gui;

import java.util.List;

public enum LayoutStrategy {
    TOP_DOWN {
        @Override
        public void adjust(List<Component> components, Panel panel) {
            int y = panel.getY();

            for (Component c : components) {
                c.setPosition(panel.getX(), y);
                y += c.getH() + 5;

                if (y > panel.getH())
                    return;
            }
        }
    }, LEFT_RIGHT {
        @Override
        public void adjust(List<Component> components, Panel panel) {
            int x = panel.getX();
            for (Component c : components) {
                c.setPosition(x, panel.getY());
                x += c.getW() + 5;

                if (x > panel.getW())
                    return;
            }
        }
    }, RIGHT_LEFT {
        @Override
        public void adjust(List<Component> components, Panel panel) {
            int x = panel.getX() + panel.getW();
            for (Component c : components) {
                int cx = x - c.getW();
                if (cx < 0) {
                    return;
                }

                c.setPosition(cx, panel.getY());
                x = cx - 5;
            }

        }
    };

    public abstract void adjust(List<Component> components, Panel panel);

}
