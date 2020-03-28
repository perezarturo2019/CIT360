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
public class divisionTest {
   
    
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
     * Test of divisionTest method, of class division.
     */
    
    //assertNull
    @Test
    public void testDivisionTestNull() {
        division newDivision = new division();
        int i = newDivision.divisionTest(10, 5);
        assertNotNull(i);
    }
    
    //assertSame
    @Test
    public void testDivideTestSame() {
        division newDivision = new division();
        int i = newDivision.divisionTest(200, 10);
        int x = newDivision.divisionTest(40, 2);
        assertSame(i, x);
    }

    // assertTrue
    @Test
    public void testDivisionTestTrue() {
        division newDivision = new division();
        int i = newDivision.divisionTest(80, 4);
        assertTrue(i == 20);
    }
    
    //assertArrayEquals
    @Test
    public void testDivideTestArrayEquals() {
        division newDivision = new division();
        int [] i = new int[] {newDivision.divisionTest(50, 5)};
        int [] x = new int []{newDivision.divisionTest(10, 1)};
        assertArrayEquals(i, x);
        
    }
    
    // assertFalse
    @Test
    public void testDivisionTestFalse() {
        division newDivision = new division();
        int i = newDivision.divisionTest(22, 4);
        assertFalse(i == 10);
    }
    
    // assertEquals
    @Test
    public void testDivisionTestEquals() {
        division newDivide = new division();
        int i = newDivide.divisionTest(200, 10);
        assertEquals(20, i);
    }
    
    // assertNotNull
    @Test
    public void testDivisionTestNotNull() {
        division newDivision = new division();
        int i = newDivision.divisionTest(40, 4);
        assertNotNull(i);
    }

    //assertNotSame   
    @Test
    public void testDivideTestNotSame() {
        division newDivision = new division();
        int i = newDivision.divisionTest(10, 5);
        int x = newDivision.divisionTest(30, 2);
        assertNotSame(i, x);
    }
}
