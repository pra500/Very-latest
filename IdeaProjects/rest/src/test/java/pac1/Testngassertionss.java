package pac1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.openqa.selenium.interactions.SourceType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Testngassertionss {


    @Test
    public void testAssertiss()
    {

        //  https://api.nationalize.io/?name=nathaniel

        Response response= RestAssured.
        given().when().get("https://api.nationalize.io/?name=nathaniel");


       int code= response.getStatusCode();
       Assert.assertEquals(code, 200);




       //  HTTP/1.1 200 OK

     //   System.out.println(response.getStatusLine());

String s=

        response.getStatusLine();

        Assert.assertEquals(s, "HTTP/1.1 200 OK");




        System.out.println( response.getHeaders());
String hh=
response.getHeader("vary");
      Assert.assertEquals(hh, "accept-encoding");

        System.out.println( response.getSessionId());



        System.out.println( response.getCookies());

        System.out.println( response.getTime());


        System.out.println(response.getTimeIn(TimeUnit.SECONDS));













       // System.out.println(response.getTimeIn(504 ms));



    }
}
