package shapes;

import java.awt.Graphics;

// SOL Shape is now Serializable
import java.awt.Point;
public interface Shape extends java.io.Serializable {
    
    double perimeter();
    
    double area();
    
    void change();
    
    int getID();
    
    void setID(int newid);
    
    @Override
    String toString();
    
    void draw(Graphics g);
    
    void move(int dx, int dy);
    
    boolean contains(Point p);
}