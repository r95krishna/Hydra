package biz.gr8hr.gthydra.test1.pages;

import biz.gr8hr.gthydra.test1.TestBase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class loginPage extends TestBase {

    @FindBy(xpath = "//input[@id='username']")
    WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-block mt-1']/h6")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"feeds\"]/div/div[3]/div[1]/div[2]")
    WebElement userTitle;


    @FindBy(xpath = "//a[@class='float-right forgot-password']")
    WebElement forgetLink;

    @FindBy(xpath = "//h6[@class='m-1']")
    WebElement SignInButton;

    @FindBy(xpath = "//i[@class='gt-icon gt-icon-user']")
    WebElement logoIcon;

    @FindBy(xpath = "//div[@class='text-left']/img")
    WebElement logo;


    @FindBy(xpath = "//h5[text()='Login']")
    WebElement loginText;


    @FindBy(xpath = "//header[@class='text-white text-center']")
    WebElement headerText;

    public loginPage() {
        PageFactory.initElements(driver, this);
    }

    public String VerifyloginTest(String un, String pd, String nm) {
        System.out.println("--------" + username + " " + password + "-----------");
        username.clear();
        username.sendKeys(un);
        password.getClass();
        password.sendKeys(pd);
        loginButton.click();

        System.out.println(nm);
        String usertitle = userTitle.getText();
        return usertitle;

    }

    public String verifycmsHeader() {
        String text = headerText.getText();
        return text;
    }

    public boolean verifylogo() {
        boolean flag = logo.isDisplayed();
        return flag;

    }

    public String verifyloginTextPresent() {
        String logintext = loginText.getText();
        return logintext;
    }

    public boolean verifyloginicon() {
        boolean flag = logoIcon.isDisplayed();
        return flag;
    }


    public boolean verifySignInButton() {
        boolean flag = SignInButton.isDisplayed();
        return flag;
    }


    public String verifyforgetlink() {
        String forgetlink = forgetLink.getText();
        return forgetlink;
    }


}


