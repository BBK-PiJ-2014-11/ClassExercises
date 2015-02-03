package StackandQueue;

import org.junit.Test;

import StringStack.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by Ehshan on 05/01/2015.
 */
public class TestStack {

    private StringStack arrayStack;
    private StringStack pointerStack;

    public TestStack() {
        arrayStack = new ArrayStringStack();
        pointerStack = new PointerStringStack();
    }

    @Test
    public void testEmpty() {
        assertTrue("Not empty", arrayStack.isEmpty());
        assertTrue("Not empty", pointerStack.isEmpty());
    }

    @Test
    public void testPush() {
        arrayStack.push("one");
        pointerStack.push("1");
        assertFalse("Is empty", arrayStack.isEmpty());
        assertFalse("Is empty", pointerStack.isEmpty());
    }

    @Test
    public void testPeek() {
        arrayStack.push("one");
        pointerStack.push("1");
        assertEquals("Wrong string", arrayStack.peek(), "one");
        assertEquals("Wrong string", pointerStack.peek(), "1");
    }

    @Test
    public void testPop() {
        String[] arraysOfOnes = { "1", "one", "une", "uno", "einer"};
        for(int i=0; i<arraysOfOnes.length; i++) {
            arrayStack.push(arraysOfOnes[i]);
            pointerStack.push(arraysOfOnes[i]);

        }
        for(int i=arraysOfOnes.length-1; i>=0; i--) {
            assertEquals("its the wrong number", pointerStack.pop(), arraysOfOnes[i]);
            assertEquals("its the wrong number", arrayStack.pop(), arraysOfOnes[i]);
        }
    }

}

