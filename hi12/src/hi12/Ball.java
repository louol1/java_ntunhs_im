package hi12;

import javax.swing.JPanel;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Rectangle;


public class Ball {
    private static final int ballSize = 60;
    private int x = 1;
    private int y = 1;
    private int step = 10;
    private int incX = step;
    private int incY = step;
    private Window window;

    public Ball(Window w) {
        this.window = w;
    }

    void moveBall() {
        if (collision()) {
            incY = -step;
            y = window.racquet.getTopY() - ballSize;
            Window.score++;
        }

        if (x + incX > window.getWidth() - ballSize)
            incX = -step;
        if (x + incX < 0)
            incX = step;
        if (y + incY > window.getHeight() - ballSize)
            incY = -step;
        if (y + incY < 0)
            incY = step;

        x += incX;
        y += incY;
    }

    public void paint(Graphics2D g) {
        g.setColor(Color.darkGray);
        g.fillOval(x, y, ballSize, ballSize);
    }

    public boolean collision() {
        return window.racquet.getBounds().intersects(getBounds());
    }

    public java.awt.Rectangle getBounds() {
        return new java.awt.Rectangle(x, y, ballSize, ballSize);
    }
}



