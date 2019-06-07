/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package func;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Administrator
 */
public class CPipeHelpTest {
    
    public CPipeHelpTest() {
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
     * Test of Now method, of class CPipeHelp.
     */
    @Test
    public void testNow() {
        System.out.println("Now");
        long expResult = 0L;
        long result = CPipeHelp.Now();
        System.out.println("testNow,result:" + result);
    }

    /**
     * Test of Read method, of class CPipeHelp.
     */
    @Test
    public void testRead() {
        System.out.println("Read");
        long result = CPipeHelp.Read();
        System.out.println("testRead,result:" + result);
    }

    /**
     * Test of Write method, of class CPipeHelp.
     */
    @Test
    public void testWrite() {
        System.out.println("Write");
        boolean ret = CPipeHelp.Write();
        System.out.println("testWrite,reault:" + (ret ? "true" : "false"));
    }
    
}
