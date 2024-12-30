package part3.demoqa.base;

import com.paccy.demoqa.pages.HomePage;
import com.paccy.base.BasePage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;


import static com.paccy.base.BasePage.delay;
import static utilities.Utility.setUtilityDriver;


public class BaseTest {

    protected WebDriver driver;
    protected HomePage homePage;
    protected BasePage basePage;
    protected  String url= "https://demoqa.com/";

    @BeforeClass
    public void  setUp(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication(){
        driver.get(url);
        basePage= new BasePage();
        basePage.setDriver(driver);

        setUtilityDriver();
        homePage= new HomePage();
    }

    @AfterMethod
    public void takeFailedResultScreenshot(ITestResult testResult){
        if (ITestResult.FAILURE == testResult.getStatus()){
            TakesScreenshot screenshot= (TakesScreenshot) driver;
            File source= screenshot.getScreenshotAs(OutputType.FILE);
            File output= new File(System.getProperty("user.dir") +
                    "/resources/screenshots/("+
                    java.time.LocalDate.now() +
                    testResult.getName() + ".png"
                    );
            try {
                FileHandler.copy(source,output);
            } catch (IOException e){
                throw new RuntimeException(e);
            }

            System.out.println("Screenshot located at "+ output);

        }
    }

    @AfterClass
    public void tearDown(){
        delay(3000);
        driver.quit();
    }

}
