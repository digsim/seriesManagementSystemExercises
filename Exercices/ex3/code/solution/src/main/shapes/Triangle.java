package shapes;

import java.awt.Color;
import java.awt.Point;
import shapes.gui.TriangleDialog;

// SOL Triangle
public class Triangle extends Polygon {

    /**
     * 
     */
    private static final long serialVersionUID = 3258410625448096304L;
    protected int[] x;
    protected int[] y;
    //private Color color ;
    private double a;
    private double b;
    private double c;

    public Triangle(int[] x, int[] y, Color color, int id) {
        super(x, y, color, id);
        this.x = x;
        this.y = y;
        //this.color = color;
        setID(id);
        setSidesLenghts();
    }

    public double area() {
        double p = perimeter() / 2;
        return java.lang.Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double perimeter() {
        return a + b + c;
    }

    public String toString() {
        return "(" + getID() + ") Triangle: perimeter = " + perimeter() + ", area = " + area();
    }

    public void change() {
        javax.swing.JDialog d = new TriangleDialog(this);
        d.setVisible(true);
    }

    private void setSidesLenghts() {
        a = dist(x[0], y[0], x[1], y[1]);
        b = dist(x[1], y[1], x[2], y[2]);
        c = dist(x[2], y[2], x[0], y[0]);
    }
    
    @Override
    public boolean contains(Point p) {
        
        //set Point A to (0/0) and recalculate every other points coordinates
        double Bx = x[1] - x[0];
        double By = y[1] - y[0];
        double Cx = x[2] - x[0];
        double Cy = y[2] - y[0];
        double Px = p.getX() - x[0];
        double Py = p.getY() - y[0];
        
        //solve equation: r*B + s*C = P
        double r = ((Px/Bx)-((Py*Cx)/(Cy*Bx)))/(1-((By*Cx)/(Cy*Bx)));
        double s = ((Py-r*By)/Cy);
        return (r>=0 && s>=0 && s+r<=1);
    }
}