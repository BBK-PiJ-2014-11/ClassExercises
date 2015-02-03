package Persons;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testName() {
        Person tom = new Person();
        String name = "Tomas Rosicky";
        String initials = tom.getInitials(name);
        assertEquals(initials, "TR");
    }

    @Test
    public void testFullName() {
        Person dick = new Person();
        String name = "Richard the Third";
        String initials = dick.getInitials(name);
        assertEquals(initials, "RTT");
    }

    @Test
    public void testNameWithSpaces() {
        Person harry = new Person();
        String name = "Harold   Francis   Callahan";
        String initials = harry.getInitials(name);
        assertEquals(initials, "HFC");
    }

    @Test
    public void testNameWithStartSpace() {
        Person john = new Person();
        String name = "   John Doe";
        String initials = john.getInitials(name);
        assertEquals(initials, "JD");
    }

}