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
import static org.junit.Assert.*;

/**
 *
 * @author Administrator
 */
public class Base64Test {
    
    public Base64Test() {
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
     * Test of Encrypt method, of class Base64.
     */
    @Test
    public void testEncrypt() {
        System.out.println("Encrypt");
        String content = "112233";
        byte[] data = content.getBytes();
        String result = Base64.Encrypt(data);
        System.out.println("Base64加密,input:" + content + ",result:" + result);
    }

    /**
     * Test of Decrypt method, of class Base64.
     */
    @Test
    public void testDecrypt() {
        System.out.println("Decrypt");
        String s = "MTEyMjMz";
        byte[] result = Base64.Decrypt(s);
        System.out.println("Base64解密,input:" + s + ",result:" + new String (result));
    }

    /**
     * Test of EncodeString method, of class Base64.
     */
    @Test
    public void testEncodeString() {
    }

    /**
     * Test of DecodeString method, of class Base64.
     */
    @Test
    public void testDecodeString() {
    }
    
}
