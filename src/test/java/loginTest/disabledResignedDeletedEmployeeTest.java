package loginTest;

import biz.gr8hr.gthydra.test1.TestBase.TestBase;
import biz.gr8hr.gthydra.test1.Utilities.TestUtils;
import biz.gr8hr.gthydra.test1.pages.disabledResignedDeletedEmployee;
import biz.gr8hr.gthydra.test1.pages.loginPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.ArrayList;
import java.util.Iterator;

import static org.testng.Assert.assertEquals;

public class disabledResignedDeletedEmployeeTest extends disabledResignedDeletedEmployee {

    TestUtils testUtils;
    biz.gr8hr.gthydra.test1.pages.loginPage loginPage;
    disabledResignedDeletedEmployeeTest disabledResignedDeletedEmployee1;

    @BeforeMethod
    public void Setup() {

        testUtils = new TestUtils();
        loginPage = new loginPage();
        disabledResignedDeletedEmployee1= new disabledResignedDeletedEmployeeTest();
    }

    @DataProvider()
    public Iterator<Object[]> getData() {
        ArrayList<Object[]> data = TestUtils.getDataFromExcel();
        return data.iterator();
    }

    @Test(dataProvider = "getData")
    public void loginTest(String username, String password, String name) {
        String text = disabledResignedDeletedEmployee1.VerifyloginTest(username, password, name);

        if(text.equals("Username or password is incorrect!")){
            Assert.assertEquals(text,"Username or password is incorrect!","Username or password is incorrect!");
        }
       if(text.equals("Sorry, your account has been disabled. Please contact admin for support. Username and password is required.")){
            Assert.assertEquals(text,"Sorry, your account has been disabled. Please contact admin for support. Username and password is required.","resigned employee");
        }
   }



    @AfterTest
    public void tearDown() {
        driver.close();
    }
}
