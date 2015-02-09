package Fibonacci;

import junit.framework.TestCase;

public class FibMemoizedTest extends TestCase {

    public void testFib() {
        Fib fibTest = new Fib();

        //Running tests
        assertEquals(fibTest.fib(10),55);
        assertEquals(fibTest.fib(20),6765);
        assertEquals(fibTest.fib(30),832040);
        assertEquals(fibTest.fib(40),102334155);

        //Wrong Test case
        // assertEquals(fibTest.fib(40),1);


        /*FibMemoized memoTest = new FibMemoized();

        assertEquals(memoTest.fib(10),55);
        assertEquals(memoTest.fib(20),6765);
        assertEquals(memoTest.fib(30),832040);
        assertEquals(memoTest.fib(40),102334155);
        */


    }

}