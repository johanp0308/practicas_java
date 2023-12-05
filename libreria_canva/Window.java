package libreria_canva;

import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

public class Window extends JFrame implements Runnable {
    public final static int WIDTH = 800,HEIGHT = 600;
    private Canvas canva;
    private Thread thread;
    private boolean running;
    public Window(){
        setSize(new Dimension(WIDTH,HEIGHT));
        setVisible(true);
        setName("Practica de canva");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        new Window().start();
    }

    public void update(){

    }

    public void draw(){
        
    }

    @Override
    public void run() {

        while (running) {
            
        }

        stop();
    }

    public void start(){
        thread = new Thread(this);
        thread.start();
        running = true;
    }

    public void stop(){
        try {
            thread.join();
            running = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


       
}
