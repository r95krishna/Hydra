package biz.gr8hr.gthydra.test1.TestBase;

import biz.gr8hr.gthydra.test1.Utilities.TestUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class TestBase {

    public static WebDriver driver;
    public static Properties prop;


    public TestBase() {

        try {
            prop = new Properties();
            FileInputStream fi = new FileInputStream("C:\\Users\\Rahul Krishna\\IdeaProjects\\Hydra\\src\\main\\java\\biz\\gr8hr\\gthydra\\test1\\config\\config.properties");
            prop.load(fi);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @BeforeSuite(alwaysRun = true)
    public void initialisation() {
        String browsername = prop.getProperty("Browsername");
        String browserType = prop.getProperty("BrowserType");
        String url = prop.getProperty("url");

        System.out.println(browsername);
        System.out.println(browserType);
        System.out.println(url);

        if (browsername.equals(browsername)&& browserType.equals(browserType)) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul Krishna\\IdeaProjects\\Hydra\\chromedriver\\chromedriver.exe");
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("incognito");
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            driver = new ChromeDriver(capabilities);

        }
        /*if(browsername.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rahul Krishna\\IdeaProjects\\Hydra\\chromedriver\\chromedriver.exe");
            driver = new ChromeDriver();
        }*/
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(TestUtils.implicit_wait,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(TestUtils.page_load_time,TimeUnit.SECONDS);
        driver.get("http://test1.gthydra.gr8hr.biz/");

    }
}
