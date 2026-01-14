package pac1;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class teeeee {

    @Test
    public void teeeeee(){

Response response=
        given().when().get("https://restful-api.dev/").then().statusCode(200).extract().response();

     //   String  s= response.getCookie();

        String  ss=response.getStatusLine();

        System.out.println(ss);


      int code =  response.getStatusCode();

        System.out.println(code);



    }
}
