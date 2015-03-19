package dispenser;

import dispenser.queue.ArrayCircularQueue;
import dispenser.queue.ArrayQueue;
import dispenser.queue.LinkedListQueue;
import dispenser.stack.ArrayStack;
import dispenser.stack.LinkedListStack;
import java.util.logging.*;

/**
 * A test class for the dispenser.
 *
 * @author Andreas Ruppen
 */
public class DispenserTest {

    private static final Logger loggingService = Logger.getLogger("DispenserTest");

    /**
     * Tests the dispenser.
     * @param args
     */
    public static void main(String[] args) {
        Dispenser<Integer> testDispenser;
        Dispenser<String> testDispenser1, testDispenser2;

        // Test the stack implementation using ArrayStack.
        testDispenser = new ArrayStack<Integer>();
        testArrayStack(testDispenser);

        testDispenser1 = new ArrayStack<String>();
        testDispenser2 = new ArrayStack<String>();
        ultimateTest(testDispenser1, testDispenser2);

        // Test the stack implementation using LinkedListStack.
        testDispenser = new LinkedListStack<Integer>();
        testLinkedListStack(testDispenser);

        testDispenser = new ArrayQueue<Integer>();
        testArrayQueue(testDispenser);

        // Test the queue implementation using LinkedListQueue.
        testDispenser = new LinkedListQueue<Integer>();
        testLinkedListQueue(testDispenser);

        // Test the queue implementation using ArrayCircularQueue.
        testDispenser = new ArrayCircularQueue<Integer>();
        testArrayCircularQueue(testDispenser);

        testDispenser1 = new ArrayCircularQueue<String>();
        testDispenser2 = new ArrayCircularQueue<String>();
        ultimateTest(testDispenser1, testDispenser2);
    }

    private static void testArrayQueue(Dispenser<Integer> testDispenser) {
        loggingService.info("");
        loggingService.info("Queue implementation using ArrayQueue:");
        try {
            loggingService.info("put (42)");
            testDispenser.put(42);
            loggingService.info("put (68)");
            testDispenser.put(68);
            loggingService.info("put (111)");
            testDispenser.put(111);
            loggingService.info("put (13)");
            testDispenser.put(13);
        } catch (DispenserOverflowException e1) {
            loggingService.severe("Dispenser overflow Exception");
        }

        try {
            loggingService.info("item: " + testDispenser.item());
            loggingService.info("item: " + testDispenser.item());
            loggingService.info("remove: " + testDispenser.remove());
            loggingService.info("item: " + testDispenser.item());
            loggingService.info("remove: " + testDispenser.remove());
            loggingService.info("isEmpty: " + testDispenser.isEmpty());
            loggingService.info("remove: " + testDispenser.remove());
            loggingService.info("isEmpty: " + testDispenser.isEmpty());
            loggingService.info("remove: " + testDispenser.remove());
            loggingService.info("isEmpty: " + testDispenser.isEmpty());
        } catch (EmptyDispenserException e) {
            loggingService.severe("Dispenser is empty");
        }
    }

    private static void testLinkedListQueue(Dispenser<Integer> testDispenser) {
        loggingService.info("");
        loggingService.info("Queue implementation using LinkedListQueue:");
        try {
            loggingService.info("put (42)");
            testDispenser.put(42);
            loggingService.info("put (68)");
            testDispenser.put(68);
            loggingService.info("put (111)");
            testDispenser.put(111);
            loggingService.info("put (13)");
            testDispenser.put(13);
        } catch (DispenserOverflowException e1) {
            loggingService.severe("Dispenser overflow Execption");
        }

        try {
            loggingService.info("item: " + testDispenser.item());
            loggingService.info("item: " + testDispenser.item());
            loggingService.info("remove: " + testDispenser.remove());
            loggingService.info("item: " + testDispenser.item());
            loggingService.info("remove: " + testDispenser.remove());
            loggingService.info("isEmpty: " + testDispenser.isEmpty());
            loggingService.info("remove: " + testDispenser.remove());
            loggingService.info("isEmpty: " + testDispenser.isEmpty());
            loggingService.info("remove: " + testDispenser.remove());
            loggingService.info("isEmpty: " + testDispenser.isEmpty());
        } catch (EmptyDispenserException e) {
            loggingService.severe("Dispenser is empty");
        }
    }

