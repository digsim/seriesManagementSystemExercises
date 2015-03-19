package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import shapes.gui.EllipseDialog;

//SOL Ellipse
public class Ellipse extends AShape {

    private static final long serialVersionUID = 3257567291473737782L;
    protected int x;
    protected int y;
    protected int wide;
    protected int high;
    private Color color;

    Ellipse(int x, int y, int wide, int high, Color color, int id) {
        this.x = x;
        this.y = y;
        this.wide = wide;
        this.high = high;
        //this.id = id;
        setID(id);
        this.color = color;
    }

    public double area() {
        return this.wide * this.high * Math.PI;
    }

    public double perimeter() {
        // Returns an apporximation of the perimeter of this ellipse,
        // with the 1914 formula of India's great mathematical genius
        // Srinivasa Aiyangar Ramanujan (1887-1920).
        return Math.PI * Math.sqrt(
                (2 * (Math.pow(wide, 2) + Math.pow(high, 2)) - Math.pow(wide - high, 2)) / 2);
    }

    public String toString() {
        //return "Ellipse with wide " + this.wide + " and high " + this.high;
        return "(" + getID() + ") Ellipse: radius a = " + this.wide + ", radius b = " + this.high + ", perimeter = " + perimeter() + ", area = " + area();
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x - wide, y - high, wide * 2, high * 2);
    }

    public void change() {
        javax.swing.JDialog d = new EllipseDialog(this);
        d.setVisible(true);
    }

    public void change(int x, int y, int w, int h) {
        this.x = x;
        this.y = y;
        this.wide = w;
        this.high = h;
    }

    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }

    public boolean contains(Point p) {
        //inspired by the official java implementation
        //https://openjdk.dev.java.net/source/browse/openjdk/jdk/trunk/jdk/src/share/classes/java/awt/geom/Ellipse2D.java?rev=257&view=markup
        //get the point coordinates (x, y) of the mouse click
        double px = p.getX();
        double py = p.getY();
        // normalize the coordinates compared to the ellipse
        // having a center at 0,0 and a radius of 1.
        double normx = (px - x) / (wide);
        double normy = (py - y) / (high);
        return (normx * normx + normy * normy) <= 1;
    }
}