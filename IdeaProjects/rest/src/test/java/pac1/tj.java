package pac1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;



import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class tj {





    WebDriver driver;


    @Test
    public void tTest(){

        given().when().get("https://fake-json-api.mock.beeceptor.com/users")
                .then().assertThat().statusCode(207);



    }


    @Test
    public void wtTest(){

        given().when().get("https://fake-json-api.mock.beeceptor.com/users")
                .then().assertThat().statusCode(200).body("[0].id", equalTo(19));



    }



    @Test
    public void wtsTest(){

        given().when().get("https://fake-json-api.mock.beeceptor.com/users")
                .then().assertThat().statusCode(200).body("[0].name", equalTo("Erick Aufderharddd"));



    }


    @Test
    public void wtwwsTest(){

        given().when().get("https://fake-json-api.mock.beeceptor.com/users")
                .then().assertThat().statusCode(200).body("[0].name", equalTo("Erick Aufderharddd"));



    }




    @Test
    public void wtssTest(){

        given().when().get("https://fake-json-api.mock.beeceptor.com/users")
                .then().assertThat().statusCode(200).body("[0].email", equalTo("Antossnette14@yahoo.com"));



    }


}
