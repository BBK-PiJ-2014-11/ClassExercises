package StackandQueue;

import org.junit.Test;
import org.junit.runners.*;

import Queue.*;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

/**
 * Created by Ehshan on 05/01/2015.
 */

public class TestQueue {

    private personQueue queue;

    public TestQueue() {
        queue = new checkout(1);
    }

    @Test
    public void testEmptyQueue() {
        assertNull("Hold on, there's someone in the queue!", queue.retrieve());
    }

    @Test
    public void testPersonInQueue() {
        person tom = new person("Tomas");
        queue.insert(tom);
        assertNull("Hold on, there's someone in the queue!", queue.retrieve());
    }

    @Test
    public void testtPersonName() {
        person tom = new person("Tomas");
        queue.insert(tom);
        assertEquals("That's not the guy we're looking for", queue.retrieve().getName(), "Tomas");
    }

}
