package pac1;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;


public class Getreqss {

    @Test
    public void geeTest()
    {


        given().when().get("https://fake-json-api.mock.beeceptor.com/users").then().statusCode(200)
                .log().all();


        Response response= RestAssured.given().log().all().when().get("https://fake-json-api.mock.beeceptor.com/companies");
       int statuscode= response.getStatusCode();
        System.out.println(statuscode);








    }
}


