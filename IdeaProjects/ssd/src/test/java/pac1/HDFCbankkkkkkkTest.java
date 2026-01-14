package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HDFCbankkkkkkkTest {


    WebDriver driver;

    @Test
    public void seTest()    {

        ChromeOptions co=new ChromeOptions();
        co.addArguments("--disable-notifications");

        driver = new ChromeDriver(co);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.hdfc.com/");
        System.out.println( driver.getTitle());
        driver.quit();;

    }

    @Test
    public void sesTest()    {

//
//        ChromeOptions co=new ChromeOptions();
//        co.addArguments("--disable-notifications");


         FirefoxOptions fo=new FirefoxOptions();
        fo.addArguments("--disable-notifications");
        fo.addArguments("--incognito");
        driver = new FirefoxDriver(fo);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.hdfc.com/");
        System.out.println( driver.getCurrentUrl());
        driver.quit();

    }



    @Test
    public void seddsTest()    {

//
//        ChromeOptions co=new ChromeOptions();
//        co.addArguments("--disable-notifications");


        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().deleteAllCookies();
        driver.get("https://www.hdfc.com/");
        System.out.println( driver.getCurrentUrl());
        driver.quit();

    }





    @Test
    public void seddddsTest() {

        try {


            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
            driver.manage().deleteAllCookies();
            driver.get("https://www.hdfc.com/");


            String text =
                    driver.findElement(By.xpath("//a[@id='lp-hover']")).getText();
            Assert.assertTrue(text.contains("Home Loan Products"));


            String text1 =
                    driver.findElement(By.xpath("//div[normalize-space()='Housing Loans']")).getText();
            Assert.assertTrue(text1.contains("Housing Loans"));
            //text1.contains("Housing Loans");


            String text22 = driver.findElement(By.xpath("//select[starts-with(@id, 'lang')]")).getText();
            Assert.assertTrue(text22.contains("English"));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();


        }


    }

        @Test
        public void sedsddsTest()    {

//
//        ChromeOptions co=new ChromeOptions();
//        co.addArguments("--disable-notifications");


            driver = new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
            driver.manage().deleteAllCookies();
            driver.get("https://www.hdfc.com/");

            System.out.println( driver.getWindowHandle());
           // driver.getWindowHandle()
        }



    }






