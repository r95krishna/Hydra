package biz.gr8hr.gthydra.test1.pages;


import biz.gr8hr.gthydra.test1.TestBase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class switchUser extends TestBase{

    @FindBy(xpath = "//input[@id='username']")
    WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-block mt-1']/h6")
    WebElement loginButton;

    public switchUser(){
        PageFactory.initElements(driver,this);
    }

    public void VerifyloginTest(String un, String pd, String nm) {
        System.out.println("--------" + username + " " + password + "-----------");
        username.clear();
        username.sendKeys(un);
        password.getClass();
        password.sendKeys(pd);
        loginButton.click();
    }



    public void verifySwitchUser(){

    }


}