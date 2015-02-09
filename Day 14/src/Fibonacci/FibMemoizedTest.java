package Fibonacci;

import junit.framework.TestCase;

import static org.junit.Assert.assertEquals;

public class FibMemoizedTest extends TestCase {

    public void testFib() {

        FibMemoized memoTest = new FibMemoized();

        assertEquals(memoTest.fib(10),55);
        assertEquals(memoTest.fib(20),6765);
        assertEquals(memoTest.fib(30),832040);
        assertEquals(memoTest.fib(40),102334155);


    }

}