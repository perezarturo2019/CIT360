/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apere
 */
public class PhoneIT {
    
    public PhoneIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isPhoneInMyRoom method, of class Phone.
     */
    @Test
    public void testIsPhoneInMyRoom() {
        System.out.println("Is The Phone In My Room?");
        Phone instance = new Phone(10,10);
        boolean expResult = false;
        boolean result = instance.isPhoneInMyRoom();
        assertEquals(expResult, result);
    }

    @Test
    public void testIsPhoneInMyRoom2() {
        System.out.println("Is The Phone In The Other Room?");
        Phone instance = new Phone(-10,10);
        boolean expResult = true;
        boolean result = instance.isPhoneInMyRoom();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of moveBy method, of class Phone.
     */
    @Test
    public void testMoveBy() {
        System.out.println("Where Is It?");
        int x = 1;
        int y = 1;
        Phone instance = new Phone(10,10);
        instance.moveBy(x, y);
        assertEquals(11, instance.x);
        assertEquals(11, instance.y);
    }

    /**
     * Test of distance method, of class Phone.
     */
    @Test
    public void testDistance() {
        System.out.println("How Far Is It?");
        int x = 13;
        int y = 14;
        Phone instance = new Phone(10,10);
        double expResult = 5.0;
        double result = instance.distance(x, y);
        assertEquals(expResult, result, 0.01);
    }
    
}
