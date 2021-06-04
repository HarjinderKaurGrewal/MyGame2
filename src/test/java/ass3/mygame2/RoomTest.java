/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ass3.mygame2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Guntaz
 */
public class RoomTest {

    Room garden;

    public RoomTest() {
        garden = new Room("garden", "You are in the garden area", true);
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setExit method, of class Room.
     */
    @Test
    public void testSetExit() {
        System.out.println("setExit");
        String direction = "south";
        Room kitchen = null;
        //Room instance = null;
        garden.setExit("south", kitchen);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getShortDescription method, of class Room.
     */
    @Test
    public void testGetShortDescription() {
        System.out.println("getShortDescription");
        //Room instance = null;
        String expResult = "You are in the garden area";
        String result = garden.getShortDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getExit method, of class Room.
     */
    @Test
    public void testGetExit() {
        System.out.println("getExit");
        String direction = "south";
        //Room instance = null;
        Room expResult = null;
        Room result = garden.getExit("south");
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLockedStatus method, of class Room.
     */
    @Test
    public void testGetLockedStatus() {
        System.out.println("getLockedStatus");
        //Room instance = null;
        boolean expResult = true;
        boolean result = garden.getLockedStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class Room
     */
    @Test
    public void testGetName() {

        System.out.println("getName");
        String expected = "garden";
        //String expected = "guns";     // failed test
        String actual = garden.getName();

        assertEquals(expected, actual);
    }

}
