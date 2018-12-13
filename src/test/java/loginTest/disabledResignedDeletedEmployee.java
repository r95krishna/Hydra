package loginTest;

import biz.gr8hr.gthydra.test1.TestBase.TestBase;
import biz.gr8hr.gthydra.test1.Utilities.TestUtils;
import biz.gr8hr.gthydra.test1.pages.loginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class disabledResignedDeletedEmployee extends TestBase{
    TestUtils testUtils;
    biz.gr8hr.gthydra.test1.pages.loginPage loginPage;

    @BeforeMethod
    public void Setup() {

        testUtils = new TestUtils();
        loginPage = new loginPage();

    }
    @DataProvider()
    public Iterator<Object[]> getData() {
        ArrayList<Object[]> data = TestUtils.getDataFromExcel();
        return data.iterator();
    }

    @Test(dataProvider = "getData")
    public void loginTest(String username, String password, String name) {
        loginPage.VerifyloginTest(username, password, name);

    }
}
