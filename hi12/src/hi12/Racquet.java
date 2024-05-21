package hi12;

import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.Rectangle;

import java.awt.Color;

public class Racquet {
    private static final int WIDTH = 120;
    private static final int HEIGHT = 30;
    private static final int Y = 570;
    private int x = 0;
    private int xa = 0;
    private int step = 10;
    private Window window;

    public Racquet(Window w) {
        this.window = w;
    }

    public void paint(Graphics2D g) {
        g.setColor(Color.black);
        g.fillRect(x, Y, WIDTH, HEIGHT);
    }

    public void moveRacquet() {
        if (x + xa > 0 && x + xa < window.getWidth() - WIDTH)
            x += xa;
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            xa = -step;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            xa = step;
    }

    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_RIGHT)
            xa = 0;
    }

    public java.awt.Rectangle getBounds() {
        return new java.awt.Rectangle(x, Y, WIDTH, HEIGHT);
    }

    public int getTopY() {
        return Y;
    }
}
