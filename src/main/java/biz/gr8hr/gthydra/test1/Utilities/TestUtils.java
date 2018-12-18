package biz.gr8hr.gthydra.test1.Utilities;


import biz.gr8hr.gthydra.test1.TestBase.TestBase;
import biz.gr8hr.gthydra.test1.dataDriven.Xls_Reader1;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.ArrayList;
import java.util.List;

public class TestUtils extends TestBase {
    static public long page_load_time =20;
    static  public long implicit_wait=20;


    public static ArrayList<Object[]> getDataFromExcel(){
            Xls_Reader1 reader = new Xls_Reader1("C:\\Users\\Rahul Krishna\\IdeaProjects\\Hydra\\src\\main\\java\\biz\\gr8hr\\gthydra\\test1\\testData\\testData.xlsx");
            ArrayList<Object[]> mydata= new ArrayList();
            int coloumncount = reader.getColumnCount("data");
            for (int row = 2; row <= reader.getRowCount("Sheet1"); row++) {
                String username = reader.getCellData("Sheet1", "Username", row);
                String password = reader.getCellData("Sheet1", "Password", row);
                String name = reader.getCellData("Sheet1", "Name", row);
                Object[] ob={username,password,name};
                mydata.add(ob);
            }
            System.out.println("-----------------mydata------"+mydata);
            return mydata;
        }

    public static ArrayList<Object[]> getDataLoginSwitchuser(){
        Xls_Reader1 reader = new Xls_Reader1("C:\\Users\\Rahul Krishna\\IdeaProjects\\Hydra\\src\\main\\java\\biz\\gr8hr\\gthydra\\test1\\testData\\loginSwitchUser.xlsx");
        ArrayList<Object[]> mydata= new ArrayList();
        int coloumncount = reader.getColumnCount("data");
        for (int row = 2; row <= reader.getRowCount("Sheet1"); row++) {
            String username = reader.getCellData("Sheet1", "Username", row);
            String password = reader.getCellData("Sheet1", "Password", row);
            String name = reader.getCellData("Sheet1", "Name", row);
            Object[] ob={username,password,name};
            mydata.add(ob);
        }
        System.out.println("-----------------mydata------"+mydata);
        return mydata;
    }





    }

