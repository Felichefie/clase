import java.awt.Color;
import java.awt.Graphics;

public class Car extends Vehicle{
    private int w, h;

    public Car(Dot dot, int speedX, int speedY, Color color){
        super(dot, speedX, speedY, color);
        w = 60;
        h = 30;
    }
    public Car(int x, int y, int speedX, int speedY, Color color){
        super(x, y, speedX, speedY, color);
        w = 60;
        h = 30;
    }
    public void draw(Graphics g){
        g.setColor(this.getColor());
        g.fillRect(getDot().getX(), getDot().getY(), w, h);
        g.setColor(Color.WHITE);
        g.fillOval(getDot().getX() + 5, getDot().getY() + 20,h/2, h/2);
        g.fillOval(getDot().getX() + 40, getDot().getY() + 20,h/2, h/2);
    }
}
