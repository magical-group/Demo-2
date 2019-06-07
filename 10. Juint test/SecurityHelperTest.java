/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Administrator
 */
public class SecurityHelperTest {
    
    public SecurityHelperTest() {
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
     * Test of EncryptDES method, of class SecurityHelper.
     */
    @Test
    public void testEncryptDES() {
        System.out.println("EncryptDES");
        String key = "auaspp01";
        String input = "test";
        String result = SecurityHelper.EncryptDES(key, input);
        System.out.println("DES加密,input:" + input +"， Encrypt:" + result);
    }

    /**
     * Test of DecryptDES method, of class SecurityHelper.
     */
    @Test
    public void testDecryptDES() {
        System.out.println("DecryptDES");
        String key = "auaspp01";
        String input = "3D2EFVw7Jrk=";
        String result = SecurityHelper.DecryptDES(key, input);
        System.out.println("DES解密,input:" + input +"， Decrypt:" + result);
    }
    
}
