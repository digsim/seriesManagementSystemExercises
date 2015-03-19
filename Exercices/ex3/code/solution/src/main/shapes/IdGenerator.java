/*
 * IdGenerator.java
 *
 * Created on 4. octobre 2001, 14:34
 */

package shapes;

/**
 *
 * @author Andreas Ruppen
 * @version 
 */
public final class IdGenerator {

	private final static IdGenerator INSTANCE = new IdGenerator();
	
	private int lastId = 0;
    
    /** Creates new IdGenerator */
    private IdGenerator() {
    }
    /**
     * Returns the instance of the ServiceLocator class.
     */
    public static IdGenerator getUniqueInstance() {
        return INSTANCE;
    }

    public int nextId() {
        lastId++;
        return lastId;
    }

	/**
	 * 
	 * @uml.property name="lastId"
	 */
	public void setLastId(int l) {
		lastId = l;
	}

}
