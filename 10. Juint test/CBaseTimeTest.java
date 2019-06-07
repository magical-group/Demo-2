/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuncClass;

import UI.CBaseEnum;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class CBaseTimeTest {
    
    public CBaseTimeTest() {
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
     * Test of GetTime method, of class CBaseTime.
     */
    @Test
    public void testGetTime() {
        System.out.println("GetTime");
        int expResult = 60;
        int result = CBaseTime.GetTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of StartThreadTime method, of class CBaseTime.
     */
    @Test
    public void testStartThreadTime() {
        System.out.println("StartThreadTime");
        CBaseTime.StartThreadTime();
    }

    /**
     * Test of StartTime method, of class CBaseTime.
     */
    @Test
    public void testStartTime() {
        System.out.println("StartTime");
        JLabel lblShow = new JLabel();
        int time = 60;
        CBaseTime.StartTime(lblShow, time);
    }

    /**
     * Test of StartTimeWithParam method, of class CBaseTime.
     */
    @Test
    public void testStartTimeWithParam() {
        System.out.println("StartTimeWithParam");
        JLabel lblShow = null;
        int _starttime = 0;
        int _endTime = 0;
        CBaseEnum.FormCase _oFormCase = null;
        Object _param = null;
    }

    /**
     * Test of ReSetTime method, of class CBaseTime.
     */
    @Test
    public void testReSetTime() {
        System.out.println("ReSetTime");
        CBaseTime.ReSetTime();
        System.out.println("Time:" + String.valueOf(CBaseTime.GetTime()));
    }
    
    @Test
    public void StartThreadTime() {
        System.out.println("StartThreadTime");
        CBaseTime.StartThreadTime();
        int i = 0;
        while (i++ < 10)
        {
            System.out.println("Lable:" + CBaseTime.lblSeconds.getText());
            try { Thread.sleep(1000); } catch (InterruptedException ex) { Logger.getLogger(CBaseTimeTest.class.getName()).log(Level.SEVERE, null, ex); }
        }
    }
    
    
}
