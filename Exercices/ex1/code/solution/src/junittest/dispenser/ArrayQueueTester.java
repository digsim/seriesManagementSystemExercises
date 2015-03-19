package dispenser;


import dispenser.queue.ArrayQueue;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author <a href="mailto:andreas.ruppen@gmail.com">Andreas Ruppen</a>
 */
public class ArrayQueueTester {

    private Dispenser<String> as;
    

    @BeforeClass
    public static void setup() {
    }

    @Before
    public void init() {
        as = new ArrayQueue<String>();
    }

    @Test
    public void putOnEmptyTest() throws  DispenserOverflowException {
        as.put("Hello");
        assertTrue(!as.isEmpty());
    }

    @Test(expected = EmptyDispenserException.class)
    public void removeFromEmpty() throws EmptyDispenserException {
        as.remove();
    }

}