    private static void testArrayCircularQueue(Dispenser<Integer> testDispenser) {
        loggingService.info("");
        loggingService.info("Queue implementation using ArrayCircularQueue:");
        try {
            loggingService.info("put (42)");
            testDispenser.put(42);
            loggingService.info("put (68)");
            testDispenser.put(68);
            loggingService.info("put (111)");
            testDispenser.put(111);
            loggingService.info("put (13)");
            testDispenser.put(13);
            loggingService.info("put (15)");
            testDispenser.put(15);
        } catch (DispenserOverflowException e1) {
            loggingService.severe("Dispenser overflow exception");
        }

        try {
            loggingService.info("item: " + testDispenser.item());
            loggingService.info("item: " + testDispenser.item());
            loggingService.info("remove: " + testDispenser.remove());
            loggingService.info("item: " + testDispenser.item());
            loggingService.info("remove: " + testDispenser.remove());
            loggingService.info("isEmpty: " + testDispenser.isEmpty());
            loggingService.info("remove: " + testDispenser.remove());
            loggingService.info("isEmpty: " + testDispenser.isEmpty());
            loggingService.info("remove: " + testDispenser.remove());
            loggingService.info("isEmpty: " + testDispenser.isEmpty());
        } catch (EmptyDispenserException e) {
            loggingService.severe("Dispenser is empty");
        }
    }

    private static void testLinkedListStack(Dispenser<Integer> testDispenser) {
        loggingService.info("");
        loggingService.info("Stack implementation using LinkedListStack:");
        try {
            loggingService.info("put (42)");
            testDispenser.put(42);
            loggingService.info("put (68)");
            testDispenser.put(68);
            loggingService.info("put (111)");
            testDispenser.put(111);
        } catch (DispenserOverflowException e1) {
            loggingService.severe("Dispenser overflow exception");
        }

        try {
            loggingService.info("item: " + testDispenser.item());
            loggingService.info("item: " + testDispenser.item());
            loggingService.info("remove: " + testDispenser.remove());
            loggingService.info("item: " + testDispenser.item());
            loggingService.info("remove: " + testDispenser.remove());
            loggingService.info("isEmpty: " + testDispenser.isEmpty());
            loggingService.info("remove: " + testDispenser.remove());
            loggingService.info("isEmpty: " + testDispenser.isEmpty());
            loggingService.info("item: " + testDispenser.item());
        } catch (EmptyDispenserException e) {
            loggingService.severe("Dispenser is empty");
        }
    }

    private static void testArrayStack(Dispenser<Integer> testDispenser) {
        loggingService.info("Stack implementation using ArrayStack:");
        loggingService.info("put (42)");
        try {
            testDispenser.put(42);
            loggingService.info("put (68)");
            testDispenser.put(68);
            loggingService.info("put (111)");
            testDispenser.put(111);
        } catch (DispenserOverflowException e1) {
            loggingService.severe("Dispenser overflow exception");
        }

        try {
            loggingService.info("item: " + testDispenser.item());
            loggingService.info("item: " + testDispenser.item());
            loggingService.info("remove: " + testDispenser.remove());
            loggingService.info("item: " + testDispenser.item());
            loggingService.info("remove: " + testDispenser.remove());
            loggingService.info("isEmpty: " + testDispenser.isEmpty());
            loggingService.info("remove: " + testDispenser.remove());
            loggingService.info("isEmpty: " + testDispenser.isEmpty());
            loggingService.info("item: " + testDispenser.item());
        } catch (EmptyDispenserException e) {
            loggingService.severe("Dispenser is empty");
        }
    }

    private static void ultimateTest(Dispenser<String> testDispenser1, Dispenser<String> testDispenser2) {
        loggingService.info("**************Begin ultimate Test****************");
        try {
            testDispenser1.put("x7");
            testDispenser1.put("x6");
            testDispenser1.remove();

            testDispenser2.put("x5");
            testDispenser2.put("x4");
            testDispenser2.remove();

            testDispenser1.put(testDispenser2.item());

            testDispenser1.put("x2");
            testDispenser1.remove();
            testDispenser1.put("x1");
            testDispenser1.remove();
            loggingService.info(testDispenser1.item());
            loggingService.info("**************End ultimate Test****************");
        } catch (DispenserOverflowException e) {
            loggingService.severe("Dispenser overflow Exception");
        } catch (EmptyDispenserException e) {
            loggingService.severe("Dispenser is empty");
        }
    }
}
