package biz.gr8hr.gthydra.test1.pages;

import biz.gr8hr.gthydra.test1.TestBase.TestBase;
import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
    public static void main(String[] args) {


        WebDriver driver;
        driver= new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
        driver.get("http://test1.gthydra.gr8hr.biz/");
    }
}