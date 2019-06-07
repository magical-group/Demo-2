/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Administrator
 */
public class CDBHelperTest {
    
    public CDBHelperTest() {
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
     * Test of getInstance method, of class CDBHelper.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        CDBHelper result = CDBHelper.getInstance();
        if (result != null) {
            System.out.println("testGetInstance ok");
        }
    }

    /**
     * Test of Init method, of class CDBHelper.
     */
    @Test
    public void testInit() {
        System.out.println("Init");
        CDBHelper instance = new CDBHelper();
        CDBHelper.dataPath = "D://Data.db3";
        String result = instance.Init();
        if ("".endsWith(result))
        {
            System.out.println("testInit ok, 数据库连接成功");
        }
        else
        {
            System.out.println("testInit error, 数据库连接失败,errmsg:" + result + CDBHelper.dataPath);
        }
    }

    /**
     * Test of Execute method, of class CDBHelper.
     */
    @Test
    public void testExecute() {
        System.out.println("Execute");
        String sql = "update tb_Device set fi_BoxCount=32";
        CDBHelper instance = new CDBHelper();
        CDBHelper.dataPath = "D://Data.db3";
        if ("".endsWith(instance.Init()))
        {
            int result = instance.Execute(sql);
            if (0 != result)
            {
                System.out.println("testExecute ok");
            }
            else
            {
                System.out.println("testExecute error");
            }
        }
    }

    /**
     * Test of Query method, of class CDBHelper.
     */
    @Test
    public void testQuery() {
        System.out.println("Query");
        CDBHelper instance = new CDBHelper();
        CDBHelper.dataPath = "D://Data.db3";
        instance.Init();
        String strSql = "select fi_DeviceID,fi_BoxCount from tb_Device where fi_DeviceID=9981";
        QueryEntity result = CDBHelper.getInstance().Query(strSql); // 查询数据
        if (!result.hasData) { System.out.println("[Error] <GetDeviceMsg> sql=" + strSql); }
        
        String ret = "";
        ResultSet rs = result.dataRs;
        try {
            if (rs.next()) { 
                ret = "设备号:" + rs.getString("fi_DeviceID") + ",格口数量:" + rs.getString("fi_BoxCount"); 
            }
        } 
        catch (SQLException e) { System.out.println("[Error]SQLException,errmsg:" + e.getMessage()); }
        finally {
           instance.closeQuery(result);
        }
        if ("".endsWith(ret))
        {
            System.out.println("testQuery error");
        }
        else
        {
            System.out.println("testQuery,ok,input:" + strSql + ",result:" + ret);
        }
    }

    /**
     * Test of QueryWithCount method, of class CDBHelper.
     */
    @Test
    public void testQueryWithCount() {
        System.out.println("QueryWithCount");
        String sql = "";
        CDBHelper instance = new CDBHelper();
        instance.Init();
        QueryEntity expResult = null;
        QueryEntity result = instance.QueryWithCount(sql);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of closeQuery method, of class CDBHelper.
     */
    @Test
    public void testCloseQuery() {
        System.out.println("closeQuery");
        QueryEntity entity = null;
        CDBHelper instance = new CDBHelper();
        //instance.closeQuery(entity);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class CDBHelper.
     */
    @Test
    public void testClose() {
        System.out.println("close");
        CDBHelper instance = new CDBHelper();
        //instance.close();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
