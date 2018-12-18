package loginTest;

import biz.gr8hr.gthydra.test1.TestBase.TestBase;
import biz.gr8hr.gthydra.test1.Utilities.TestUtils;
import biz.gr8hr.gthydra.test1.pages.loginPage;
import org.junit.After;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;

public class loginPageTest extends TestBase {

    TestUtils testUtils;
    loginPage loginPage;


    @BeforeMethod
    public void Setup() {
        testUtils = new TestUtils();
        loginPage = new loginPage();
    }

    @DataProvider
    public Iterator<Object[]> getData() {
        ArrayList<Object[]> data = TestUtils.getDataFromExcel();
        return data.iterator();
    }

    @Test(dataProvider = "getData", priority = 7)
    public void loginTest(String username, String password, String name) {
        String usertitle = loginPage.VerifyloginTest(username, password, name);
        Assert.assertEquals(usertitle.trim(), name.trim());
    }

    @Test(priority = 1)
    public void cmsHeaderTest() {
        String cmsHeaderText = loginPage.verifycmsHeader();
        Assert.assertEquals(cmsHeaderText, "Welcome to GreytHr\n" +
                "Streamline. Save Time. Better Clime");
    }

    @Test(priority = 2)
    public void logoTest() {
        boolean verifylogo = loginPage.verifylogo();
        Assert.assertEquals(verifylogo, true, " logo is displayed ");
    }

    @Test(priority = 3)
    public void loginTextTest() {
        String loginText = loginPage.verifyloginTextPresent();
        Assert.assertEquals(loginText.trim(), "Login".trim(), " login text is present ");
    }

    @Test(priority = 4)
    public void logoIconTest() {
        boolean verifyloginicon = loginPage.verifyloginicon();
        Assert.assertEquals(verifyloginicon, true, "logo icon is present");
    }

    @Test(priority = 5)
    public void SignInButtonTest() {
        boolean signInbutton = loginPage.verifySignInButton();
        Assert.assertEquals(signInbutton, true, " Sign in button is displayed");
    }

    @Test(priority = 6)
    public void forgetLinkTest() {
        String forgetlink = loginPage.verifyforgetlink();
        Assert.assertEquals(forgetlink.trim(), " Forgot Password? ".trim());
    }

    @AfterTest
    public void TearDown() {
        driver.close();
    }

}
