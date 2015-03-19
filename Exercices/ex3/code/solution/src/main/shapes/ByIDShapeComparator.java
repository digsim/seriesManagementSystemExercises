package shapes;

import java.util.Comparator;

// SOL New class ByIDShapeComparator
/**
 * A comparator for comparing shapes by their id.
 * 
 * @author Andreas Ruppen
 */
public class ByIDShapeComparator implements Comparator<Shape> {

    /** 
     * Creates a new instance of <code>ByIDShapeComparator</code>.
     */
    public ByIDShapeComparator() {
    }
    
    /**
     * Compares two shapes by their id.
     * 
     * @param the first shape to be compared.
     * @param the second shape to be compared.
     * @return a negative integer, zero, or a positive integer as the first the
     *         id of the first shape is less than, equal to, or greater than the
     *         id of the second.
     */
    public int compare(Shape shape1, Shape shape2){
        return shape1.getID() - shape2.getID();
   }
}
