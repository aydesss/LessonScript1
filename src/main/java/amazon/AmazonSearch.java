package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class AmazonSearch {
    //Class attributes
    public WebDriver driver;

    //Annotation and use it with @, in this case is TEST from TestNG.
    @Test

    //Main method of test script
    public void main(){
        //ToDo Create main method
        //ToDo Search something amazon
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptop");
        driver.findElement(By.className("nav-input")).click();
        //System.out.println("I will run test script");
        /*System.out.println("I am Script Test");
        int x = 2, y = 5;

        if (x > y)
            System.out.println("Script Passed");
        else
            //Assertion is for validations
            Assert.fail("Test Failed");*/
        System.out.println("Hi");

    }
    //Activity set that is executed before main method
    @BeforeMethod
    public void BeforeMethod(){
        //ToDo Initialize WebDriver
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ayde Sanchez Rangel\\Desktop\\geckodriver.exe");
        driver = new FirefoxDriver();

        //Put a Implicit wait, this means that any search for elements on the page code could take time the implicit wait is set for before throwing an excepction
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //launch Online Website
        driver.get("https://www.amazon.com");

        System.out.println("I will initialize WebMethod");

    }

    //This method executes after all is executed from main method
    @AfterMethod
    public void AfterMethod(){
        System.out.println("After test is executed I will close the browsing");
        //Todo CleaUp
        driver.quit();

    }
}

