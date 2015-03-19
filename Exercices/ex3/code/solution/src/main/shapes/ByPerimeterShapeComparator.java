package shapes;

import java.util.Comparator;

// SOL New class ByPerimeterShapeComparator
/**
 * A comparator for comparing shapes by their perimeter.
 * 
 * @author Andreas Ruppen
 */
public class ByPerimeterShapeComparator implements Comparator<Shape> {

    /** 
     * Creates a new instance of <code>ByPerimeterShapeComparator</code>.
     */
    public ByPerimeterShapeComparator() {
    }
    
    /**
     * Compares two shapes by their perimeter.
     * 
     * @param the first shape to be compared.
     * @param the second shape to be compared.
     * @return a negative integer, zero, or a positive integer as the first the
     *         perimeter of the first shape is less than, equal to, or greater
     *         than the perimeter of the second.
     */
    public int compare(Shape shape1, Shape shape2) {
        return Double.compare(shape1.perimeter(), shape2.perimeter());
    }
}
