package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class ContainsPrac {

    public static WebDriver driver;

    public static void main(String[] args) {


            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
            driver.get("https://www.worldometers.info/coronavirus/country/india/");
            System.out.println(driver.getTitle());
            System.out.println( driver.getCurrentUrl());

        String text=driver.findElement(By.xpath("//img[@title='Worldometer']")).getText();

        System.out.println(text.contains("Worldometer"));




      //  driver.findElement(By.xpath("//img[@title='Worldometer']")).getText();
       // driver.getCurrentUrl()





    }
}
