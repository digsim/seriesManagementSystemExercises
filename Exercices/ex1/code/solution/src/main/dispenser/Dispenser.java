package dispenser;

/**
 * The <code>Dispenser</code> interface represents a data structure holding a
 * collection of items.
 * 
 * @author Andreas Ruppen
 * @param <E> Type of <code>Dispenser</code> to represent.
 */
public interface Dispenser<E> {

    /**
     * Puts an item into this dispenser.
     * 
     * @param item the item to be put into this dispenser.
     * @throws dispenser.DispenserOverflowException
     */
    public void put(E item) throws DispenserOverflowException;

    /**
     * Removes an item from this dispenser.
     * 
     * @return the item that was removed.
     * @throws dispenser.EmptyDispenserException
     */
    public E remove() throws EmptyDispenserException;

    /**
     * Returns an item of this dispenser without removing it.
     * 
     * @return the item to be returned.
     * @throws dispenser.EmptyDispenserException
     */
    public E item() throws EmptyDispenserException;

    /**
     * Tests if this dispenser is empty.
     * 
     * @return <code>true</code> if and only if the dispenser has no items;
     *         <code>false</code> otherwise.
     */
    public boolean isEmpty();
}