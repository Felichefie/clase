import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.Timer;
import javax.swing.JPanel;

public class MyCanvas extends JPanel implements ActionListener{
    ArrayList<Car> cars = new ArrayList<Car>();

    public MyCanvas () {
        setPreferredSize(new Dimension(400,300));
        setBackground(Color.GRAY);
        Timer timer = new Timer(60, this);
        timer.start();
        cars.add(new Car(10, 250, 2, 0, Color.RED));
        cars.add(new Car(10, 200, 3, 0, Color.BLUE));
        cars.add(new Car(10, 150, 4, 0, Color.GREEN));
        cars.add(new Car(10, 100, 5, 0, Color.ORANGE));
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        Paintbrush paintBrush = new Paintbrush(g);
        paintBrush.drawSky();
        paintBrush.drawMountains();
        for(Car c : cars){
            c.move();
            c.draw(g);
        }
        paintBrush.drawTree();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
