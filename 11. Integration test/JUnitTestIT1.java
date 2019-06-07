/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import DB.CDBHelper;
import DB.QueryEntity;
import FuncClass.CDataMgr;
import UI.COffDataProperty;
import static func.CCommondFunc.OffLine_Execute;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import rest.CRestHelper;
import rest.PostResult;
import txt.CTxtHelp;

/**
 *
 * @author Administrator
 */
public class JUnitTestIT1 {
    
    public JUnitTestIT1() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void uploadData() 
     {
        // 添加离线数据
        CDBHelper instance = new CDBHelper();
        //CDBHelper.dataPath = "D://Data.db3";
        String initResult = instance.Init();
        if ("".endsWith(initResult))
        {
            String updateSql = "update tb_Device set fs_Content='test' where fi_DeviceID=9981";
            updateSql = updateSql.replace("'", "''");
            String insertSql = "insert into tb_OffLineData (fi_Type,fs_Data) values (" + String.valueOf(OffLine_Execute) + ",'" + updateSql + "')";
            int executeResult = instance.Execute(insertSql);
            if (0 != executeResult)
            {
                System.out.println("Successful addition of offline data");
                // 获取离线数据
                ArrayList<COffDataProperty> lstOff = new ArrayList(); 
                String selectSql = "select fi_ID,fi_Type,fs_Data from tb_OffLineData order by fi_ID asc limit 0,50";
                QueryEntity result = instance.Query(selectSql); // 查询数据
                if (result.hasData) 
                {
                    ResultSet rs = result.dataRs;;
                    try 
                    {
                        while (rs.next()) 
                        {
                            COffDataProperty entity = new COffDataProperty();
                            entity.ID = Integer.parseInt(rs.getString("fi_ID")); 
                            entity.Type  = Integer.parseInt(rs.getString("fi_Type")); 
                            entity.Data = rs.getString("fs_Data");
                            lstOff.add(entity);
                        } 
                    }
                    catch (SQLException e) { CTxtHelp.AppendLog("[Error]SQLException,errmsg:" + e.getMessage()); }
                    finally {
                        instance.closeQuery(result);
                    }
                    System.out.println("Number of Offline Data Bars:" + String.valueOf(lstOff.size()));
                    int successCount = 0;
                    for (int i = 0; i < lstOff.size(); i++) 
                    {
                        COffDataProperty entity1 = lstOff.get(i);
                        switch (entity1.Type) 
                        {
                            case func.CCommondFunc.OffLine_Execute:
                                // 上传离线数据
                                if (CRestHelper.ExecuteNonQuery("http://117.25.162.156:8362/ApiService/Upload", entity1.Data) != PostResult.NETERROR) 
                                {
                                    String deleteSql ="delete from tb_OffLineData where fi_ID=" + entity1.ID;
                                    instance.Execute(deleteSql);
                                    successCount++;
                                }
                                break;
                        }
                    }
                    System.out.println("Upload Success Number:" + successCount);
                }
            }
            else
            {
                System.out.println("Failed to add offline data");
            }
        }
        
       

                    
                    
     }
}
