package pac1;

import net.bytebuddy.dynamic.scaffold.TypeWriter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class dr {

    WebDriver driver;


    @Test
    public void et() {
        {

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
            driver.manage().deleteAllCookies();

            driver.get("https://checkout.stripe.dev/");

            driver.findElement(By.xpath("//button[starts-with(text(), 'View')]")).click();

String title=
            driver.getTitle();
            System.out.println(title);
        }





        }

    }



