package biz.gr8hr.gthydra.test1.pages;

import biz.gr8hr.gthydra.test1.TestBase.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class disabledResignedDeletedEmployee extends TestBase {
    @FindBy(xpath = "//input[@id='username']")
    WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    WebElement password;

    @FindBy(xpath = "//button[@class='btn btn-primary btn-block mt-1']/h6")
    WebElement loginButton;

    @FindBy(xpath = "//small[@class='text-danger']")
    WebElement errorText;


    public disabledResignedDeletedEmployee() {
        PageFactory.initElements(driver, this);
    }


    public String VerifyloginTest(String un, String pd, String nm) {
        System.out.println("--------" + username + " " + password + "-----------");
        username.clear();
        username.sendKeys(un);
        password.getClass();
        password.sendKeys(pd);
        loginButton.click();


        System.out.println(un + "  " + nm + "is able to login through hydra application ");

        boolean error = errorText.isDisplayed();
        String text = errorText.getText();
        if (error) {
            System.out.println(text);
        }
        return text;
    }

}





