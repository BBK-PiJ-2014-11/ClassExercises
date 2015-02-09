package Fibonacci;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ehshan on 19/01/2015.
 */
public class FibTest {

    public void fTest() {
        Fib fibTest = new Fib();

        //Running tests
        assertEquals(fibTest.fib(10),55);
        assertEquals(fibTest.fib(20),6765);
        assertEquals(fibTest.fib(30),832040);
        assertEquals(fibTest.fib(40),102334155);

        //Wrong Test case
        // assertEquals(fibTest.fib(40),1);
    }

}
