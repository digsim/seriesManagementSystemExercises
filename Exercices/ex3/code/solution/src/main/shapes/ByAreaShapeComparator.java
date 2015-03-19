package shapes;

import java.util.Comparator;

// SOL New class ByAreaShapeComparator

/**
 * A comparator for comparing shapes by their area.
 * 
 * @author Andreas Ruppen
 */
public class ByAreaShapeComparator implements Comparator<Shape> {

    /** 
     * Creates a new instance of <code>ByAreaShapeComparator</code>.
     */
    public ByAreaShapeComparator() {
    }
    
    /**
     * Compares two shapes by their area.
     * 
     * @param the first shape to be compared.
     * @param the second shape to be compared.
     * @return a negative integer, zero, or a positive integer as the first the
     *         area of the first shape is less than, equal to, or greater than 
     *         the area of the second.
     */
    public int compare(Shape shape1, Shape shape2) {
        return Double.compare(shape1.area(), shape2.area());
    }
}
