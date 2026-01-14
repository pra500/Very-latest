package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Gdd
    {

WebDriver driver;


        @BeforeClass(alwaysRun = true)
        public void setup() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
            driver.manage().deleteAllCookies();
            driver.get("https://www.makemytrip.com/");
        }

        @AfterClass(alwaysRun = true)
        public void teardown() {

            driver.quit();
        }

        //1) Verify Home Page Loads Successfully
        @Test(priority = 0)
        public void chatbotTest()
        {
boolean b=

            driver.findElement(By.xpath("//textarea[@class='tp-dt-enhanced-input-box']"))
                    .isDisplayed();
Assert.assertTrue(b);


        }




    }

