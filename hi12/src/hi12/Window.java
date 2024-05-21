package hi12;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Window extends JFrame implements KeyListener {
    static int score;
    Ball ball = new Ball(this);
    Racquet racquet = new Racquet(this);

    public Window() {
        this.setTitle("不讓球掉下來!!");
        this.setSize(600, 600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.addKeyListener(this);
        this.requestFocus(); 
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.GRAY);
        g2d.setFont(new Font("Verdana", Font.BOLD, 50));
        g2d.drawString(String.valueOf(score), 500, 120);

        racquet.paint(g2d);
        ball.paint(g2d);
    }

    public static void main(String[] args) throws InterruptedException {
        Window window = new Window();
        while (true) {
            window.move();
            window.repaint();
            Thread.sleep(15);
        }
    }

    private void move() {
        ball.moveBall();
        racquet.moveRacquet();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        racquet.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        racquet.keyReleased(e);
    }
}
