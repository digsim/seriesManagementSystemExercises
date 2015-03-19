package shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import shapes.gui.CircleDialog;

// SOL New class Circle
public class Circle extends Ellipse {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 3258408452127732017L;
	
	private Color color;
    
    public Circle(int x , int y , int wide, Color color, int id) {
        super(x,y,wide,wide,color,id);
        this.color = color;
    }
    
    public double area() {
        return this.wide*this.wide*java.lang.Math.PI;
    }
    
    public double perimeter() {
        return 2*this.wide*java.lang.Math.PI;
    }
    
    public void change() {
        javax.swing.JDialog d = new CircleDialog(this);
        d.setVisible(true);
    }
    
    public void change(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.wide = r;
        this.high = r;
    }
    
    public String toString() {
        return "("+getID()+") Circle: Radius = " + this.wide + ", perimeter = " + perimeter() + ", area = " + area();
    }
    
    public void draw( Graphics g ) {
        g.setColor( color );
        g.fillOval( x-wide , y-wide , wide*2, high*2);
    }
    
    public boolean contains(Point p) {
        int distanceFromCenterX = ((int) p.getX()) - x;
        int distanceFromCenterY = ((int) p.getY()) - y;
        return (distanceFromCenterX*distanceFromCenterX + distanceFromCenterY*distanceFromCenterY) <= wide * wide;
    }
}
